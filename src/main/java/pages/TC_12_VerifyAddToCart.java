package pages;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TC_12_VerifyAddToCart extends Base{
	
	@FindBy(xpath="//input[@name='q']")
	WebElement search;
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement selectinglaptop;
	@FindBy(xpath="//*[@id='pincodeInputId']")
	WebElement pincode;
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addtocart;
	
	public void VerifyAddToCart(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
	}
	public void addToCart()  {
		search.sendKeys("HPlaptops");
		search.submit();
		selectinglaptop.click();
		Set<String> allwindows=driver.getWindowHandles();
		Object[] windows=allwindows.toArray();
		String window1=windows[0].toString();
		String window2=windows[1].toString();
		driver.switchTo().window(window2);
		pincode.sendKeys("500073");
		pincode.submit();
		addtocart.click();
	}
	

}
