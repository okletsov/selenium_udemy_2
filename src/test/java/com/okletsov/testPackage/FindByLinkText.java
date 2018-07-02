package com.okletsov.testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindByLinkText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Program_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String baseURL = "https://letskodeit.teachable.com/";
        driver.get(baseURL);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.partialLinkText("Prac")).click();
    }
}
