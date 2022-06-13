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

	@Test
	public void runTests() throws FileNotFoundException, IOException, ParseException
	{

		JSONReader jsonreader = new JSONReader();
		String baseURI = jsonreader.readJSONFile(".\\data\\wsData.json","BaseURI");
		String basePath = jsonreader.readJSONFile(".\\data\\wsData.json","BasePath");


		GetRequests getrequests = new GetRequests();
		//Response response = getrequests.setURI(baseURI,basePath);
		Response responsename = getrequests.getName(baseURI,basePath);
		responsename.then().assertThat().body("Name",equalTo("Carbon credits"));
		System.out.println("Name Acceptance criteria is a sucess");


		Response responsecanlist = getrequests.getCanrelist(baseURI,basePath);
		responsecanlist.then().assertThat().body("CanRelist",equalTo(true));
		System.out.println("CanRelist Acceptance criteria is a sucess");


		Response  responsepromotion = getrequests.getPromotions(baseURI,basePath);
		responsepromotion.then().assertThat().body("Promotions[1].Name",equalTo("Gallery"),"Promotions[1].Description",equalTo("Good position in category"));		
		System.out.println("Promotions Acceptance criteria is a sucess");

	}

}
