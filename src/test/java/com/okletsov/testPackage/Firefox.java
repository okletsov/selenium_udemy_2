package com.okletsov.testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Automation_Program_Files\\geckodriver-v0.20.1-win64\\geckodriver.exe");

        WebDriver driver;
        driver = new FirefoxDriver();

        String baseURL = "http://www.google.com";
        driver.get(baseURL);
    }
}
