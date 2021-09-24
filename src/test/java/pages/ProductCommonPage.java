package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCommonPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='quantity_wanted']")
	public WebElement quantityInputXP;

	@FindBy(xpath = "//div[@class='box-info-product']//select[@id='group_1']")
	public WebElement sizeSelectorXP;

	@FindBy(xpath = "//div[@class='box-info-product']//button[@name='Submit']")
	public WebElement addToCartsButtonXP;

	@FindBy(xpath = "//div[@class='box-info-product']//a[@id='wishlist_button']")
	public WebElement addToWishListButtonXP;
	
	
	public WebElement getQuantityButton(String buttonType, WebDriver driver) {

		return driver.findElement(
				By.xpath("//div[@class='box-info-product']//a[contains(@class, 'button-" + buttonType + "')]"));
	}
	
	public WebElement getColorSelector(String color, WebDriver driver) {

		return driver.findElement(
				By.xpath("//div[@class='box-info-product']//a[@name='"+color+"']"));
	}

	
	public WebElement selectSmallImage(String imageID, WebDriver driver) {

		return driver.findElement(
				By.xpath("//img[@id='"+imageID+"']"));
	}


	public ProductCommonPage(WebDriver driver) {

		this.driver = driver;
	}

}