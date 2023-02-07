package ecomm.pagetestcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecomm.baseclass.BaseClass;
import ecomm.pages.CreateAccountPage;
import ecomm.pages.HomePage;

public class TestCreateAccountPage extends BaseClass {
    HomePage homepage;
    CreateAccountPage createAcct;
    
public TestCreateAccountPage() {
	super();
}
@BeforeMethod //@BeforeClass 
public void launchBrowser() {
	initialzeBrowser();
	homepage =new HomePage();
	createAcct=new CreateAccountPage();
	homepage.verifyCreateAccountLink();
	
}
@Test(priority=1)
public void testPagetitle() {
	//String title=createAcct.verifyPageTitle();
	System.out.println(createAcct.verifyPageTitle());
	Assert.assertEquals(createAcct.verifyPageTitle(),"Create New Customer Account");
	
	
}
@Test(priority=2)
public void testCreateAccount() {
	createAcct.verifyCreateAccount();
}

@AfterMethod // @AfterClass 
	public void closeAction() throws InterruptedException {
		driver.quit();
		Thread.sleep(1500);
	}
}
