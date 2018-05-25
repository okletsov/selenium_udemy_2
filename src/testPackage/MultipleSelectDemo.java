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

public class MultipleSelectDemo {
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
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(element);

        // Selecting elements
        sel.selectByValue("apple");
        Thread.sleep(2000);

        sel.selectByIndex(1);
        Thread.sleep(2000);

        sel.selectByVisibleText("Peach");
        Thread.sleep(2000);

        // Deselecting elements
        sel.deselectByValue("apple");
        Thread.sleep(2000);

        // Printing all selected options
        List <WebElement> selectedOptions = sel.getAllSelectedOptions();

        for (WebElement option: selectedOptions) {
            System.out.println(option.getText());
        }
        Thread.sleep(2000);

        // Deselectiong all  options
        sel.deselectAll();
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}