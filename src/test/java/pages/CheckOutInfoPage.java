package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CheckOutInfoPage {
  @FindBy(id="first-name")
  WebElement firstName;
  
  @FindBy(id="last-name")
  WebElement lastName;
  
  @FindBy(id="postal-code")
  WebElement postalCode;
  
  @FindBy(id="continue")
  WebElement cont;
  
  public CheckOutInfoPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  
  public void fillForm(String fname,String lname,String pcode) {
	  firstName.sendKeys(fname);
	  lastName.sendKeys(lname);
	  postalCode.sendKeys(pcode);
  }
  
  public void continueCheckout() {
	  cont.click();
	  
  }
}
