package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
     //program for invocation count and timeout
public class DemoTest extends TestBase {
	
	  LoginPage login;   //= new LoginPage();  
		
		@BeforeMethod
		public void setup() throws Exception
		{
			initalization();
			login = new LoginPage();    
		}
		
		@Test(invocationCount = 1, enabled = false)      //invocation count means single test case runs multiple times by giving numbers
		public void verifyTitleTest() throws Exception
		{
			String expTitle = "Swag Labs";
			String actTitle = login.verifyTitle();
			Assert.assertEquals(expTitle, actTitle);
			Reporter.log("Title of web application:- " + actTitle);
		}
		
		@Test(timeOut = 3000)    //Time out means when test case didnt run within given time then shows = didn't finish within the time-out 1000
		public void verifyTitleTest1() throws Exception                      //that is = ThreadTimeoutException occurs
		{
			String expTitle = "1Swag Labs";
			String actTitle = login.verifyTitle();
			Assert.assertEquals(expTitle, actTitle,"Test case fail jhali ka");
			System.out.println("This is test case of title");
			Reporter.log("Title of web application:- " + actTitle);
			Assert.assertTrue(true);
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			driver.close();
		}

}
