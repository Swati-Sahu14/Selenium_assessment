package assessments.Day_4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {

		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Configure an implicit wait for element synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Navigate to the BigBasket application
		driver.get("https://www.bigbasket.com/pb/boss/");
		Thread.sleep(2000);

		// Search for the required product
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apples");

		// Locate the matching product and add it to the basket
		List<WebElement> allmatches = driver.findElements(By.xpath("//div[@style='position: relative; overflow: hidden; width: 100%; height: auto; min-height: 0px; max-height: 60vh;']"));

		for (WebElement ele : allmatches) {
			driver.findElement(By.xpath("//span[text()='Indian Apple - Royal Gala, Economy']/../../..//button[text()='Add']")).click();
			Thread.sleep(2000);
		}

		// Verify that the product has been successfully added to the basket
		WebElement verify = driver.findElement(By.xpath("//p[text()='Item has been added to your basket successfully']"));

		// Display the verification result
		if (verify.isDisplayed())
			System.out.println(verify.getText());
		else
			System.out.println("Item has Not Added to your basket");

		Thread.sleep(2000);

		// Close the browser
		driver.quit();
	}
}

