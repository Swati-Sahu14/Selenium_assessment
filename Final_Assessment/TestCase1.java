package Final_Assessment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement btn1 = driver.findElement(By.id("tog"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].removeAttribute('disabled');", btn1);
		js.executeScript("arguments[0].click()",btn1);
		Thread.sleep(2000);
		
		WebElement btn2 = driver.findElement(By.id("togg"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].removeAttribute('disabled');", btn2);
		js.executeScript("arguments[0].click()",btn2);
		
		WebElement btn3 = driver.findElement(By.id("toggl"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].removeAttribute('disabled');", btn3);
		js.executeScript("arguments[0].click()",btn3);
		
		WebElement btn4 = driver.findElement(By.id("toggler"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].removeAttribute('disabled');", btn4);
		js.executeScript("arguments[0].click()",btn4);
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Place Order']"));
		ele.click();
		
		String text = driver.findElement(By.cssSelector("[class='text-center pt-3 text-lg']")).getText();
		
		if(text.contains("Your Order has been successfully placed!")) {
			System.out.println("order is verified");
		}
		
	}

}
