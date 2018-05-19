package testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ListOfElementsDemo {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://letskodeit.teachable.com/p/practice";
    }

    @Test
    public void test() throws Exception {
        driver.get(baseURL);
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("[name='cars'][type='radio']"));
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}
