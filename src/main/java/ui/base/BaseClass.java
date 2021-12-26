package ui.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigManager;

/**
 * Created by Onkar Anand
 * Date 26-12-2012
 * BaseClass contains all reusable code for UI
 */
public class BaseClass {

    public static WebDriver initialization() {
        System.setProperty("webdriver.chrome.driver", ConfigManager.getInstance().getString("chrome_path"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public void goToUrl(WebDriver driver, String url) {
        driver.get(url);
    }

    public void maximizeWindow(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver) {
        driver.quit();
    }
}
