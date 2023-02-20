package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	WebDriver driver = null;

	@AfterMethod
	public void After() {
		driver.close();
	}

	@BeforeMethod
	public void Before() {
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

	}

	@Test
	public void test1() {

		String title = driver.getTitle();

		System.out.println(title);
	}

	@Test
	public void test2() {

		String URL = driver.getCurrentUrl();
		System.out.println(URL);

	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfetrTest");
	}
	
	
	@BeforeClass
	public void bbeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	
	
	@Test
	public void test3()
	{
		System.out.println("Test 3");
	}

}
