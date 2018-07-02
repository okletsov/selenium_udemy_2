package com.okletsov.testPackage;

import org.junit.*;

import static junit.framework.TestCase.fail;

public class JUnitIntroduction {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Executed once - before class");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Executed once - after class");
    }

    @Before
    public void setUp() throws Exception{
        System.out.println("Executed once before every test");
    }

    @After
    public void tearDown() throws Exception{
        System.out.println("Executed once after every test");
    }

    @Test
    public void test1() {
        // fail("Not yet implemented - 1");
        System.out.println("Executing test 1");
    }

    @Test
    public void test2() {
        // fail("Not yet implemented - 2");
        System.out.println("Executing test 2");
    }
}
