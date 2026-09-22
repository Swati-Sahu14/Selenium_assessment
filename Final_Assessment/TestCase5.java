package Final_Assessment2;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Orange_HRM.HomePage;
import Orange_HRM.base_class;
import Orange_HRM.buzzPage;

public class TestCase5 extends base_class{
	@Test
	public void Test() throws IOException, InterruptedException {
		
		HomePage h = new HomePage(d);
		h.getBuzzLink();
		Thread.sleep(2000);
		
		buzzPage b = new buzzPage(d);
		//pass the text to post
		b.getTextfield();
		Thread.sleep(3000);
		//click on post
		b.getPostbtn();
		Thread.sleep(4000);
		//verify it is posted or not
		System.out.println(b.getVerify());
		Assert.assertTrue(b.getVerify());
		System.out.println("posted and verified");
	}
}
		
	
	