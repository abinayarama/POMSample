package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutInfoPage;
import pages.LoginPage;
import pages.ProductListPage;

public class PlaceOrderTest {
	
	WebDriver driver;
	LoginPage loginPage;
	ProductListPage listPage;
	CartPage cartPage;
	CheckOutInfoPage checkPage;
	
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver=TestBase.getDriver();
		loginPage = new LoginPage(driver);
		listPage = new ProductListPage(driver);
		cartPage = new CartPage(driver);
		checkPage = new CheckOutInfoPage(driver);
	}
  @Test
  public void setup() {
	  TestBase.openUrl("https://www.saucedemo.com/");
	  loginPage.loginIntoApp("standard_user", "secret_sauce");
  }
  
  @Test
  public void addItem()
  {
	  listPage.addToCart();
	  listPage.viewCart();
	  Assert.assertTrue(cartPage.isItemAdded());
  }
  
  public void checkoutItems() {
	  cartPage.checkoutItems();
	  checkPage.fillForm("test","name", "124");
	  checkPage.continueCheckout();
  }
}
