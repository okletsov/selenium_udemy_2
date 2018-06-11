package testNG.testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {
	@BeforeClass(alwaysRun = true)
	public void setUp(){
		System.out.println("This runs once before class");
	}

	@AfterClass(alwaysRun = true)
	public void tearDown(){
		System.out.println("This runs once after class");
	}


	@Test(groups = {"cars", "suv"})
	public void testBMW(){
		System.out.println("Running test: BMW X6");
	}

	@Test(groups = {"cars", "sedan"})
	public void testAudi(){
		System.out.println("Running test: Audi A6");
	}

	@Test(groups = {"bikes"})
	public void testHonda(){
		System.out.println("Running test: Honda");
	}

	@Test(groups = {"bikes"})
	public void testKawasaki(){
		System.out.println("Running test: Kawasaki");
	}
}
