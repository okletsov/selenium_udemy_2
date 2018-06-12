package testNG.testClasses;

import org.testng.annotations.Test;

public class TestNG_Parallel2 {
	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("TestNG_Parallel2: Running testMethod1");
		Thread.sleep(6000);
		System.out.println("TestNG_Parallel2: Running testMethod1 --> More steps");
	}

	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_Parallel2: Running testMethod2");
		Thread.sleep(6000);
		System.out.println("TestNG_Parallel2: Running testMethod1 --> More steps");
	}
}
