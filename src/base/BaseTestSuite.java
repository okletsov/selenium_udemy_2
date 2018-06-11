package base;

import org.testng.annotations.*;

public class BaseTestSuite {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("\nBaseTestSuite: This runs once before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("\nBaseTestSuite: This runs once after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("\nBaseTestSuite: This runs once before test tag in xml");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("\nBaseTestSuite: This runs once after test tag in xml");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("\nBaseTestSuite: Runs once before class*");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("\nBaseTestSuite: Runs once after class*");
    }
}
