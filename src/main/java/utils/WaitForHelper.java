package utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WaitForHelper {
    WebDriver driver;

    public WaitForHelper(WebDriver driver)
    {
        this.driver = driver;
    }

    public void implicitWait(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void pageLoadTimeout(WebDriver driver) {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

}
