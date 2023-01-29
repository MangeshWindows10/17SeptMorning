package TestCases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class GroupTest extends TestBase {
	
    LoginPage login;   //= new LoginPage();   //object creation first part
	
	@BeforeMethod(alwaysRun = true)
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();      //here completed the object creation
	}
	
	@Test(groups = {"Sanity","Regression"})
	public void Test1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(groups = "Smoke")
	public void Test2() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(groups = {"Sanity","Regression"})
	public void Test3() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(groups = "Sanity")
	public void Test4() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
