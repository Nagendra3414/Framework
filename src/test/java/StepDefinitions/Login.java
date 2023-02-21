package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Login_Page;

public class Login {

	WebDriver driver = null;
	Login_Page lp = null;
	HomePage hp = null;
	

	

	@Before(order = 2)
	public void method1() {
		System.out.println("I am before1 condition");
		
		System.out.println("GitHub");
		
		
		System.out.println("Second user changes");
	}

	@Before(order = 1)
	public void method3() {
		System.out.println("I am before2 condition");
	}

	@After
	public void method2() {
		System.out.println("I am after condition");
	}

	@Given("^Launch the Url$")
	public void launch_the_url() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		System.out.println("Launch the Url");
		
		System.out.println("Added another line");
	}

	@When("^homepage should open$")
	public void homepage_should_open() {

		System.out.println("homepage should open");
	}

	@Then("^Enter Username$")
	public void enter_username() {

		driver.findElement(By.xpath("//*[@id ='user-name']")).sendKeys("standard_user");
		System.out.println("Enter Username");
	}

	@Then("^Enter password$")
	public void enter_password() {

		driver.findElement(By.xpath("//*[@id ='password']")).sendKeys("secret_sauce");
		System.out.println("Enter password");
	}

	@Then("^close$")
	public void close() {

		driver.close();
		System.out.println("Close");
	}

	@And("^Click on login$")
	public void click_on_login() throws Exception {
		lp = new Login_Page(driver);
		lp.loginClick();

		System.out.println("Click on login");
		
		hp = new HomePage(driver);
		hp.logoDisplayed();
		
		Thread.sleep(3000);
		
		hp.AddCartItemClick();
		Thread.sleep(3000);
		hp.CartIconClick();
		Thread.sleep(3000);
	
		
		
	}

	@Then("^Enter invalid Username$")
	public void enter_invalid_username() {

		lp = new Login_Page(driver);
		lp.usernameEnter("Nagendra");
	
	}

	@Then("^Enter invalid password$")
	public void enter_invalid_password() {
		
		lp = new Login_Page(driver);
		lp.passwordEnter("Nag");
	}

	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
	}

	@Then("print something")
	public void print_something() {
		System.out.println("*************************************************************************");
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password(DataTable data) throws Exception {

		List<List<String>> obj = data.asLists();

		String username = obj.get(0).get(0);
		String password = obj.get(0).get(1);

		lp = new Login_Page(driver);

		lp.usernameEnter(username);
		lp.passwordEnter(password);

		Thread.sleep(5000);

	}

	@When("^user enters (.+) and (.+)$")
	public void user_enters_and(String username, String password) throws Throwable {

		lp = new Login_Page(driver);

		lp.usernameEnter(username);
		lp.passwordEnter(password);

	}

	@Then("again open browser")
	public void again_open_browser() {
		System.out.println("again open browser");
		throw new io.cucumber.java.PendingException();
	}

}
