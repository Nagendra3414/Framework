package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {

	
	@Test (invocationCount =5)
	@Parameters({"username", "password"})
	public void login(String a, String b)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("user-name")).sendKeys(a);
		
		driver.findElement(By.id("password")).sendKeys(b);
		
		driver.findElement(By.id("login-button")).click();
		driver.close();

	}
}
