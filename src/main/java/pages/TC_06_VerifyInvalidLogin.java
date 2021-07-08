package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;

public class TC_06_VerifyInvalidLogin extends Base {
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement popup;
		@FindBy(xpath="//a[@href='/account/login?ret=/']")
		WebElement login;
		@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
		WebElement username;
		@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
		WebElement password;
		@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
		WebElement submit;
		@FindBy(xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")
		WebElement usernamevalue;
		
	public void VerifyInvalidLogin(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
		
		public void login(){
			popup.click();
			login.click();;
//			Alert act=driver.switchTo().alert();
//			act.dismiss();
			username.sendKeys("9700403436");
			password.sendKeys("Farhan@243");
			submit.click();
			System.out.println("Invalid Login");
			
			
		}

}
