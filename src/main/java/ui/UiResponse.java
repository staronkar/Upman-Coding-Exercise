package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.base.BaseClass;
import ui.pages.HomePage;
import ui.pages.WeatherInfoDetailsPage;
import utils.ConfigManager;
import utils.WaitForHelper;

public class UiResponse extends BaseClass {

    WebDriver driver;
    WaitForHelper wait;

    public int getCityTemperature() throws InterruptedException {
        driver = initialization();
        wait = new WaitForHelper(driver);
        maximizeWindow(driver);
        goToUrl(driver, ConfigManager.getInstance().getString("url"));
        wait.implicitWait(driver);

        HomePage homePage = new HomePage(driver);
        homePage.sendCityToSearchBox(ConfigManager.getInstance().getString("city_name"));
        wait.pageLoadTimeout(driver);

        homePage.clickOnSearch();
        wait.pageLoadTimeout(driver);

        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Pune, Maharashtra,')]"));
        act.doubleClick(ele).perform();
        wait.pageLoadTimeout(driver);

        WeatherInfoDetailsPage weatherInfoDetailsPage = new WeatherInfoDetailsPage(driver);
        String tempValue = weatherInfoDetailsPage.getCityDetails();
        closeBrowser(driver);
        return Integer.parseInt(tempValue.substring(0, 2));
    }
}
