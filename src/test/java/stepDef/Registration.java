package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
		}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.xpath(".//*[text()='Sign in']")).click();
		}

	@When("^user fills \"Email address textbox\" with$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("testuser1@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
	}
	@And("^user clicks \"create an account button\" $")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("SubmitCreate")).click();
		}
		
	@And("^user enters the following details$")
	public static void create_Registration()  throws Throwable {
	}

	@And("^user clicks \"register button\" $")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.id("SubmitAccount")).click();
	}

	@Then("^message displayed Registration Successful$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Registration Succesful");
	}

}
