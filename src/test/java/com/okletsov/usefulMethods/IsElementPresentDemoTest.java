package com.okletsov.usefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IsElementPresentDemoTest {
    private WebDriver driver;
    private String baseUrl;
    private GenericMethods gm;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        gm = new GenericMethods(driver);
        baseUrl = "https://learn.letskodeit.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMethod() throws Exception{
        driver.get(baseUrl);

        Boolean result1 = gm.isElementPresent("displayed-text", "id");
        System.out.println("The element is present: " +  result1);

        Boolean result2 = gm.isElementPresent("not-existing-locator", "id");
        System.out.println("The element is present: " +  result2);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
