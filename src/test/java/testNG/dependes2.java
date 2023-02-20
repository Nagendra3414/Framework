package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class dependes2 {

	WebDriver driver = null;

	@Test
	public void login() {

		driver = new ChromeDriver();
		driver.get("https://google.com/");
	}

	@Test(dependsOnMethods = { "login" })
	public void home() {
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = { "home" })
	public void close() {
		driver.close();
	}
}
