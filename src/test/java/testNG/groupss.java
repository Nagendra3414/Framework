package testNG;

import org.testng.annotations.Test;

public class groupss {

	
	@Test(groups= {"Regression"})
	public void method1()
	{
		System.out.println("Regression test case _ class2");
	}
	
	@Test(groups= {"Sanity"})
	public void method2()
	{
		System.out.println("Sanity test case _ class2");
	}
	
	
	@Test(groups= {"Regression"})
	public void method3()
	{
		System.out.println("Regression test case _ class2");
	}
	
	
	@Test(groups= {"Smoke"})
	public void method4()
	{
		System.out.println("Smoke test case _ class2");
	}
	
	@Test(groups= {"Sanity"})
	public void method5()
	{
		System.out.println("Sanity test case _ class2");
	}
	
	
	@Test(groups= {"Smoke"})
	public void method6()
	{
		System.out.println("Smoke test case _ class2");
	}
}
