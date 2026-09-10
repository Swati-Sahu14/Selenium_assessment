package assessments.Day_4;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Configure implicit wait for element identification
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Navigate to the Instagram application
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		// Identify all text fields available on the page
		List<WebElement> tf = driver.findElements(By.xpath("//input[@dir='ltr']"));
		System.out.println(tf.size());
		
		// Iterate through each text field to identify the required field
		for(WebElement ele : tf) 
		{
		    System.out.println(ele.getSize());
		    
		    // Identify the email field using its name attribute
		    if("email".equals(ele.getDomAttribute("name"))) 
		    {
		        ele.sendKeys("swathisahu14@gmail.com");
		    }
		}	
		
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();	
	}
}