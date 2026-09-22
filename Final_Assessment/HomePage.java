package Orange_HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement BuzzLink;
	public void getBuzzLink() {
		BuzzLink.click();
	}
}