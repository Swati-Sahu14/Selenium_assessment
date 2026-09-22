package Final_Assessment1;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase4 {
	@Test
	public void demo() throws InterruptedException {
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("https://www.shoppersstack.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='MuiPaper-root MuiCard-root featuredProducts_productCard__xe40f MuiPaper-elevation1 MuiPaper-rounded aos-init aos-animate'])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("635789");
	WebElement ref = driver.findElement(By.id("Check"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.elementToBeClickable(ref));
	ref.click();
	String text =driver.findElement(By.id("Check Delivery-helper-text")).getText();
	System.out.println(text);
}
}
