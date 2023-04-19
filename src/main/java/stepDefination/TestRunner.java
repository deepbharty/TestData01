package stepDefination;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src\\main\\java\\features\\FbUserRegistration.feature",glue={"stepDefination"},
//@CucumberOptions(features="src\\main\\java\\features\\GoogleSearch.feature.feature",glue={"stepDefination"},
monochrome = true,

plugin = { "pretty", "html:target/Cucumber-reports/report.html","json:target/Cucumber-reports/cucumber.json"})

// ,"pretty",  "junit:target/reports/cucumber.xml"})

public class TestRunner {
}



