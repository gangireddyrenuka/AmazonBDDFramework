package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import readConfiguration.ReadCRMConfiguration;

public class TestBaseClass {
	protected WebDriver driver;
	protected ReadCRMConfiguration conf=new ReadCRMConfiguration();
	protected String browserName=conf.getbrowser();
	protected String chromepath=conf.getchromepath();
	 String firefoxpath=conf.firefoxpath();
	
	public void Instializationbrowser()
	{
		if(browserName.equalsIgnoreCase("chrome")){
			
		System.setProperty("webdriver.chrome.driver",chromepath);
		 driver=new ChromeDriver();
		}
		 
		 else if(browserName.equalsIgnoreCase("firefox")){
			 System.setProperty("webdriver.gecko.driver",firefoxpath);
			 driver=new FirefoxDriver();
		 }
		driver.get(conf.getpropertyUrlApp());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	
}
