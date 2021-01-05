package testAPI;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import utils.HWinConversion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.APIPath;
import apiVerification.APIVerify;
import testBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETAPITest6 extends TestBase{
	
	@Test
	public void getAPITest() {
		
		//RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(400);
		test.log(LogStatus.INFO, "My test is starting......");
		
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_SPECIFIC_DATE_FOREIGN_EXCHANGE_RATE_WITH_BASE);
		
		APIVerify.responseCodeValiddation(response, 400);
		APIVerify.responseTimeValidation(response);
	
		
		test.log(LogStatus.INFO, "My test is ended......");
		

	}
	
	
	@Test
	public void getAPITest1() {
		
		RestAssured.given().when().get(APIPath.apiPath.GET_SPECIFIC_DATE_FOREIGN_EXCHANGE_RATE_WITH_BASE).then().log().all().statusCode(400);
		
		
		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_SPECIFIC_DATE_FOREIGN_EXCHANGE_RATE_WITH_BASE);
		
		System.out.println(response.getBody().asString());
		
		System.out.println(response.getStatusCode());
		
    	System.out.println(response.getCookies());
		
	    System.out.println(response.getTime());
		
		}
		
	}
	
	


