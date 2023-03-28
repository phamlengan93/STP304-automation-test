package Lab8;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.SetRequest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Example1Test extends SetRequest {

	int userId =2;
	
	@BeforeClass
	public void when() {
		//userId yeu cau test
		//userId = 2;
		//goi POST va lay ve response
		response = request.pathParam("userId", userId).get(base_URI+base_path);
	}
	@Test
	public void TS01_StatusCodeChecked() {
		assertEquals(response.getStatusCode(), 200, "Status code check failed");
	}
	@Test
	public void TS02_IdChecked() {
		assertTrue(response.asString().contains("id"), "Id check failed");
	}
	@Test
	public void TS03_EmailChecked() {
		assertTrue(response.asString().contains("email"),"Email check failed");
	}
	@Test
	public void TS04_FirstNameChecked() {
		assertTrue(response.asString().contains("first_name"),"First name check failed");
	}
	@Test
	public void TS05_LastNameChecked() {
		assertTrue(response.asString().contains("last_name"),"Last name check failed");
	}
	@Test
	public void TS06_AvatarChecked() {
		assertTrue(response.asString().contains("avatar"),"Avatar check failed");
	}
	@Test
	public void TS07_UserIdChecked() {
		assertEquals(response.jsonPath().get("data.id"), userId, "Id check failed");
	}
	
}
