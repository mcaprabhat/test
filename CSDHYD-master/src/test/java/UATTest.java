package test.java;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.TestCase;
import main.java.RPNCalc;

public class UATTest extends TestCase{
	String inputData;
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter(String input) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		inputData = input;
		
	}

	@Then("^sytem display \"([^\"]*)\"$")
	public void sytem_display(String expectedOutput) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RPNCalc obj = new RPNCalc();
		assertEquals(Integer.parseInt(expectedOutput), obj.Calculate(inputData));
	}

}
