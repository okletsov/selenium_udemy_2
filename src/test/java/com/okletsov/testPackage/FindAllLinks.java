package com.okletsov.testPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageClasses.SearchPageFactory;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindAllLinks {
    private WebDriver driver;
    private String baseUrl;

    SearchPageFactory searchPage;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testFindLinks() throws Exception {
        driver.get(baseUrl);

        SearchPageFactory searchPage = new SearchPageFactory(driver);
        searchPage.clickFlightTab();
        List<WebElement> linksList = clickableLinks(driver);
        for (WebElement e: linksList) {
            String href = e.getAttribute("href");
            try {
                System.out.println("URL " + href + " return " +  linkStatus(new URL(href)));
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }

        }

    }

    public static List<WebElement> clickableLinks(WebDriver driver){
        List <WebElement> elements = driver.findElements(By.tagName("a"));
        elements.addAll(driver.findElements(By.tagName("img")));
        List <WebElement> linksToClick = new ArrayList<>();

        for (WebElement e: elements) {
            if (e.getAttribute("href") != null){
                linksToClick.add(e);
            }
        }
        return linksToClick;
    }

    public static String linkStatus(URL url){
        try {
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.connect();
            String responseMessage = http.getResponseMessage();
            http.disconnect();
            return responseMessage;
        } catch (Exception e) {
            return e.getMessage();
        }
    }


    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
