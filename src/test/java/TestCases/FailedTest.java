package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.InventoryPage;
import Base.TestBase;
import Pages.LoginPage;
      //Failed test program
public class FailedTest extends TestBase {
	
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
	public void Test1()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void Test2()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);         //take false here
	}
	
	@Test
	public void Test3()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void Test4()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);          //take false here
	}
	
	@Test
	public void Test5()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, false);         //when we have to run only failed test cases then refresh the project select test output
	}                                               //and then select testng-failed.xml  and run test cases in that xml file
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
