package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 * Contains all the page object for Weather Details Page
 */
public class WeatherInfoDetailsPage {

    @FindBy(xpath = "//div[@class='cur-con-weather-card__panel']/div[@class='forecast-container']/div[@class='temp-container']/div[@class='temp']")
    WebElement tempDetails;

    public String getCityDetails() {
        return tempDetails.getText();
    }


    public WeatherInfoDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
