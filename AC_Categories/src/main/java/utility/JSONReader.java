package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {

	public String readJSONFile(String filePath,String node) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser jsonparser = new JSONParser();
		//Object obj = jsonparser.parse(new FileReader(filePath));
		//JSONObject jsonobject = (JSONObject) obj;
		JSONObject jsonobject = (JSONObject) jsonparser.parse(new FileReader(filePath));
		String value = (String) jsonobject.get(node);
		return value ;
	}


}
