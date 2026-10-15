package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;
    public InventoryPage (WebDriver driver){
        this.driver=driver;

    }
    private By MessageLocator=By.className("app_logo");
private By CartIconLocator = By.id("shopping_cart_container");
    private By productsIcon = By.className("inventory_item");
    public String getPageTitle() {
        return driver.findElement(MessageLocator).getText();

}
public boolean cartIconDisplay(){
    return driver.findElement(CartIconLocator).isDisplayed();
}
public int ProuductCount() {
        return driver.findElements(productsIcon).size();

}
}
