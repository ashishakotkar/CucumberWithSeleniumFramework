package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"/Users/3739748/eclipse-workspace/CucumberWithSeleniumFramework/src/test/java/features/addToCart.feature" },
		dryRun = false, //will not execute the functions for e.g. if you observe the print statements are not executed
		snippets = SnippetType.CAMELCASE, //to have the function names in camel case
		monochrome = true, //to remove junk characters in output
		glue="steps", //provide the package name where your step definition classes are
		plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
//		plugin = {"pretty", "html:CucumberReports",
//				"json:reports/result.json",
//				"junit:reports/result.xml"}
//		tags = {"@smoke and  @reg"}
		)

public class Runner extends AbstractTestNGCucumberTests{

}
