package com.okletsov.pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    public static WebElement element = null;

    //Origin
    public static WebElement originTextBox(WebDriver driver) {
        element = driver.findElement(By.id("package-origin-hp-package"));
        return element;
    }

    public static void fillOriginTextBox(WebDriver driver, String origin) {
        element = originTextBox(driver);
        element.sendKeys(origin);
    }

    //Destination
    public static WebElement destinationTextBox(WebDriver driver) {
        element = driver.findElement(By.id("package-destination-hp-package"));
        return element;
    }

    //Departure Date
    public static WebElement departureDateTextBox(WebDriver driver) {
        element = driver.findElement(By.id("package-departing-hp-package"));
        return element;
    }

    //Return Date
    public static WebElement returnDateTextBox(WebDriver driver) {
        element = driver.findElement(By.id("package-returning-hp-package"));
        return element;
    }

    //Clear Return Date
    public static void clearReturnDateTextBox(WebDriver driver) {
        returnDateTextBox(driver).clear();
    }

    //Search button
    public static WebElement searchButton(WebDriver driver) {
        element = driver.findElement(By.id("search-button-hp-package"));
        return element;
    }

    //Click Search Button
    public static void clickSearchButton (WebDriver driver) {
        searchButton(driver).click();
    }
}
