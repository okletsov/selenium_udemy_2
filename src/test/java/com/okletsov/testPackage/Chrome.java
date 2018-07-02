package com.okletsov.testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation_Program_Files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http:\\www.google.com";
        driver.get(baseURL);
    }
}
