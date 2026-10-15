package Login;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void TestSuccessfullLogin() {
        loginPage.SetUserNameField("standard_user");
        loginPage.SetPassWordField("secret_sauce");
        loginPage.ClickLoginButton();
        assertTrue(
                driver.getCurrentUrl().contains("/inventory.html"),
                "User was not redirected to the Inventory page");
    }

  @Test
    public void TestUnsuccessfullLogin() {
        loginPage.SetUserNameField("standard_us1er");
        loginPage.SetPassWordField("secret_sauce");
        loginPage.ClickLoginButton();
        String message = loginPage.getText();
       assertTrue(message.contains("Username and password do not match any user in this service"),
                "UnsuccessfullLogin");
    }

    @Test
    public void TestEmptyPasswordField() {
        loginPage.SetUserNameField("standard_user");
        loginPage.SetPassWordField("");
        loginPage.ClickLoginButton();
        String message = loginPage.getText();
        assertTrue(message.contains("Password is required"),
                "Unsuccessfull Login!");
    }
    @Test
    public void TestEmptyUserNameField() {
        loginPage.SetUserNameField("");
        loginPage.SetPassWordField("secret_sauce");
        loginPage.ClickLoginButton();
        String message = loginPage.getText();
        assertTrue(message.contains("Username is required"),
                "Unsuccessfull Login!");
    }
}
