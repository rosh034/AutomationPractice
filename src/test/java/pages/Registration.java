package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class Registration extends WebDriverCommonLib {

	@FindBy(xpath = oracle_PageObjects.Checkout_Xpath)
	private WebElement Checkout;

	@FindBy(xpath = oracle_PageObjects.Login_Xpath)
	private WebElement Login;

	@FindBy(xpath = oracle_PageObjects.Email_Xpath)
	private WebElement Email;

	@FindBy(xpath = oracle_PageObjects.Password_Xpath)
	private WebElement Password;

	@FindBy(xpath = oracle_PageObjects.RegEmail_Xpath)
	private WebElement RegeEmail;

	@FindBy(xpath = oracle_PageObjects.Submit_Xpath)
	private WebElement SubmitButton;

	@FindBy(xpath = oracle_PageObjects.Gender_Xpath)
	private WebElement Gender;

	@FindBy(xpath = oracle_PageObjects.Firstname_Xpath)
	private WebElement Firstname;

	@FindBy(xpath = oracle_PageObjects.Lastname_Xpath)
	private WebElement Lastname;

	@FindBy(xpath = oracle_PageObjects.Pwd_Xpath)
	private WebElement Pwd;

	@FindBy(xpath = oracle_PageObjects.Days_Xpath)
	private WebElement Days;

	@FindBy(xpath = oracle_PageObjects.Months_Xpath)
	private WebElement Months;

	@FindBy(xpath = oracle_PageObjects.Years_Xpath)
	private WebElement Years;

	@FindBy(xpath = oracle_PageObjects.Address1_Xpath)
	private WebElement Address1;

	@FindBy(xpath = oracle_PageObjects.City_Xpath)
	private WebElement City;

	@FindBy(xpath = oracle_PageObjects.State_Xpath)
	private WebElement State;

	@FindBy(xpath = oracle_PageObjects.PostalCode_Xpath)
	private WebElement PostalCode;

	@FindBy(xpath = oracle_PageObjects.Country_Xpath)
	private WebElement Country;

	@FindBy(xpath = oracle_PageObjects.MobileNum_Xpath)
	private WebElement MobileNumber;

	@FindBy(xpath = oracle_PageObjects.Address2_Xpath)
	private WebElement Address2;

	@FindBy(xpath = oracle_PageObjects.SubmitAccount_Xpath)
	private WebElement Submit;

	@FindBy(xpath = oracle_PageObjects.Dresses_Xpath)
	private WebElement Dresses;

	@FindBy(xpath = oracle_PageObjects.CasualDresses_Xpath)
	private WebElement CasualDresses;

	@FindBy(xpath = oracle_PageObjects.PrintedDress_Xpath)
	private WebElement PrintedDress;

	@FindBy(xpath = oracle_PageObjects.AddToCart_Xpath)
	private WebElement AddToCart;

	@FindBy(xpath = oracle_PageObjects.CheckoutButton_Xpath)
	protected static WebElement CheckoutButton;

	@FindBy(xpath = oracle_PageObjects.AgreeCheckbox_Xpath)
	protected static WebElement AgreeCheckbox;

	@FindBy(xpath = oracle_PageObjects.PayByCheck_Xpath)
	protected static WebElement PayByCheck;

	@FindBy(xpath = oracle_PageObjects.ConfirmOrder_Xpath)
	protected static WebElement ConfirmOrder;

	@FindBy(xpath = oracle_PageObjects.BackToOrder_Xpath)
	protected static WebElement BackToOrder;

	@FindBy(xpath = oracle_PageObjects.OrderRef_Xpath)
	private WebElement OrderRef;

	// Method to "Create an account"
	public static void create_Registration() {
		try {

			driver.findElement(By.id("email_create")).sendKeys("markstone@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

			driver.findElement(By.id("id_gender2")).click();
			driver.findElement(By.id("customer_firstname")).sendKeys("Mark");
			driver.findElement(By.id("customer_lastname")).sendKeys("Stone");
			driver.findElement(By.id("passwd")).sendKeys("Galaxy@123");

			// select DOB
			WebElement date = driver.findElement(By.id("days"));
			Select oSelectDate = new Select(date);
			oSelectDate.selectByValue("15");

			// select month
			WebElement month = driver.findElement(By.id("months"));
			Select oSelectMonth = new Select(month);
			oSelectMonth.selectByValue("6");

			// select year
			WebElement year = driver.findElement(By.id("years"));
			Select oSelectYears = new Select(year);
			oSelectYears.selectByValue("1991");

			// create address

			// driver.findElement(By.id("firstname")).sendKeys("Mark");
			// driver.findElement(By.id("lastname")).sendKeys("Stone");
			driver.findElement(By.id("address1")).sendKeys("Elv street");

			driver.findElement(By.id("city")).sendKeys("Bangalore");

			// select state
			WebElement state = driver.findElement(By.id("id_state"));
			Select oSelectState = new Select(state);
			oSelectState.selectByValue("32");

			driver.findElement(By.id("postcode")).sendKeys("10001");

			// select country
			WebElement country = driver.findElement(By.id("id_country"));
			Select oSelectCountry = new Select(country);
			oSelectCountry.selectByValue("21");

			driver.findElement(By.id("phone_mobile")).sendKeys("9988776655");
			driver.findElement(By.id("alias")).sendKeys("Test address");

			driver.findElement(By.id("submitAccount")).click();
			
		} finally {
			driver.close();
		}
	}
	
}
