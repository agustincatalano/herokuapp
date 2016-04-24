package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Agustin on 4/24/2016.
 */
public class DriverFactory {

    private static WebDriver driver;

    private void setDriver() {
        driver = new FirefoxDriver();
    }

    public WebDriver getDriver() {
        if (driver == null) {
            setDriver();
        }
        return driver;
    }


}
