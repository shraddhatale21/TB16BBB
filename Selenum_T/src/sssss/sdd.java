package sssss;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class sdd {

	@BeforeClass
	public static void m1()

	{
		System.out.println("before");
	}
	@AfterClass
	public static void m2()
	{
		System.out.println("after");
	}
	@Before
	public void m3()
	{
		
	System.out.println("class1");	
	}
	@After
	public void m4()
	{
		System.out.println("class2");
	}
	@Test
	public void m5()
	{
		System.out.println("Test1");
	}
}
