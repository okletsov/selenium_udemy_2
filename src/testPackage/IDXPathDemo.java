package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WaitTypes;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IDXPathDemo {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Program_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
        WaitTypes wt = new WaitTypes(driver);

        String baseURL = "http:\\www.google.com";
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");

        // Just pressing Enter to search
//        driver.findElement(By.id("lst-ib")).submit();

        // Using implicit wait (application will always wait for 5 seconds)
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // implicit wait
//        driver.findElement(By.xpath("//*[@class='gstl_0 sbdd_a']//input[@value='Google Search']")).click();

        // Using Explicit wait. The app will wait for defined amount of time (defined above) OR execute code as soon
        // as condition (specified here) is met
        WebElement googleSearch;
        googleSearch = wt.waitForElement(By.xpath("//*[@class='gstl_0 sbdd_a']//input[@value='Google Search']"), 2);
//        googleSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='gstl_0 sbdd_a']//input[@value='Google Search']")));
        googleSearch.click();

    }
}
