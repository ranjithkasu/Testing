import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class POST {

	@Test
	public void postrequest() throws JSONException {

		RestAssured.baseURI = "https://shifudev.smartron.com";
		RequestSpecification request = RestAssured.given();
		request.header("Accept","application/json");
		request.header("Content-Type","application/json");
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("question", "hello"); // Cast
		requestParams.put("context", "{}");
		requestParams.put("disambiguation", false);
		requestParams.put("disambiguation_context", "{}");
		requestParams.put("skill_context", "[]");
		requestParams.put("force_skill", false);
		requestParams.put("client", "shifu");
		requestParams.put("target_user", "vijay.mohan@smartron.com");
		requestParams.put("latitude", 12.954353);
		requestParams.put("longitude",80.2434285 );
		requestParams.put("current_city", "chennai");
		requestParams.put("tz", 19800);
		requestParams.put("serial_number", "THOMEQA15abc50015");
		requestParams.put("debug", true);
		
		request.body(requestParams.toString());
		Response response = request.post("/api");
	
		int statusCode = response.getStatusCode();
		ResponseBody body = response.getBody();
		//System.out.println("response"+body.asString());
		body.prettyPrint();	
		Assert.assertEquals(statusCode, 200,"passed successfully");
		//Assert.assertEquals(resbody.answer.result, expected);
	}

}
