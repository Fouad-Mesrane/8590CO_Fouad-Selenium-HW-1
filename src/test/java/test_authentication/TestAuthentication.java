package test_authentication;

import app_page_library.HomePage;
import base.BasePage;
import config.Config;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {

    @Test
    public void authentication(){
        HomePage homePage = new HomePage();
        homePage.login(Config.properties.getProperty("app_user"),Config.properties.getProperty("app_password") );
    }
}
