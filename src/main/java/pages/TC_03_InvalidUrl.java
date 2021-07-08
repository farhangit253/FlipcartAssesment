package pages;

import base.Base;

public class TC_03_InvalidUrl extends Base {
	
	public void invalidUrl(){
		String acturl,expurl;
		acturl="https://www.flipkart.in";
		expurl=driver.getCurrentUrl();
		System.out.println(expurl);
		if (expurl.equals(acturl)) {
			System.out.println("valid url");
		}else
			System.out.println("Invalid url");
		
	}

}
