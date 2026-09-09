/*Test Case 1 
1.Navigate EaseMyTrip and handle the notification popup.
2.Select One Way.
3.Enter any state  in the From field and select a valid suggestion.
4.Enter another state  in the To field and select a valid suggestion.
5.Click the Departure Date field.
6.Select any available future date from the calendar.
7.Click Traveller & Class.
8.Select 2 Adults and keep the class as Economy.
9.Click Search.
10.Verify that the flight-results page is displayed.
*/

package assessments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day3_TestCase1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// Create ChromeOptions to configure the browser
		ChromeOptions option=new ChromeOptions();
		// Disable browser notifications
		option.addArguments("--disable-notifications");	
		// Launch Chrome browser with the configured options
		WebDriver driver=new ChromeDriver(option);
		// Maximize the browser window
		driver.manage().window().maximize();
		// Set implicit wait for locating web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to EaseMyTrip website
		driver.get("https://easemytrip.com/");
		Thread.sleep(2000);
		// Select One Way trip
		driver.findElement(By.xpath("//li[@id='oway']")).click();
		Thread.sleep(2000);
		// Click the From field
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
		Thread.sleep(2000);
		
		// Select the required departure city
		driver.findElement(By.xpath("//input[@id='a_FromSector_show']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		// Select the departure city from the suggestions
		driver.findElement(By.xpath("//span[@id='spnBengaluru']")).click();
		Thread.sleep(2000);
		// Select the required destination city
		driver.findElement(By.xpath("//input[@id='a_Editbox13_show']")).sendKeys("Delhi");
		Thread.sleep(2000);
		// Select the destination city from the suggestions
		driver.findElement(By.xpath("//span[@id='spnNew Delhi']")).click();
		Thread.sleep(2000);
		// Navigate to the next month
		driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
		Thread.sleep(1000);
		// Select the required departure date
		driver.findElement(By.xpath("//li[@id='trd_0_15/11/2026']")).click();
		Thread.sleep(2000);	
		// Select the traveller details
		driver.findElement(By.xpath("//div[@id='myFunction4']")).click();
		Thread.sleep(2000);
		
		// Add a passenger
		driver.findElement(By.xpath("//button[@id='add']")).click();
		Thread.sleep(2000);
		// Select the Economy class
		driver.findElement(By.xpath("//input[@id='rbEconomy']")).click();
		Thread.sleep(2000);
		// Confirm the traveller and class selection
		driver.findElement(By.xpath("//a[@id='traveLer']")).click();
		Thread.sleep(2000);
		
		// Search for available flights
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		
		// Get the page title
		String title=driver.getTitle();
		// Verify whether the flight page is displayed
		if(title.contains("EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com"))
			System.out.println("Flight page is displayed");
		else
			System.out.println("Flight page is not displayed");
		
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}

/*
//Testcase 2
1.NAvigate to demo appa qspiders date picker---  (https://demoapps.qspiders.com/ui/datePick?sublist=0)
2.Click on calender.
3. Navigate to the next month in the current year.
4. Select any valid date from that month.
5. Verify that the selected date is displayed correctly in the date field.
*/
package assessments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_TestCase2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		 // Set an implicit wait to allow elements time to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Navigate to the Date Picker application
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(2000);
		
		// Click on the date input field to open the date picker
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(2000);
		
		// Click on the button to navigate to the required month
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);	
		
		// Select the required date from the date picker
		driver.findElement(By.xpath("//div[text()='14']")).click();
		Thread.sleep(2000);
		
		// Locate the date field and retrieve the selected date value
		WebElement df=driver.findElement(By.xpath("//input[@value='14/10/2026']"));
		System.out.println(df.getAttribute("value"));
		
		// Verify whether the expected date is displayed
		if(df.getAttribute("value").contains("14/10/2026"))
			System.out.println("selected date is displayed");
		else
			System.out.println("selected date is not displayed");
		
		Thread.sleep(2000);
		
		// Close the browser
		driver.quit();
	}

}

}
