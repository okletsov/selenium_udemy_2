package testNG.testClasses;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testNG.appCode.SomeClassToTest;

public class TestNG_SoftAsserts {
	@Test
	public void testSum(){
		System.out.println("Running test --> testSum");
		SoftAssert sa = new SoftAssert();
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1,2);
		sa.assertEquals(result, 2);
		System.out.println("Line after assert 1");
		sa.assertEquals(result, 3);
		System.out.println("Line after assert 2");
		sa.assertAll(); // figures out if any soft assert method failed and fail the test if there is
	}
}
