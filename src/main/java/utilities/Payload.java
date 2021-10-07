package utilities;

import pojo.GetPlace;
import pojo.Location;

public class Payload {

	public String payload = "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n" + "  },\r\n" + "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Mohali house\",\r\n" + "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \"Sector, 69 Pancham\",\r\n" + "  \"types\": [\r\n" + "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n" + "  ],\r\n" + "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n" + "}\r\n" + "";

	public String updatePayload(String place_id) {

		String payload = "{\r\n" + "\"place_id\":\"" + place_id + "\",\r\n"
				+ "\"address\":\"70 Summer walk, CANADA\",\r\n" + "\"accuracy\":60,\r\n" + "\"key\":\"qaclick123\"\r\n"
				+ "}";

		return payload;

	}
	
	public GetPlace setPayload()
	{
		Location l= new Location();
		l.setLatitude("-38.383494");
		l.setLongitude("33.427362");
		GetPlace obj= new GetPlace();
		obj.setLocation(l);
		obj.setAccuracy("50");
		obj.setLanguage("English");
		obj.setName("Mohali House");
		obj.setTypes("shoe park");
		obj.setWebsite("apc.com");
		obj.setAddress("Sector, 69 Pancham");
		obj.setPhone_number("905454520");
		
		return obj;
		
	}
	
	
	
}