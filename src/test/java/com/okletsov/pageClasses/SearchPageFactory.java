package com.okletsov.pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {

    WebDriver driver;

    @FindBy(id="tab-flight-tab-hp")
    WebElement flightTab;

    @FindBy(id="flight-origin-hp-flight")
    WebElement originInput;

    @FindBy(id="flight-destination-hp-flight")
    WebElement destinationInput;

    @FindBy(id="flight-departing-hp-flight")
    WebElement departureDateInput;

    @FindBy(id="flight-returning-hp-flight")
    WebElement returnDateInput;

    @FindBy(css="#gcw-flights-form-hp-flight  button[type='submit']")
    WebElement searchButton;

    @FindBy(id="flight-type-roundtrip-label-hp-flight")
    WebElement roundtrip;

    @FindBy(id="flight-type-multi-dest-label-hp-flight")
    WebElement multiCity;


    //Constructor to pass WebDriver instance to this class
    public SearchPageFactory (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //** Can use static methods to avoid creation of Class object
    public void clickFlightTab(){
        flightTab.click();
    }

    public void fillOriginInput(String origin){
        originInput.sendKeys(origin);
    }

    public void fillDestinationInput(String destination){
        destinationInput.sendKeys(destination);
    }

    public void fillDepartureDateInput(String departureDate){
        departureDateInput.sendKeys(departureDate);
    }

    public void fillReturnDateInput(String returnDate){
        returnDateInput.sendKeys(returnDate);
    }

    public void clearReturnDateInput(){
        returnDateInput.clear();
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickRoundtrip(){
        roundtrip.click();
    }

    public void clickMultiCity(){
        multiCity.click();
    }
}
