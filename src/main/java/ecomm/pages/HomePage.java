package ecomm.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecomm.baseclass.BaseClass;

public class HomePage extends BaseClass {
	

	//page Object repo
	//Page Factory use here
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		//PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@class='logo']/img")WebElement logoImg;
	@FindBy(xpath="(//a[text()='Sign In'])[1]")WebElement signIn;
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")WebElement createAccount;
	@FindBy(id="search")WebElement searchBox;
	//Actions or methods
	public String verifyPageTitle() {
		return driver.getTitle();
		
	}
	public boolean verfiyLogoImg() {
		return logoImg.isDisplayed();
	}
	public LoginPage verifySignInLink() {
		 signIn.click();
		 return new LoginPage();
	}
	public CreateAccountPage verifyCreateAccountLink() {
		createAccount.click();
		return new CreateAccountPage(driver);
		
		
	}
}
	
	

