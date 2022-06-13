package requests;
import  static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class GetRequests {

	/* * These methods are used to pass the URL parameters and return json response in order to assert at run time
	 * This pattern can be used with other CURD operations to increase the usability and mainatainability of the code
	 * Requirement was only to seert get response for now but can further develop this for other requests as well.


	 */

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
