package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Fileandenvn {

	public static Map<String, String> fileandenv = new HashMap<String, String>();
	public static Properties propMain = new Properties();
	public static Properties propPreSet = new Properties();

	public static Map<String, String> envAndFile() {

		String environment = System.getProperty("env");

		try {
			if (environment.equalsIgnoreCase("dev")) {

				FileInputStream fisDev = new FileInputStream(System.getProperty("user.dir") + "/inputs/dev.properties");
				propMain.load(fisDev);
				fileandenv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				

			} else if (environment.equalsIgnoreCase("qa")) {
				FileInputStream fisQA = new FileInputStream(System.getProperty("user.dir") + "/inputs/qa.properties");
				propMain.load(fisQA);
				fileandenv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				
			} else if (environment.equalsIgnoreCase("staging")) {
				FileInputStream fisStaging = new FileInputStream(System.getProperty("user.dir") + "/inputs/staging.properties");
				propMain.load(fisStaging);
				fileandenv.put("ServerUrl", propMain.getProperty("ServerUrl"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return fileandenv;

	}
	
	
	public static Map<String, String> getConfigReader(){
		if(fileandenv == null) {
			fileandenv = envAndFile();
		}
		
		
		return fileandenv;
		
	}

}
