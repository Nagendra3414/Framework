package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	
	//Properties
	public WebDriver driver;
	
	//Locators - Username, password,Login button
	
	@FindBy(xpath = "//*[@id ='user-name']")
	public WebElement username;
	
	
	@FindBy(xpath = "//*[@id ='password']")
	public WebElement password;
	
	
	@FindBy(xpath = "//*[@id ='login-button']")
	public WebElement LoginButton;
	
	
	//Locators - error msgs 
	
	@FindBy(xpath = "//*[text()='Epic sadface: Username is required']")
	public WebElement uidBlank;
	
	
	@FindBy(xpath = "//*[text()='Epic sadface: Username and password do not match any user in this service']")
	public WebElement uidRpwdInvalid;
	
	@FindBy(xpath = "//*[text()='Epic sadface: Password is required']")
	public WebElement pwdBlank;
	
	
	
	// Constructor method
	
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	// methods - opearational methods
	public void usernameEnter(String name)
	{
		username.sendKeys(name);
	}
	
	
	public void passwordEnter(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void loginClick()
	{
		LoginButton.click();
	}
	
	
	
	
}
