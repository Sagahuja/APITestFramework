package utilities;

public enum APIResources {

	APIGet("maps/api/place/get/json"),
	APIPost("maps/api/place/add/json"),
	APIDelete("maps/api/place/delete/json"),
	APIUpdate("maps/api/place/update/json");
	String method;
	
	APIResources(String method)
	{
		this.method=method;
	}
	public String getResource()
	{
		return method;
	}
}
