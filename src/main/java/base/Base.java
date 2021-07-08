package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	
	public  Base() {
		try{
			prop=new Properties();
			FileInputStream fi=new FileInputStream("C:\\selenium2\\FlipcartAssesment\\src\\main\\java\\Base\\configure.properties");
			prop.load(fi);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	public void closeBrowser(){
		
		driver.quit();
	}


}
