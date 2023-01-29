package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage login;   //= new LoginPage();   //object creation first part
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();      //here completed the object creation
	}
	
	@Test(enabled = false)
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(enabled = false)
	public void verifyCurrentUrlTest()
	{
		String expUrl = "https://www.saucedemo.com/";
		String actUrl = login.verifyCurrentyUrl();
		Assert.assertEquals(expUrl, actUrl);
	}
	
	
	
	@Test(enabled = false)
	public void verifyLoginLogoTest()
	{
		boolean result = login.verifyLoginLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test(enabled = false)
	public void verifyBotLogoTest()
	{
		boolean result = login.verifyBotLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void	verifyUrlTest1() throws	Exception
	{
	String expTitle	= "https://www.saucedemo.com/inventory.html";
	String	actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	}
	
	@Test
	public void	loginToAppTest() throws	Exception
	{
	String	expRes = "https://www.saucedemo.com/inventory.html";
	String	actRes = login.loginToApp();
	Assert.assertEquals(expRes,	actRes);
	}
	
	@Test	
	public void	verifyLabelofInventoryTest() throws	Exception
	{
	String	expRes ="PRODUCTS";
	String	actRes	= login.verifyLabelofInventory();
	Assert.assertEquals(expRes,	actRes);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	

}
