package tests;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import requests.GetRequests;
import static org.hamcrest.Matchers.*;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.IOException;
import utility.JSONReader;

public class TestsGetRequests {

	/*
	 * This is to run the project with testNG annotations
	 *  
	 *   
	 *   
	 *   
	 *   
	 *   */
	@Test
	public void runTests() throws FileNotFoundException, IOException, ParseException
	{
		//Create an object from json reader file
		JSONReader jsonreader = new JSONReader();
		//Read the json file from the given path and access node value and return as a string
		String baseURI = jsonreader.readJSONFile(".\\data\\wsData.json","BaseURI");
		String basePath = jsonreader.readJSONFile(".\\data\\wsData.json","BasePath");

		//Create object from the class where all get requests implemented
		GetRequests getrequests = new GetRequests();

		/* Either can create a single object or create object at each time 
		 * 
		 */



		//Asserting the body parameters in JSON get response
		Response response = getrequests.getName(baseURI,basePath);
		response.then().assertThat().body("Name",equalTo("Carbon credits"));
		System.out.println("Name Acceptance criteria is a sucess");

		//Asserting the body parameters in JSON get response
		//Response responsecanlist = getrequests.getCanrelist(baseURI,basePath);
		response.then().assertThat().body("CanRelist",equalTo(true));
		System.out.println("CanRelist Acceptance criteria is a sucess");


		//Asserting the body parameters in JSON get response
		//Response  responsepromotion = getrequests.getPromotions(baseURI,basePath);
		response.then().assertThat().body("Promotions[1].Name",equalTo("Gallery"),"Promotions[1].Description",equalTo("Good position in category"));		
		System.out.println("Promotions Acceptance criteria is a sucess");

	}

}
