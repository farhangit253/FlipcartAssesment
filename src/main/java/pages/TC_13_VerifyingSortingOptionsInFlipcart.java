package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TC_13_VerifyingSortingOptionsInFlipcart extends Base {
	
	    
	    @FindBy(xpath="(//div[@class='eFQ30H'])[4]")
	    WebElement fashion;
	    
	    @FindBy(xpath="(//a[@class='_6WOcW9 _3YpNQe'])[2]")
	    WebElement menTshirt;
	    
	    @FindBy(xpath="(//div[@class='_24_Dny'])[1]")
	    WebElement selectBrand;
	    
	    
	    public void  VerifyingSortingOptionsInFlipcart() {
	        PageFactory.initElements(driver,this);
	    }
	    
	    public void selectMenTshirt() {
	        Actions action=new Actions(driver);
	        action.moveToElement(fashion);
	        action.build().perform();
	        action.moveToElement(menTshirt);
	        action.click().build().perform();
	        selectBrand.click();
	        
	        
	    }

}
