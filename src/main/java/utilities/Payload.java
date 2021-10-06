package utilities;

public class Payload {
	
	public String payload="{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Mohali house\",\r\n"
			+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
			+ "  \"address\": \"Sector, 69 Pancham\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}\r\n"
			+ "";
	
	public String updatePayload(String place_id) {
	
	 String payload="{\r\n"
			+ "\"place_id\":\""+place_id+"\",\r\n"
			+ "\"address\":\"70 Summer walk, CANADA\",\r\n"
			+ "\"accuracy\":60,\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}";
	
	
		return payload;

}
}