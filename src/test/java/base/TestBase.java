package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.ReadConfiguration;

public class TestBase {
	
	   protected static WebDriver driver;

	 public static ReadConfiguration conf=new ReadConfiguration();
	 
	 static String browserName = conf.getBrowser();
	 
	 protected static String chromepath = conf.chromPath();
	 
	 protected String firefoxpath = conf.firefoxPath();
	
public void instializationbrowser()
{
	if(browserName.equalsIgnoreCase("chrome")){
		
	System.setProperty("webdriver.chrome.driver",chromepath);
	 driver=new ChromeDriver();
	}
	 
	 else if(browserName.equalsIgnoreCase("firefox")){
		 System.setProperty("webdriver.gecko.driver",firefoxpath);
		 driver=new FirefoxDriver();
	 }
	driver.get(conf.geturlApplication());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
}
	
	}
	
	
	
	


