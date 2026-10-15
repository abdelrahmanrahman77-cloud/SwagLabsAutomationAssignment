package Base;

import Pages.InventoryPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
protected LoginPage loginPage;
protected InventoryPage inventoryPage;
@BeforeMethod
    public void setUp(){
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/");
loginPage=new LoginPage(driver);
    inventoryPage = new InventoryPage(driver);

}
@AfterMethod
public void tearDown(){
   driver.close();

}
}
