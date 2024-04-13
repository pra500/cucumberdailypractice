package tests;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//for testng - u ve to remove everything wrt JUNIT

//just a point:
//remore this line also;  @RunWith(Cucumber.class)

//ll try to run from maven also later; working fine but o/p not coming






@CucumberOptions(plugin= {"pretty", "html:target/myhtmlreports/rpt.html",
		                            "json:target/myjsonreports/rpt.json",
		                            
                           } 
                           
                 )  


                 
public class RunnerRunner extends AbstractTestNGCucumberTests{
	
	

}

