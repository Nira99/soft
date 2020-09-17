package najah.edu.acceptancetest7;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "dr" ,
plugin = { "html:target/cucumber/wikipedia.html"},
monochrome = true ,
snippets =  SnippetType.CAMELCASE , 
glue = {"najah.edu.acceptancetest7"},
strict = true 
	)

public class accept {

}
