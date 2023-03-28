package demo;

import org.testng.annotations.Test;
import base.SetRequest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import data.UserInfo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Example1Test extends SetRequest {
//	private Response response;	//luu response của API
	private UserInfo user;	//thong tin request body
//	private ResponseBody resBody;	//body của response
//	private JsonPath bodyJson;	//body của response đã được convert sang JSON
	
	@BeforeMethod
	public void request() {
		//tao body mẫu
		user = new UserInfo ("Minh", "nam", 24, "Ky su");
		
		//thiet lap Endpoint
//		String base_url = "https://reqres.in/api/users/2";
//		String path_users = "users";
//		RestAssured.baseURI = "https://reqres.in";	//Setup BaseURI
//		RestAssured.basePath = "/api/users";	//Setup Base Path
		//tạo request
//		RequestSpecification req = RestAssured.given()
//			.contentType(ContentType.JSON)
//			.body(user);
		//gọi POST và lấy về response
		response = request.body(user).post(base_url + path_users);
//		resBody =response.getBody();
//		bodyJson = resBody.jsonPath();
	}
		@Test
		public void TC01_StatusCodeTest() {
			//kiểm tra HTTP status code = 201 không
			assertEquals(response.getStatusCode(), 201, "Status Check Failed");
		}
		@Test
		public void TC02_IdChecked() {
			//kiem tra phan hoi co chua truong id hay khong
			assertTrue(response.asString().contains("id"), "id field check failed");
		}
		@Test
		public void TC03_CreatedAtChecked() {
			//kiem tra phan hoi co chua truong createdAt hay khong
			assertTrue(response.asString().contains("createdAt"),"createdAt field check failed");
		}
		@Test
		public void TC04_verifyOnMatchingName() {
			//kiem tra phan hoi ten co giong voi request body khong
			String resName = response.jsonPath().get("name");
			assertEquals(user.getName(), resName, "Name is not matched");
		}
		@Test
		public void TC05_verifyOnMatchingGender() {
			//kiem tra phan hoi gioi tinh co giong voi request body khong
			String resGender = response.jsonPath().get("gender");
			assertEquals(user.getGender(),resGender, "Gender is not matched");
		}
		@Test
		public void TC06_verifyOnMatchingAge() {
			//kiem tra phan hoi tuoi co giong voi request body khong
			int resAge = response.jsonPath().get("age");
			assertEquals(user.getAge(), resAge, "Age is not matched");
		}
		@Test
		public void TC07_verifyOnMatchingJob() {
			//kiem tra phan hoi cong viec co giong voi request body khong
			String resJob = response.jsonPath().get("job");
			assertEquals(user.getJob(), resJob, "Job is not matched");
		}
//		@AfterClass
//		public void afterTest() {
//			//ket thuc test hien tai thi clear endpoint de chay tiep test lien sau trong testSuite
//			//co y nghia neu test sau khong su dung chung endpoint voi test hien tai
//			//vd test1.java: http://abc.com,  test2.java:https://xyz.com
//			RestAssured.baseURI = null;
//			RestAssured.basePath = null;
//		}
}
