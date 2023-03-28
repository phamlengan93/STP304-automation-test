package base;

import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SetRequest {
	protected String base_url = "https://reqres.in/api/";
	protected String path_users = "users";
	
	protected RequestSpecification request;
	protected Response response;
	@BeforeClass
	public void init() {
		request = given().contentType(ContentType.JSON);
	}
}
