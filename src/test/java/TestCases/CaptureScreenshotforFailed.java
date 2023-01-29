package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.UtilityMethod;

public class CaptureScreenshotforFailed extends TestBase {
	
	LoginPage login;   //= new LoginPage();   
	
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();     
	}
	
	@Test(enabled = true,groups = "Regression")
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(enabled = false)
	public void	verifyUrlTest1() throws	Exception
	{
	String expTitle	= "Swag Labs";
	String	actTitle = login.verifyTitle();
	Assert.assertEquals(expTitle, actTitle);
	Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(enabled = false)
	public void	loginToAppTest() throws	Exception
	{
	String	expRes = "https://www.saucedemo.com/inventory.html";
	String	actRes = login.loginToApp();
	Assert.assertEquals(expRes,	actRes);
	Reporter.log("Title of web application:- " + actRes);
	}
	
	@Test(enabled = false)
	public void	verifyLabelofInventoryTest() throws	Exception
	{
	String	expRes ="PRODUCTS";
	String	actRes	= login.verifyLabelofInventory();
	Assert.assertEquals(expRes,	actRes);
	Reporter.log("Title of web application:- " + actRes);
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE==a.getStatus())
		{
		//	System.out.println(ITestResult.FAILURE);
		//	System.out.println(a.getStatus());
			UtilityMethod.captureScreenshot(a.getName());
		}
		driver.close();
	}
	

}
