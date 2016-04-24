package driverFactory;

import org.openqa.selenium.WebDriver;

/**
 * Created by Agustin on 4/24/2016.
 */
public class HomePage {

    private WebDriver driver;
    private DriverFactory driverFactory;
    private static final String HomePageURL = "https://the-internet.herokuapp.com/";


    public String getHomePageURL(){
        return HomePageURL;
    }

    public DriverFactory driverFactory(){
        if (driverFactory == null){
            driverFactory = new DriverFactory();
        }
        return driverFactory;
    }

    public void goToHomePage(String url){
        if (driver==null){
            driver = driverFactory().getDriver();
        }
        driver.get(url);
    }

}
