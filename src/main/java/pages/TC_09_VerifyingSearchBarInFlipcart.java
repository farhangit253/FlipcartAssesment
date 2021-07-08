package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TC_09_VerifyingSearchBarInFlipcart extends Base {
	 @FindBy(xpath="//input[@class='_3704LK']")
	    WebElement searchInput;
	    
	    public void VerifyingSearchBarInFlipcart() {
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void searchProduct() {
	        searchInput.click();
	        searchInput.sendKeys("Laptops",Keys.ENTER);
	    }

	 

}
