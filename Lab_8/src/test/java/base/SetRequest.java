package base;

import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SetRequest {
	protected String base_URI = "https://reqres.in/api/";
	protected String base_path = "users/{userId}";
	
	protected RequestSpecification request;
	protected Response response;
	
	@BeforeClass
	public void init() {
		request = given().contentType(ContentType.JSON);
	}
	
	
}
