package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {
    @FindBy(id="tab-flight-tab-hp")
    WebElement flightTab;

    @FindBy(id="flight-type-roundtrip-label-hp-flight")
    WebElement roundtrip;

    @FindBy(id="flight-type-multi-dest-label-hp-flight")
    WebElement multiCity;

    public void clickFlightTab(){
        flightTab.click();
    }

    public void clickRoundtrip(){
        roundtrip.click();
    }

    public void clickMultiCity(){
        multiCity.click();
    }
}
