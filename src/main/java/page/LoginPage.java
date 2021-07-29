package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	//constractor get evock
	//constractor parametrigetion
    
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	//Element LIB
	
	
	//this two way not going to work in pom
//	WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath("//*[@id='username']"));
//    By USER_NAME_FIELD = By.xpath("//*[@id='username']");
	
	@FindBy(how = How.XPATH, using = "//*[@id='username']") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id='password']") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@name='login']") WebElement SINGIN_BUTTON_FIELD;
	
	
	 //INTERACTIVE METHODS/frist tecnick,you cannot keep data in this page in pom.so you have make parameterajistion.
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);	
	}
	public void clickSinginButton() {
		SINGIN_BUTTON_FIELD.click();
	}
	
	
	//second tacknick
	
//	public void loginIn(String userName, String password) {
//		USERNAME_FIELD.sendKeys(userName);
//		PASSWORD_FIELD.sendKeys(password);
//		SINGIN_BUTTON_FIELD.click();
//		
//	}
}
