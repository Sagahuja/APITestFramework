package utilities;

import java.util.HashMap;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {

	
	public RequestSpecification requestSpecification(HashMap<String, String> queryparms)
	{
		
		
   	 RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON)
   			 .addQueryParams(queryparms).build();
   	 return req;
		
	}
	public ResponseSpecification responseSpecification()
	{
		ResponseSpecification res= new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		return res;
	}
}
