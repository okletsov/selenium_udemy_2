package com.okletsov.testNG.testClasses;

import listeners.CustomListener1;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(CustomListener1.class)
public class TestNG_Listeners1 {

    @BeforeClass
    public void setUp(){
        System.out.println("TestNG_Listeners1: This runs once before class");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("TestNG_Listeners1: This runs once after class");
    }

    @Test
    public void testMethod1(){
        System.out.println("TestNG_Listeners1: Running testMethod1");
        Assert.assertTrue(true);
    }

    @Test
    public void testMethod2(){
        System.out.println("TestNG_Listeners1: Running testMethod2");
        Assert.assertTrue(true);
    }
}
