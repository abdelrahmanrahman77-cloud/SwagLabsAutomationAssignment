package Inventory;
import static org.testng.Assert.assertEquals;
import Base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class InventoryTest extends BaseTest {

    @Test
    public void TestPageTitle() {
        loginPage.SetUserNameField("standard_user");
        loginPage.SetPassWordField("secret_sauce");
        loginPage.ClickLoginButton();
        assertEquals(inventoryPage.getPageTitle(), "Swag Labs",
                "Inventory Title is not displayed");
}
@Test
public void CartIconDisplay(){
    loginPage.SetUserNameField("standard_user");
    loginPage.SetPassWordField("secret_sauce");
    loginPage.ClickLoginButton();
    assertTrue(inventoryPage.cartIconDisplay(),
                "Cart icon is not displayed");
}
@Test
public void ProuductsCount(){
    loginPage.SetUserNameField("standard_user");
    loginPage.SetPassWordField("secret_sauce");
    loginPage.ClickLoginButton();
    assertEquals(inventoryPage.ProuductCount(), 6,
                "The number of products is incorrect");
}
}
