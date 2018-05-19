package contestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver = new ChromeDriver();

    public void login(String userName, String password){
        driver.findElement(By.name("login-submit")).click();
        driver.findElement(By.id("login-username1")).sendKeys(userName);
        driver.findElement(By.id("login-password1")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id='col-content']//button[@name='login-submit']")).click();
    }
}
