package com.okletsov.testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ElementStateTest {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://www.google.com/";
    }

    @Test
    public void test() throws Exception {
        driver.get(baseURL);
        WebElement e1 = driver.findElement(By.id("gs_taif0"));
        System.out.println("E1 is enabled? :" + e1.isEnabled());

        WebElement e2 = driver.findElement(By.id("lst-ib"));
        System.out.println("E2 is enabled? :" + e2.isEnabled());

        WebElement e3 = driver.findElement(By.id("gs_htif0"));
        System.out.println("E3 is enabled? :" + e3.isEnabled());

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
