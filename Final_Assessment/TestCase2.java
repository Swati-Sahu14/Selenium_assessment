package Final_Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		
		WebElement button = driver.findElement(By.id("slide"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.clickAndHold(button).moveByOffset(200, 0).release().perform();
		
		String ele=driver.findElement(By.xpath("//h3[text()='Mens Cotton Jacket']")).getText();
		if(ele.contains("Mens Cotton Jacket"))
			System.out.println("Mens Cotton Jacket is identified");
		else
			System.out.println("Mens Cotton Jacket not identified");

		Thread.sleep(4000);
		driver.quit();
	}

}
