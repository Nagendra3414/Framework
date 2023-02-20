package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAnno {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");

	}

	@BeforeClass
	public void before() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public void after() {
		System.out.println("AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");

	}

	@AfterMethod
	public void After() {
		System.out.println("after method");
	}

	@BeforeMethod
	public void Before() {
		System.out.println("BeforeMethod");

	}

	@Test
	public void test() {
		System.out.println("Test");
	}

}
