package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;



public class TC_10_VerifyingNavigationHomepage extends Base {
	
	    @FindBy(xpath="(//div[@class='eFQ30H'])[8]")
	    WebElement flights;
	   
	    @FindBy(xpath = "//img[@class='_2xm1JU']")
	    WebElement logoImage;
	   
	    public void VerifyingNavigationHomepage() {
	    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        PageFactory.initElements(driver, this);
	    }
	   
	    public void clickOnFlights() throws InterruptedException {
	        flights.click();
	        Thread.sleep(1000);
	        driver.navigate().back();
	        System.out.println("Navigated to HomePage");
	    
	    }	 

}
