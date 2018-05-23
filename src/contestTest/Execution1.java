package contestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class Execution1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();

        String baseURL = "http://www.oddsportal.com/";
        driver.get(baseURL);

        Creds credentials = new Creds();
        String username = credentials.getUsername();
        String password = credentials.getPassword();

        driver.findElement(By.name("login-submit")).click();
        driver.findElement(By.id("login-username1")).sendKeys(username);
        driver.findElement(By.id("login-password1")).sendKeys(password);

        driver.findElement(By.cssSelector("#col-content [type='submit']")).click();

        driver.findElement(By.linkText(username)).click();
        driver.findElement(By.id("feed_menu_feeds")).click();
        Thread.sleep(3000);

        driver.findElement(By.className("view-more")).click();
        Thread.sleep(3000);

        // Getting the list of feed item IDs (to inspect elements within them in future)
        List <WebElement> feedItems;
        String itemID;
        String itemText;

        feedItems = driver.findElements(By.cssSelector(".feed-item"));
        System.out.println("The number of predictions found is: " + feedItems.size());

        for (int i = 0; i < feedItems.size(); i++) {
            itemID = feedItems.get(i).getAttribute("id");
            itemText = driver.findElement(By.cssSelector("#" + itemID + " .odd a")).getText();
            System.out.println(itemText);

            // Getting the index of user prediction
            Integer userPickIndex;
            List <WebElement> pickColumns;
            String pickText;

            pickColumns = driver.findElements(By.cssSelector("#" + itemID + "  [class='pred-usertip'] td"));
            for (int a=0; a < pickColumns.size(); a++){
                pickText = pickColumns.get(a).getText();
                if (pickText.contains("PICK")){
                    userPickIndex = a + 1;
                    System.out.println("User pick: " + userPickIndex);
                }
            }
        }
    }
}
