package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class PriorityTest extends TestBase {
	
	  LoginPage login;   //= new LoginPage();   //object creation first part      //here test cases are run by sequencely by giving priority
	                                                                              //priority is = -122,-122,0,1,2
	@BeforeMethod(alwaysRun = true)                                               //PASSED: verifyTitleTest2
	public void setup() throws Exception                                          //PASSED: verifyTitleTest3
	{                                                                             //PASSED: verifyTitleTest1
		initalization();                                                          //PASSED: verifyTitleTest5
		login = new LoginPage();      //here completed the object creation        //PASSED: verifyTitleTest4
	}
	
	@Test(priority = 0, groups = "Sanity")
	public void verifyTitleTest1() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(priority = -122)
	public void verifyTitleTest2() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(priority = -122)
	public void verifyTitleTest3() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(priority = 2)
	public void verifyTitleTest4() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(priority = 1)
	public void verifyTitleTest5() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
