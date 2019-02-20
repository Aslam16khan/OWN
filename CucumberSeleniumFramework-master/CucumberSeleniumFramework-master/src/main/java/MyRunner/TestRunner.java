package MyRunner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.cucumber.listener.Reporter;
import com.qa.util.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import managers.FileReaderManager;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			//features = "D:/CucumberSeleniumFramework-master/CucumberSeleniumFramework-master/src/main/java/com/qa/features/CreateRequest.feature", //the path of the feature files
			features = "D:/CucumberSeleniumFramework-master/CucumberSeleniumFramework-master/src/main/java/com/qa/features",
			tags = {"@ALL"},
			glue={"stepsDefinition"}, //the path of the step definition files
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = false, //it will check if any step is not defined in step definition file
			dryRun = false, //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}		
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }
			)
	 
	public class TestRunner {
		

		@AfterClass
		public static void writeExtentReport() throws IOException {
			Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
			Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Windows");
	        Reporter.setTestRunnerOutput("Sample test runner output message");
	        Reporter.addScreenCaptureFromPath("D:/CucumberSeleniumFramework-master/CucumberSeleniumFramework-master/screenshots");
	    }
		

		
	}
	
	

	
	
 

