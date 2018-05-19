package testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasicActions {

    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Program_Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://letskodeit.teachable.com/";
    }

    @Test
    public void test() {
        driver.get(baseURL);
        driver.findElement(By.cssSelector("#navbar [href='/sign_in']")).click();
        System.out.println("Clicked on Login button");

        driver.findElement(By.cssSelector("#user_email")).sendKeys("test_email@test.com");
        System.out.println("Email entered");

        driver.findElement(By.cssSelector("#user_email")).clear();
        System.out.println("Field cleared");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
