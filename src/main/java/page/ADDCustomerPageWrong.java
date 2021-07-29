package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ADDCustomerPageWrong {
	
	WebDriver driver;
	
	//make the constactor
	
	public ADDCustomerPageWrong(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[5]/a/span[1]")
	WebElement TRANSACTION_BUTTON_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")
	WebElement NEW_DEPOSIT_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_DROPDOW_FIELD;
	@FindBy(how = How.XPATH, using ="//*[@id=\"description\"]")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using ="//*[@id=\"amount\"]")
	WebElement AMOUNT_FIELD;
	@FindBy(how = How.XPATH, using ="//*[@id=\"submit\"]")
	WebElement SUBMIT_DEPOSIT_FIELD;
	
//METHODS TO INTERACT WITH THE ELEMENTS
	public void clickTransactionButton() {
		TRANSACTION_BUTTON_FIELD.click();
	}
	public void clickNewDepositButton() {
		NEW_DEPOSIT_BUTTON.click();
	}
}
