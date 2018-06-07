package testNG.testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import testNG.appCode.SomeClassToTest;

public class TestNG_Asserts {
    @Test
    public void testSum(){
        System.out.println("Running test --> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1,2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testMethod2(){
        System.out.println("Running test --> testString");
        SomeClassToTest obj = new SomeClassToTest();
        String expectedString = "Hello World";
        String result = obj.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);
    }

    @Test
    public void testMethod3(){
        System.out.println("Running test --> testArray");
        SomeClassToTest obj = new SomeClassToTest();
        int[] expectedArray = {1,2,3,4};
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
    }
}
