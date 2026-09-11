/*TestCase-1
Launch SauceDemo.
Login using the valid credentials provided on the application.
On the Products page, use JavaScript Executor to scroll to the bottom of the page.
Take a screenshot of the page after scrolling.
Save the screenshot with a meaningful name such as products-page.png.
*/

package assessments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestCase1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		// Launch the Browser
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://www.saucedemo.com/");
		Thread.sleep(2000);

		// Enter the valid SauceDemo login details.
		WebElement username = d.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password = d.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement loginButton = d.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		Thread.sleep(3000);	

		// Scroll to the bottom of the Products page
		WebElement bottomEle = d.findElement(By.xpath("//div[@data-test='footer-copy']"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(false)",bottomEle);
		Thread.sleep(2000);

		// Save a screenshot of the page after scrolling
		TakesScreenshot tks = (TakesScreenshot)d;
		File src=tks.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Ss/products-page.png");
		FileHandler.copy(src, dest);

		// Close the browser
		d.quit();
	}
}

/*
TestCase-2
Navigate to Myntra application.
Search for any product.
Add the product to the wishlist.
Verify whether it is added or not.
*/

package assessments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to the Myntra application
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		//Search for any Product
		driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]")).sendKeys("flowers",Keys.ENTER);
		Thread.sleep(2000);
		
		
		//Add the Product to Wishlist
		WebElement ele = driver.findElement(By.xpath("(//span[@class='myntraweb-sprite product-notWishlistedIcon sprites-notWishlisted'])"));
		Thread.sleep(2000);
		
		//Typecast WebDriver to JavascriptExecutor(Downcast)
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//handling the hidden element
		js.executeScript("arguments[0].click()", ele);
		
		//verify whether product is added or not
		String url=driver.getCurrentUrl();
		if(url.contains("https://www.myntra.com/login?referer=https://www.myntra.com/flowers?rawQuery=flowers"))
			System.out.println("Product is added to wishlist");
		else
			System.out.println("Product is not added to wishlist");
		
		//close the browser
		Thread.sleep(5000);
		driver.quit();
		

	}
}
