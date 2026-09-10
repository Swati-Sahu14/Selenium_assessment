package assessments.Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Configure implicit wait for element identification
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Navigate to the Zomato delivery page
		driver.get("https://www.zomato.com/bangalore/delivery");
		
		//click on log in
		driver.findElement(By.xpath("//button[text()='Log in']")).click();	
		Thread.sleep(1000);
		
		// Switch to the login iframe
		WebElement frame1 = driver.findElement(By.id("auth-login-ui"));
		driver.switchTo().frame(frame1);
		
		// Enter the registered mobile number
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("6363627208");
		
		// Switch back to the main page
		driver.switchTo().defaultContent();
		
		//verify whether it has came back to main page or not
		WebElement text = driver.findElement(By.xpath("//div[text()='Delivery']"));
		System.out.println(text.getText());
		
		//close the browser
		driver.quit();
	}
 
}