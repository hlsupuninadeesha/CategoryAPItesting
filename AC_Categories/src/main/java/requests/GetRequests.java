package requests;
import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class GetRequests {

	public Response getName(String baseURI,String basePath)
	{

		Response response = get(baseURI+basePath);
		System.out.println("Get neme running");
		return response;
	}

	public Response getCanrelist(String baseURI,String basePath)
	{
		Response response = get(baseURI+basePath);
		System.out.println("Get carname running");
		return response;

	}

	public Response getPromotions(String baseURI,String basePath)
	{
		Response response = get(baseURI+basePath);
		System.out.println("Get promotions running");
		return response;
	}



	public Response setURI(String baseURI,String basePath)
	{
		Response response = get(baseURI+basePath);
		System.out.println("Get uri running");
		return response;
	}



}
