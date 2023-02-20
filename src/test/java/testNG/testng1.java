package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng1 {

	
	@Test(priority=3 , invocationCount = 3)
	@Parameters({"abc"})
	public void method1(String name)
	{
		System.out.println(name);
	}
	
	
	@Test(priority=2, dataProvider="data")
	public void method2(String username, String password)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	
	
	@Test(priority=1)
	public void method3()
	{
		System.out.println("Automation2");
	}
	
	@DataProvider(name = "data")
	public Object[][] getData()
	{
		Object[][] UserPassword = new Object[2][2];
		
		UserPassword[0][0] = "ABCD@gmail.com";
		UserPassword[0][1] = "ABCD";
		UserPassword[1][0] = "efgh@gmail.com";
		UserPassword[1][1] = "efgh";
		
		
		return UserPassword;
		
	}
}
