package pages;

import org.testng.Assert;

import base.Base;

public class TC_01_ValidUrl extends Base {
	
	public void validUrl(){
		
		String acturl,expurl;
		acturl="https://www.flipkart.com";
		expurl=driver.getCurrentUrl();
		System.out.println(expurl);
		Assert.assertTrue(expurl.contains(acturl), "valid url");
		System.out.println("valid url");
		
		
	}

}
