package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class TC_08_VerifyingCursor extends Base {
	


    @FindBy(xpath="(//div[@class='eFQ30H'])[5]")
    WebElement hoverElectronics;
    
    public void VerifyingCursor() {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }
    
    public void hover() {
        Actions action=new Actions(driver);
        action.moveToElement(hoverElectronics);
        action.build().perform();
        System.out.println("cursor moved to specific tab and it is highlited");
    }
    

 






}
