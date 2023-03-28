package com.api.auto.testcase;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.auto.utils.PropertiesFileUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_API_CreateWork {
	private String token;
	private Response response;
	
	//Tự tạo data
	private String myWork = "Tester";
	private String myExperience = "1 year";
	private String myEducation = "Funix Certification";
	
	@BeforeClass
	public void init() {
		String baseURL = PropertiesFileUtils.getProperty("baseurl");
		String createWorkPath = PropertiesFileUtils.getProperty("createWorkPath");
		String token = PropertiesFileUtils.getToken("token");
		RestAssured.baseURI = baseURL;
		RestAssured.basePath = createWorkPath;
		//Tạo body
		Map<String, Object> user = new HashMap<String, Object>();
		user.put("nameWork", myWork);
		user.put("experience", myExperience);
		user.put("education", myEducation);
		//Pre-requiste
		RequestSpecification request = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("token", token)
				.body(user);
		System.out.println("CREATE WORK REQUEST");
		System.out.println(request.log().all());
		//Thực thi POST request
		response = request.post();
		System.out.println("CREATE WORK RESPONSE");
		System.out.print(response.asPrettyString());
	}
	@Test (priority = 0)
	public void TC01_Validate201Created() {
		//Kiểm chứng Status Code
		assertEquals(response.getStatusCode(), 201, "Status code check failed!");
	}
	@Test (priority = 1)
	public void TC02_ValidateWorkId() {
		//Kiểm chứng trường 'id'
		assertTrue(response.asString().contains("id"), "Id field check failed!");
	}
	@Test (priority = 2)
	public void TC03_ValidateNameOfWorkMatched() {
		//Kiểm chứng tên công việc nhận được có giống lúc tạo
		assertEquals(response.jsonPath().getString("nameWork"), myWork, "Name work is not matched!");
	}
	@Test (priority = 3)
	public void TC04_ValidateExperienceMatched() {
		//Kiểm chứng kinh nghiệm nhận được có giống lúc tạo
		assertEquals(response.jsonPath().getString("experience"), myExperience, "Experience is not matched!");
	}
	@Test (priority = 4)
	public void TC05_ValidateEducationMatched() {
		//Kiểm chứng học vấn nhận được có giống lúc tạo
		assertEquals(response.jsonPath().getString("education"), myEducation, "Education is not matched!");
	}
}