package testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.classes.SearchPage;

import java.util.concurrent.TimeUnit;

public class PageObjectModel {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMethod() throws Exception{
        driver.get(baseUrl);
//        SearchPage.originTextBox(driver).sendKeys("Boston"); //one way of using page object model
        SearchPage.fillOriginTextBox(driver, "Boston"); // preferred way

        SearchPage.destinationTextBox(driver).sendKeys("Miami");
        SearchPage.departureDateTextBox(driver).sendKeys("9/01/2018");
        SearchPage.clearReturnDateTextBox(driver);
        SearchPage.returnDateTextBox(driver).sendKeys("9/10/2018");
        SearchPage.clickSearchButton(driver);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
//        driver.quit();
    }
}
