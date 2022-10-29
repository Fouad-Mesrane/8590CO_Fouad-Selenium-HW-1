package app_page_library;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".login")
    WebElement signIn;
    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "SubmitLogin")
    WebElement loginBtn;



    public void login(String email, String pass) {
        signIn.click();
        userEmail.sendKeys(email);
        password.sendKeys(pass);
        loginBtn.click();
    }

}
