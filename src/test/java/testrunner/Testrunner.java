package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mohan\\eclipse-workspace\\CucumberBDD\\src\\test\\java\\Feature",glue= {"Stepdef"},
plugin= {"pretty","json:target/jsonreport.json"}, monochrome=true)

public class Testrunner {
	
	
	

}
