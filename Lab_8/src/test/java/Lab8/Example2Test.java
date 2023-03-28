package Lab8;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.SetRequest;

public class Example2Test extends SetRequest {
	int userId = 40;
	@BeforeClass
	public void TC_when() {
		response = request.pathParam("userId", userId).get(base_URI+base_path);
	}
	@Test
	public void TS01_StatusCodeChecked() {
		assertEquals(response.getStatusCode(), 404, "Status code check failed");
	}
	@Test
	public void TS02_MessageChecked() {
		assertTrue(response.asString().contains("message"), "Message check failed");
	}
	@Test
	public void TS03_MessageContentChecked() {
		assertEquals(response.jsonPath().get("message"),"User not found!", "Message content check failed");
	}
}
