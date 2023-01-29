package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.InventoryPage;
import Base.TestBase;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase {
	
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
	
	@Test
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void addProductTest() throws Exception
	{
		String result = invent.addProduct();
		Assert.assertEquals(result, "3");
		Reporter.log("Total product added = " + result);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
