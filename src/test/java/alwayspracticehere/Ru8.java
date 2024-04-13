package alwayspracticehere;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "html:target/myhtmlreports/rpt.html"},
		tags="reg"
	
)


public class Ru8 {

}
