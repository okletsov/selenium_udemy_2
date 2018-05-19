package testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonsCheckBoxes {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Program_Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://letskodeit.teachable.com/p/practice";
    }

    @Test
    public void test() throws Exception {
        driver.get(baseURL);
        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        bmwRadioBtn.click();
        Thread.sleep(2000);

        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
        benzRadioBtn.click();
        Thread.sleep(2000);

        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();
        Thread.sleep(2000);

        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();
        Thread.sleep(2000);

        System.out.println("BMW radio is selected: " + bmwRadioBtn.isSelected());
        System.out.println("BMW checkbox is selected: " + bmwCheckBox.isSelected());
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }


}
