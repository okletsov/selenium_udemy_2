package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Program_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        String baseURL = "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.get(baseURL);

        // CSS by ID
        driver.findElement(By.cssSelector("input[id=name]")).click();
        driver.findElement(By.cssSelector("#displayed-text")).click();
        driver.findElement(By.cssSelector("input#name")).click();

        //CSS by Class name
        driver.findElement(By.cssSelector("input[class='inputs displayed-class']")).click(); // with a space in class name
        driver.findElement(By.cssSelector(".inputs")).click();
        driver.findElement(By.cssSelector(".displayed-class")).click();
    }
}
