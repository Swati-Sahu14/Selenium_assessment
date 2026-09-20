package Assessments.Day_12;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruiterPage2 {
	WebDriver driver;
	public RecruiterPage2(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	// Locate the Vacancies link
	@FindBy(xpath = "//a[text()=\"Vacancies\"]")
	private WebElement vacancyLink;
	// Click the Vacancies link
	public void getvacancyLink() {
		vacancyLink.click();
	}
	// Locate the Add button
	@FindBy(xpath = "//button[normalize-space()=\"Add\"]")
	private WebElement addLink;
	// Click the Add button
	public void getAddLink() {
		addLink.click();
	}


}
