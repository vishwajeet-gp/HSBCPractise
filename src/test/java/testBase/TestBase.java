package testBase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import utils.ExtentReportListener;
import utils.Fileandenvn;

@Listeners(ExtentReportListener.class)
public class TestBase extends ExtentReportListener{
	
	@BeforeClass
	public void baseTest() {
		
		RestAssured.baseURI = Fileandenvn.envAndFile().get("ServerUrl");
	}

}
