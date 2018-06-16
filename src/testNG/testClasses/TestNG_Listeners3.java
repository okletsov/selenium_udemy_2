package testNG.testClasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// @Listeners(CustomListener2.class)
public class TestNG_Listeners3 {

    @BeforeClass
    public void setUp(){
        System.out.println("TestNG_Listeners3: This runs once before class");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("TestNG_Listeners3: This runs once after class");
    }

    @Test
    public void testMethod1(){
        System.out.println("TestNG_Listeners3: Running testMethod1");
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2(){
        System.out.println("TestNG_Listeners3: Running testMethod2");
        Assert.assertTrue(true);
    }
}
