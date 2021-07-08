package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.Base;

public class TC_02_VerifyingLogo extends Base {
	public void checkImage(){
		boolean ImageFile = driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")).isDisplayed();
		//verifying if image is present in the page
//		if(ImageFile){
//			System.out.println("Logo is  present");
//		}else{
//			System.out.println("Logo is not present");
//		}
		Assert.assertTrue(ImageFile);
	}

}
