package testNG;

import org.testng.annotations.Test;

public class groups {
	
	
	
	//@test
	//priority
	//InvocationCount
	//Groups
	//enable
	//Parameters
	//DataProvider
	//DependsOnMethods
	//Parallel
	
	
	
	
	@Test(groups= {"Regression", "Smoke"})
	public void method1()
	{
		System.out.println("Regression and Smoke test case");
	}
	
	@Test(groups= {"Sanity"})
	public void method2()
	{
		System.out.println("Sanity test case");
	}
	
	
	@Test(groups= {"Regression"})
	public void method3()
	{
		System.out.println("Regression test case");
	}
	
	
	@Test(groups= {"Regression"})
	public void method4()
	{
		System.out.println("Regression test case");
	}
	
	
	@Test(groups= {"Sanity"})
	public void method5()
	{
		System.out.println("Sanity test case");
	}
	
	
	@Test(groups= {"Sanity"})
	public void method6()
	{
		System.out.println("Sanity test case");
	}
	
	
	@Test(groups= {"Regression"})
	public void method7()
	{
		System.out.println("Regression test case");
	}
	
	
	@Test(groups= {"Regression"})
	public void method8()
	{
		System.out.println("Regression test case");
	}
	
	
	@Test(groups= {"Sanity"})
	public void method9()
	{
		System.out.println("Sanity test case");
	}
	
	
	@Test(groups= {"Regression"})
	public void method10()
	{
		System.out.println("Regression test case");
	}

}
