package ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.base.BaseClass;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 * Contains all the Page object for Home page
 */
public class HomePage extends BaseClass {

    @FindBy(xpath = "//*[@name='query']")
    WebElement citySearchBox;

    @FindBy(xpath = "//*[@class='icon-search search-icon']")
    WebElement searchIcon;

    public void sendCityToSearchBox(String city) {
        citySearchBox.sendKeys(city);
    }

    public void clickOnSearch() {
        searchIcon.click();
    }

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
