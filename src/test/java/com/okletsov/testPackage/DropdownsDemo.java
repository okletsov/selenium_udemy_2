package com.okletsov.testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownsDemo {
        WebDriver driver;
        String baseURL;

        @Before
        public void setUp() throws Exception {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            baseURL = "https://letskodeit.teachable.com/p/practice";
        }

        @Test
        public void test() throws Exception {
            driver.get(baseURL);
            WebElement element = driver.findElement(By.id("carselect"));
            Select sel = new Select(element);

            //Dropdown elements can be selected by value, index and visible text:

            sel.selectByValue("benz");
            Thread.sleep(2000);

            sel.selectByIndex(0);
            Thread.sleep(2000);

            sel.selectByVisibleText("Honda");
            Thread.sleep(2000);

            //Getting all available dropdown options
            List <WebElement> options = sel.getOptions();

            for (int i =0; i < options.size(); i++){
                System.out.println(options.get(i).getText());
            }

        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
        }
    }
