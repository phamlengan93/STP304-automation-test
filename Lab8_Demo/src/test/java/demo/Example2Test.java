package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.*;
import data.UserInfo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Example2Test {
	private Response response;
	private UserInfo user;
	private ResponseBody resBody;
	private JsonPath bodyJson;
	
	@BeforeClass
	public void init() {
		user = new UserInfo (null, "nam", 24, "Ky su");
		RestAssured.baseURI = "https://reqres.in"; //Setup BaseURI
		RestAssured.basePath = "/api/users";	//Setup BasePath
		//create request
		RequestSpecification req = RestAssured.given()
			.contentType(ContentType.JSON)
			.when()
			.body(user);
		//take a post & get response
		response = req.post();
		resBody = response.getBody();
		bodyJson = response.jsonPath();
		}
	
	@Test
	public void TC01_StatusCodeTest() {
		//Verify the http response status returned. Check Status Code is 401?
		assertEquals(response.getStatusCode(), 401, "Status check failed");
	}
	@Test
	public void TC02_MessageChecked() {
		assertEquals(true, resBody.asString().contains("message"), "Message field check failed");
	}
	@Test
	public void TC03_verifyOnMessageContainName() {
		String resName = bodyJson.get("message");
		if (null == resName)resName = "";
		assertEquals(true, resName.contains("name"),"Message not contain invalid field");
	}
	
//	@AfterClass
//	public void afterTest() {
//		//reset Values
//		RestAssured.baseURI = null;
//		RestAssured.basePath = null;
//	}
}
