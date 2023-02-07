package ecomm.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	public static Properties properties;
	public BaseClass() {
		try {
			properties= new Properties();
			FileInputStream fInput=new FileInputStream("../EcommBizness/src/main/java/ecomm/utility/Configuration.properties");
					properties.load(fInput);
		 }catch(FileNotFoundException e) {
			 e.printStackTrace();
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	}
	public void initialzeBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(properties.getProperty("baseURL"));
	}
	

}
