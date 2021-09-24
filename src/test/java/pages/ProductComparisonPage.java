package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductComparisonPage {

	WebDriver driver;

	@FindBy(xpath = "//ul[@class='footer_link']//span[contains(text(), 'Continue Shopping')]")
	public WebElement continueShoppingButtonXP;
	
	}

	public ProductComparisonPage(WebDriver driver) {

		this.driver = driver;
	}

}