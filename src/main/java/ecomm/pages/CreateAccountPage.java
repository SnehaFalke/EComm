package ecomm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomm.baseclass.BaseClass;

public class CreateAccountPage extends BaseClass {
	
public CreateAccountPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

@FindBy(id="firstname") WebElement inputFirstName;
@FindBy(id="lastname") WebElement inputLastName;
@FindBy(xpath="(//input[@name='email'])[1]") WebElement inputEmail;
@FindBy(id="password") WebElement inputPswd;
@FindBy(id="password_confirmation")WebElement inputConfmPswd;
@FindBy(xpath="//button[@title='Create an Account']")WebElement createButton;

public String verifyPageTitle() {
 return driver.getTitle();
		
}
public void verifyCreateAccount() {
	inputFirstName.sendKeys(properties.getProperty("firstName"));
	inputLastName.sendKeys(properties.getProperty("lirstName"));
	inputEmail.sendKeys(properties.getProperty("emailID"));
	inputPswd.sendKeys(properties.getProperty("accountPassword"));
	inputConfmPswd.sendKeys(properties.getProperty("accountPassword"));
	createButton.click();
}
//second 
}