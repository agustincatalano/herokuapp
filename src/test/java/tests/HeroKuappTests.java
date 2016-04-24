package tests;

import driverFactory.HomePage;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Agustin on 4/24/2016.
 */
public class HeroKuappTests {

    private HomePage homePage = new HomePage();

    @Test
    public void goToHomepage(){
        homePage.goToHomePage(homePage.getHomePageURL());
    }
}
