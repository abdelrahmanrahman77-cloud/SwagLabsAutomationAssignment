package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    private By UserNameField = By.id("user-name");
    private By UserPassWordField = By.id("password");
    private By LoginField = By.id("login-button");
    private By ErrorLocator =By.cssSelector("[data-test='error']");

    public void SetUserNameField(String username) {
        driver.findElement(UserNameField).sendKeys(username);
    }
    public void SetPassWordField(String Password){
        driver.findElement(UserPassWordField).sendKeys( Password);
}
    public void ClickLoginButton (){
driver.findElement(LoginField).click();
    }

    public String getText(){
        return driver.findElement(ErrorLocator).getText();

    }
}
