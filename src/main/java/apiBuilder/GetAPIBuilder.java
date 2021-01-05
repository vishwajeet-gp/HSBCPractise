package apiBuilder;

import java.util.HashMap;
import java.util.Map;

public class GetAPIBuilder {
	
	public Map<String, String> getRequestBody(String id, String title, String auther){
		Map<String, String> body = new HashMap<String, String>();
		body.put("id", id);
		body.put("title", title);
		body.put("author", auther);
		
		
		return body;

}
}	
