package testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HiddenElementsDemo {
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
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text Box displayed: " + textBox.isDisplayed());
        Thread.sleep(2000);

        driver.findElement(By.id("hide-textbox")).click();
        System.out.println("Clicked Hide button");
        System.out.println("Text Box displayed: " + textBox.isDisplayed());
        Thread.sleep(2000);

        driver.findElement(By.id("show-textbox")).click();
        System.out.println("Clicked Show button");
        System.out.println("Text Box displayed: " + textBox.isDisplayed());
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
