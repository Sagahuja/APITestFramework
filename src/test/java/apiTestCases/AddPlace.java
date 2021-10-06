package apiTestCases;

// to fetch all types of dependencies we use .*
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import utilities.Payload;

// Ctrl+Shift+O to import the required ones and remove the unused ones

public class AddPlace {
	
	     @Test
	     public void setAPIEnvironment() {
	    	 
	    	 RestAssured.baseURI="https://rahulshettyacademy.com";
	    	 String response =given().queryParam("key", "qaclick123")
	 				.body(new Payload().payload).log().all()
	 				.when().post("maps/api/place/add/json")
	 				.then().log().all().statusCode(200).extract().asString();
	 		
	 		
	 		
	    	 JsonPath rsp= new JsonPath(response);
	 		String place_id=rsp.getString("place_id");
	 		
	 		
	 		String actual=given().queryParam("key", "qaclick123").queryParam("place_id", place_id)
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
