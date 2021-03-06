package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ADDCustomerPage extends BasePage {
	WebDriver driver;
	
	//make the constactor
	
	public ADDCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_FIELD_LOCATOR;
			
	
	
	
	
   public void insertUserName(String userName) {
	   Random rnd = new Random();
	  int randomNumber =rnd.nextInt(999);
	   
	   int genNum = randomGenerator(999);
	
	USERNAME_FIELD_LOCATOR.sendKeys(userName + genNum);
}


public void insertCompanyName(String companyName) {
	
	
	selectDropDown(COMPANY_FIELD_LOCATOR,companyName);
		
	
	
}
 public void insertEmailAddress(String email) {
	  int genNum = randomGenerator(999); 
    EMAIL_FIELD_LOCATOR.sendKeys(genNum + email);

 }
	
	public void enterCountryName(String countryName ) {
selectDropDown(COUNTRY_FIELD_LOCATOR, countryName);
	}

	
}
