package testNG.testClasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {
	@BeforeClass
	@Parameters({"browser", "platform"})
	public void setUp(String browser, String platform){
		System.out.println("\nTestNG_Parameters: This runs once before class");
		System.out.println("1. Parameter value from xml file: " + browser);
		System.out.println("2. Parameter value from xml file: " + platform);
	}

	@Test
	@Parameters({"response"})
	public void testMethod1(String response){
		String[] stringArray = response.split(",");
		System.out.println("TestNG_Parameters: Running testMethod1");
		System.out.println("Response from xml file: " + response);
		System.out.println("stringArray[0]: " + stringArray[0]);
		System.out.println("stringArray[1]: " + stringArray[1]);
	}
}
