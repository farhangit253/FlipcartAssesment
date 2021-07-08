package maintest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import data.LoginPageData;
import pages.TC_03_InvalidUrl;
import pages.TC_04_VerifyingLabelsAndControl;
import pages.TC_01_ValidUrl;
import pages.TC_12_VerifyAddToCart;
import pages.TC_06_VerifyInvalidLogin;
import pages.TC_05_VerifyLogin;
import pages.TC_08_VerifyingCursor;
import pages.TC_02_VerifyingLogo;
import pages.TC_14_VerifyingLogoutOperation;
import pages.TC_10_VerifyingNavigationHomepage;
import pages.TC_07_VerifyingNavigationtoProducts;
import pages.TC_11_VerifyingProductPage;
import pages.TC_09_VerifyingSearchBarInFlipcart;
import pages.TC_13_VerifyingSortingOptionsInFlipcart;

public class TestExecution {
	Base launch;
	TC_01_ValidUrl valid;
	TC_02_VerifyingLogo logo;
	TC_03_InvalidUrl invalid;
	TC_04_VerifyingLabelsAndControl controls;
	LoginPageData login;
	TC_05_VerifyLogin verify;
	TC_06_VerifyInvalidLogin InvalidLogin;
	TC_07_VerifyingNavigationtoProducts navigate;
	TC_08_VerifyingCursor cursor;
	TC_09_VerifyingSearchBarInFlipcart search;
	TC_10_VerifyingNavigationHomepage navigateHome;
	TC_11_VerifyingProductPage product;
	TC_12_VerifyAddToCart add;
	TC_13_VerifyingSortingOptionsInFlipcart sort;
	TC_14_VerifyingLogoutOperation logout;
	@BeforeMethod
	public void launch(){
		launch=new Base();
		launch.launchBrowser();
	}
	@Test(priority=0,enabled=true)
	public void testCase1(){	
			
			valid=new TC_01_ValidUrl();
			valid.validUrl();			
		}
	@Test(priority=1,enabled=true)
	public void testCase2()   {
	
		System.out.println("Launched Flipcart succesfully and logo verified");
		logo=new TC_02_VerifyingLogo();
		logo.checkImage();
			
	}
	@Test(priority=2,enabled=true)
	public void testCase3(){
		
		invalid=new TC_03_InvalidUrl();
		invalid.invalidUrl();
	}
	@Test(priority=3,enabled=true)
	public void testCase4(){
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		controls=new TC_04_VerifyingLabelsAndControl();
		controls.verifyingLinks();
		controls.verifyingButtons();
		controls.verifyingLabels();
		
	}
	@Test(priority=4,enabled=true)
	public void testCase5(){
		
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
	}
	@Test(priority=5,enabled=true)
	public void testCase6(){
		
		InvalidLogin=new TC_06_VerifyInvalidLogin();
		InvalidLogin.VerifyInvalidLogin();
		InvalidLogin.login();
		
	}
	@Test(priority=6,enabled=true)
	public void testCase7() throws InterruptedException{
		
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		navigate= new TC_07_VerifyingNavigationtoProducts();
		navigate.VerifyingNavigationtoProducts();
		navigate.navigatingToProducts();
	}
	@Test(priority=7,enabled=true)
	public void testCase8(){
		
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		cursor=new TC_08_VerifyingCursor();
		cursor.VerifyingCursor();
		cursor.hover();
		
	}
	@Test(priority=8,enabled=true)
	public void testcase9(){
		
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		search=new TC_09_VerifyingSearchBarInFlipcart();
		search.VerifyingSearchBarInFlipcart();
		search.searchProduct();
	}
	@Test(priority=9,enabled=true)
	public void testCase10() throws InterruptedException{
		
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		navigateHome=new TC_10_VerifyingNavigationHomepage();
		navigateHome.VerifyingNavigationHomepage();
		navigateHome.clickOnFlights();
	}
	@Test(priority=10,enabled=true)
	public void testCase11(){
		
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		product=new TC_11_VerifyingProductPage();
		product.VerifyingProductPage();
		product.remoteControlToy();	
	}
	
	@Test(priority=11,enabled=true)
	public void testCase12() {
		
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		add=new TC_12_VerifyAddToCart();
		add.VerifyAddToCart();
		add.addToCart();
	}
	@Test(priority=12,enabled=true)
	public void testCase13() throws InterruptedException{
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		sort=new TC_13_VerifyingSortingOptionsInFlipcart();
		sort.VerifyingSortingOptionsInFlipcart();
		sort.selectMenTshirt();
	}
	@Test(priority=13,enabled=true)
	public void testCase14() throws InterruptedException{
		verify=new TC_05_VerifyLogin();
		verify.VerifyLogin();
		login=new LoginPageData();
		verify.login(login.getNum(), login.getpass());
		logout=new TC_14_VerifyingLogoutOperation();
		logout.VerifyingLogoutOperation();
		logout.logout();
		
	}
	@AfterMethod
	public void closeBrowser(){
		launch=new Base();
		launch.closeBrowser();
	}
	
	
}
