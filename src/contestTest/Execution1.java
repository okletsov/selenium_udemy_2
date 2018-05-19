package contestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Execution1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Program_Files\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();

        String baseURL = "http://www.oddsportal.com/";
        driver.get(baseURL);

        driver.findElement(By.name("login-submit")).click();
        driver.findElement(By.id("login-username1")).sendKeys("Deagle");
        driver.findElement(By.id("login-password1")).sendKeys("oddsportal.com2013");

        driver.findElement(By.cssSelector("#col-content [type='submit']")).click();
//        driver.findElement(By.xpath("//*[@id='col-content']//button[@name='login-submit']")).click();

        driver.findElement(By.linkText("Deagle")).click();
        driver.findElement(By.id("feed_menu_feeds")).click();
        Thread.sleep(3000);

        driver.findElement(By.className("view-more")).click();
        Thread.sleep(3000);

        List predictions = driver.findElements(By.cssSelector(".feed-item"));
        // List predictions = driver.findElements(By.xpath("//*[@class='feed-item']"));

        System.out.println("The number of predictions found is: " + predictions.size());

        String text = driver.findElement(By.cssSelector("#feed_item_2887498303 .odd a")).getText();
        // String text = driver.findElement(By.xpath("//*[@id='feed_item_2887498303']//*[@class='odd']//a[1]")).getText();

        System.out.println("Captured text is: " + text);

    }
}
