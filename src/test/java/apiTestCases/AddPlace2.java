package apiTestCases;

// to fetch all types of dependencies we use .*
import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utilities.BaseClass;
import utilities.Payload;

// Ctrl+Shift+O to import the required ones and remove the unused ones

public class AddPlace2 extends BaseClass{
	
	     @Test
	     public void setAPIEnvironment() {
	    	 
	    	 RestAssured.baseURI="https://rahulshettyacademy.com";
	    	 
	    	HashMap< String, String> queryParms=new HashMap();
	    	queryParms.put("key", "qaclick123");
	 		String response  =given().spec(requestSpecification(queryParms))
	 				.body(new Payload().payload).log().all()
	 				.when().post("maps/api/place/add/json")
	 				.then().spec(responseSpecification()).extract().asString();
	 		
	 		
	 		
	    	 JsonPath rsp= new JsonPath(response);
	 		String place_id=rsp.getString("place_id");
	 		
	 		
	 		String actual=given().queryParam("key", "qaclick123")
	 				.queryParam("place_id", place_id)
	 				.when().get("maps/api/place/get/json")
	 				.then().log().all().statusCode(200).extract().asString();
	 		JsonPath rspactual= new JsonPath(actual);
	 		
	 		Assert.assertEquals("Mohali house", rspactual.getString("name"));
	 		
	 		given().queryParam("key", "qaclick123")
	 		.body(new Payload().updatePayload(place_id))
	 		.when().put("maps/api/place/update/json")
	 		.then().log().all().statusCode(200);
	 		
	 		
	    	 
	    	 
	    	 
	     }
	     

}
