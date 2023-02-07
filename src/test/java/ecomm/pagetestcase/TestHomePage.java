package ecomm.pagetestcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomm.baseclass.BaseClass;
import ecomm.pages.CreateAccountPage;
import ecomm.pages.HomePage;
import ecomm.pages.LoginPage;


public class TestHomePage extends BaseClass {
	HomePage homepage;
	LoginPage  loginPage;
	
	public TestHomePage() {
		super();
	}
	@BeforeMethod //@BeforeClass 
	public void launchBrowser() {
		initialzeBrowser();
		homepage =new HomePage(driver);
	}
	@Test
	public void testPagetitle() {
		String title=homepage.verifyPageTitle();
		Assert.assertEquals(title, "Home Page");
	}
	//@Test(dependsOnMethods= {"testPagetitle"})
	public void testLogo() {
		Assert.assertTrue(homepage.verfiyLogoImg());
	}
	//@Test(dependsOnMethods= {"testLogo"})
	public void testSignIn() {
		homepage.verifySignInLink();
	}	
	@Test//(dependsOnMethods= {"testSignIn"})
	public void testCreateAccount() {
		homepage.verifyCreateAccountLink();
		
	}
	//@Test
	//public void testverifyPageTitleOnCreateAccount() {
		//String title=createAcct.verifyPageTitle();
		//Assert.assertEquals(createAcct.verifyPageTitle(),"Create New Customer Account");
	//}
	
	 @AfterMethod // @AfterClass 
	public void closeAction() throws InterruptedException {
		driver.quit();
		Thread.sleep(1500);
	}
	}


