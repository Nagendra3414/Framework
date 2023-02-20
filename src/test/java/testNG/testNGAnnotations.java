package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGAnnotations {

	WebDriver driver=null;
	@Test (priority = -1)
	public void launch() throws Exception
	{
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
	}
	
	
	@Test (priority = 2)
	public void login()
	{
		
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("login");
	}
	
	
	
	@Test (priority = 3)
	public void validating()
	{
		System.out.println("validating");
	}
	
	
	@Test (priority = 4)
	public void logout()
	{
		System.out.println("logout");
	}
	
	
	@Test (priority = 5)
	public void closeBrowser()
	{
		driver.close();
		System.out.println("closeBrowser");
	}
	
	
}
