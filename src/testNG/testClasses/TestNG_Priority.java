package testNG.testClasses;

import org.testng.annotations.*;

public class TestNG_Priority {
	@BeforeClass
	public void setUp(){
		System.out.println("\nPriority: This runs once before class");
	}

	@AfterClass
	public void tearDown(){
		System.out.println("Priority: This runs once after class");
	}


	@Test(priority = 2)
	public void testMethod1(){
		System.out.println("Priority: Running testMethod1");
	}

	@Test(priority = 1)
	public void testMethod2(){
		System.out.println("Priority: Running testMethod2");
	}

	@Test(priority = 0)
	public void testMethod3(){
		System.out.println("Priority: Running testMethod3");
	}
}
