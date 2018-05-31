package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
    WebDriver driver;

    public WaitTypes (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElement (By locator, int timeout){
        WebElement element = null;
        try {
            System.out.println("Waiting for max " + timeout + " seconds for elment to be available");
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("Element found");

        } catch (Exception e){
            System.out.println("Element not appeared on page");
        }

        return element;
    }
}
