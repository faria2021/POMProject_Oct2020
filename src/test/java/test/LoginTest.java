package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		BrowserFactory.init();
	    driver = BrowserFactory.init();//made a bucket to keep the webdriver in this page.
		
	    //creating a object
	   // LoginPage loginPage = new LoginPage();//using this way pom not going to work.in this way you cannot make an object in pom.
		
	    
	    //this is the way to make object in pom project in test class.
	    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	    loginPage.enterUserName("demo@techfios.com");
	    loginPage.enterPassword("abc123");
	    loginPage.clickSinginButton();
	    
	    
	    DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	    dashboardPage.validateDashboardHeader();
	    BrowserFactory.tearDown();
	    
	    
	    
	    
	}
	
	
}
