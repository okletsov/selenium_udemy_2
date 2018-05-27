package usefulMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GenericMethods {
    WebDriver driver;

    public GenericMethods(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getElement(String locator, String type){
        type = type.toLowerCase();
        if (type.equals("id")) {
            System.out.println("Element found with id: " + locator);
            return this.driver.findElement(By.id(locator));
        }
        else if (type.equals("xpath")) {
            System.out.println("Element found with xpath: " + locator);
            return this.driver.findElement(By.xpath(locator));
        }
        else if (type.equals("css")){
            System.out.println("Element found with css: " + locator);
            return  this.driver.findElement(By.cssSelector(locator));
        }
        else {
            System.out.println("Locator type not supported");
            return null;
        }
    }

    public List<WebElement> getElementsList(String locator, String type){
        type = type.toLowerCase();
        if (type.equals("id")) {
            System.out.println("Elements found with id: " + locator);
            return this.driver.findElements(By.id(locator));
        }
        else if (type.equals("xpath")) {
            System.out.println("Elements found with xpath: " + locator);
            return this.driver.findElements(By.xpath(locator));
        }
        else if (type.equals("css")){
            System.out.println("Elements found with css: " + locator);
            return  this.driver.findElements(By.cssSelector(locator));
        }
        else {
            System.out.println("Locator type not supported");
            return null;
        }
    }
}
