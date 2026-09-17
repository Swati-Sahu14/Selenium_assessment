package pomUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauce_HomePage {
	WebDriver driver;

	public Sauce_HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']/../../..//button")
	private WebElement addToCart;
	
	@FindBy(xpath = "//span[text()='1']")
	private WebElement cart;
	
	public void clickAddToCart()
	{
		addToCart.click();
	}
	
	public boolean verifyProductPage(String value)
	{
		
		if(driver.getCurrentUrl().contains(value))
			return true;
		else
			return false;
	}
	
	public void verifyCartContains1item(String value)
	{
		if(cart.getText().equals(value))
			System.out.println("Cart contains 1 item");
		else
			System.out.println("Cart does not contain 1 item");
	}
	
	public void clickCartLink()
	{
		cart.click();
	}
}
