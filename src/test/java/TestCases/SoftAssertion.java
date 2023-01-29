package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.InventoryPage;
import Base.TestBase;
import Pages.LoginPage;
     //Soft assertion program
public class SoftAssertion extends TestBase {
	
	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
		invent = new InventoryPage();
		login.loginToApp();
	}
	
	@Test(enabled = true)
	public void verifyPeekLogoTest()
	{
		System.out.println("Execution started");
		SoftAssert soft = new SoftAssert();            //in soft assertion we have to create object
		boolean result = invent.verifyPeekLogo();
		soft.assertEquals(result, true);              //here by taking false test case will fail
	//	Assert.assertEquals(result, false);
		System.out.println("Execution ended");
		soft.assertAll();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
