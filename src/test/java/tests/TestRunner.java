package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.Login_Page;
import pages.YourCARTpage;

public class TestRunner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Login_Page login = new Login_Page(driver);
		HomePage home = new HomePage(driver);
		YourCARTpage cart = new YourCARTpage(driver);

		
		login.usernameEnter("standard_user");
		login.passwordEnter("secret_sauce");
		login.loginClick();

		home.logoDisplayed();
		home.AddCartItemClick();
		home.CartIconClick();

		cart.RemoveDisplay();

	}

}
