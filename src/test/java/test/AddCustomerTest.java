package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ADDCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToCustomer() {
		
		driver =BrowserFactory.init();
		
		 //this is the way to make object in pom project in test class.
	    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	    loginPage.enterUserName("demo@techfios.com");
	    loginPage.enterPassword("abc123");
	    loginPage.clickSinginButton();
	    
	    
	    DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	    dashboardPage.validateDashboardHeader();
	    dashboardPage.clickOnCustomerButton();
	    dashboardPage.clickOnAddCustomerButton();
	   
	    ADDCustomerPage addCustomerPage = PageFactory.initElements(driver, ADDCustomerPage.class);
	    addCustomerPage.insertUserName("selenium");
	    addCustomerPage.insertCompanyName("Techfios");
	    addCustomerPage.insertEmailAddress("abc@techfion.com");
	    addCustomerPage.enterCountryName("paraguay");
	  
		
	}
}
