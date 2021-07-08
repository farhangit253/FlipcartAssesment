package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TC_07_VerifyingNavigationtoProducts extends Base{
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div/div[1]/a/div[1]/div/img")
	WebElement Topoffers;
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div/div[2]/a/div[1]/div/img")
	WebElement groceries;
	@FindBy(xpath="//*[@id='container']/div/div[2]/div/div/div[3]/a/div[1]/div/img")
	WebElement mobiles;
	public void VerifyingNavigationtoProducts(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public void navigatingToProducts() throws InterruptedException{
		Topoffers.click();
		Thread.sleep(1000);
		driver.navigate().back();
		groceries.click();
		driver.navigate().back();
		mobiles.click();
		System.out.println("succesfully navigating to selected products");
		
	}

}
