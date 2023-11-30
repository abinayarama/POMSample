package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProductListPage {
  
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement itemOne;
	
	@FindBy(id="shopping_cart_container")
	WebElement cartIcon;
	
	public ProductListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void addToCart()
	{
		itemOne.click();
	}
	public void viewCart() {
		cartIcon.click();
	}
}
