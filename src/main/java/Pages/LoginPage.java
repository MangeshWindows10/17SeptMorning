package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
	
	//Object Repository
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo; //here use Encapsulation  data member is private and method is public
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement userNameTextbox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextbox;
	@FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn;
	@FindBy(xpath = "//span[@class='title']") private WebElement productLabel;
	
	
	//use constructor below to initialize the elements of page
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle() throws Exception
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public String verifyCurrentyUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean verifyLoginLogo()
	{
		return loginLogo.isDisplayed();
	}
	
	public boolean verifyBotLogo()
	{
		return botLogo.isDisplayed();
	}
	
	/*public String loginToApp() throws Exception
	{
		userNameText.sendKeys("standard_user");
		Thread.sleep(1000);
		passwordText.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginButton.click();
		
		userNameText.sendKeys(ReadData.readPropertyFile("username"));
		// usernameTextbox.sendKeys(ReadData.readExcelFile(0,	0));
		passwordText.sendKeys(ReadData.readPropertyFile("password"));
		loginButton.click();
		return	driver.getCurrentUrl();     //change method void to string
	}*/
	
	public String loginToApp() throws Exception 
	{
		userNameTextbox.sendKeys(ReadData.readPropertyFile("username"));
		// usernameTextbox.sendKeys(ReadData.readExcelFile(0,	0));
		passwordTextbox.sendKeys(ReadData.readPropertyFile("password"));
		loginBtn.click();
		return	driver.getCurrentUrl();      //change method void to string
	
	}
	
	public	String verifyLabelofInventory() throws Exception
	{
		loginToApp();
		return	productLabel.getText();
	}

	
	
	
	

}
