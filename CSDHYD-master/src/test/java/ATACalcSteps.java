package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class ATACalcSteps extends TestCase{
	private WebDriver driver;
	private String baseUrl;
	@Given("^user open \"([^\"]*)\" in browser$")
	public void user_open_in_browser(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		System.setProperty("webdriver.gecko.driver", "C:\\Test\\geckodriver.exe");
		driver = new FirefoxDriver();
	    baseUrl = arg1;
	    driver.get(baseUrl);
	    
	}

	@Given("^user enter (\\d+) and (\\d+)$")
	public void user_enter_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver.findElement(By.id("ID_nameField1")).clear();
	    driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(arg1));
	    driver.findElement(By.id("ID_nameField2")).clear();
	    driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(arg2));
	    driver.findElement(By.tagName("Button")).submit(); 
	}

	@When("^select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(arg1.equals("Multiply"))
		{
			driver.findElement(By.id("gwt-uid-2")).click();
		}
		else
		{
			driver.findElement(By.id("gwt-uid-1")).click();
		}
	}

	@When("^click on calculate$")
	public void click_on_calculate() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^result should (\\d+)$")
	public void result_should(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(arg1, Integer.parseInt(result));
		driver.quit();
	}

}
