package testNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 {

	@BeforeClass
	public void BeforeCls()
	{
		System.out.println("This is BeforeClass");
	}

	

	@Test
	public void test1() {
		System.out.println("This is test1 in Annotation2");
	}

	@Test
	public void test2() {
		System.out.println("This is test2 in Annotation2");
	}
}
