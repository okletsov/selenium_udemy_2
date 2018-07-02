package com.okletsov.testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageClasses.SearchPageFactory;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCase {
    private WebDriver driver;
    private String baseUrl;

    SearchPageFactory searchPage;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMethod() throws Exception {
        driver.get(baseUrl);

        searchPage = new SearchPageFactory(driver);
        searchPage.clickFlightTab();
        searchPage.fillOriginInput("Boston");
        searchPage.fillDestinationInput("Miami");
        searchPage.fillDepartureDateInput("09/01/2018");
        searchPage.clearReturnDateInput();
        searchPage.fillReturnDateInput("09/10/2018");
        searchPage.clickSearchButton();
    }


    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
//        driver.quit();
    }
}
