package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login_Page;
import pages.YourCARTpage;

public class Test1 {

	public WebDriver driver;

	public Login_Page hpage;
	public YourCARTpage YCpage;
	public HomePage hmpage;

	@Test(priority = 1, enabled = false)
	public void launch() {
		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		hpage = new Login_Page(driver);
		YCpage = new YourCARTpage(driver);
		hmpage = new HomePage(driver);

	}

	@Test(priority = 2, dataProvider = "data")
	public void login(String uname, String pwd) throws Exception {

		driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		hpage = new Login_Page(driver);
		hpage.usernameEnter(uname);
		hpage.passwordEnter(pwd);
		hpage.loginClick();

		Thread.sleep(5000);

		driver.close();

	}

	@Test(priority = 3, enabled = false)
	@Parameters({ "Username", "Password", "uidCriteria", "pwdCriteria" })
	public void validation(String uname, String pwd, String uidCriteria, String pwdCriteria) {
		if (uname.length() == 0 && hpage.uidBlank.isDisplayed()) {
			Reporter.log("Username blank test case passed");

			Assert.assertTrue(true);
		} else if (uidCriteria.equalsIgnoreCase("invalid") && hpage.uidRpwdInvalid.isDisplayed()) {
			Reporter.log("Username Invalid test case passed");

			Assert.assertTrue(true);
		}

		else if (pwd.length() == 0 && hpage.pwdBlank.isDisplayed()) {
			Reporter.log("Password blank test case passed");

			Assert.assertTrue(true);
		} else if (pwdCriteria.equalsIgnoreCase("Invalid") && hpage.uidRpwdInvalid.isDisplayed()) {
			Reporter.log("Password invalid test case passed");

			Assert.assertTrue(true);
		} else if (hmpage.AddCart.isDisplayed()) {

			Reporter.log("test case passed");

			Assert.assertTrue(true);

		}
	}

	@Test(priority = 4, enabled = false)
	public void AddCart() throws Exception {

		hmpage.AddCartItemClick();
		hmpage.CartIconClick();

		Thread.sleep(5000);

		YCpage.RemoveDisplay();

		Reporter.log("cart item added successfully");

	}

	@Test(priority = 5)
	public void close() {

		driver.close();
	}

	@DataProvider(name = "data")
	public Object[][] getData() {
		Object[][] UserPassword = new Object[2][2];

		UserPassword[0][0] = "standard_user";
		UserPassword[0][1] = "secret_sauce";
		UserPassword[1][0] = "locked_out_user";
		UserPassword[1][1] = "secret_sauce";

		return UserPassword;

	}

}
