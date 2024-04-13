package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "html:target/myhtmlreports/rpt.html",
        "json:target/myjsonreports/rpt.json",
        
} 
)  
public class Ry {

}
