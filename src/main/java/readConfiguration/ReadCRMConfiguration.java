package readConfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class ReadCRMConfiguration  {
	WebDriver driver;
	 public  static Properties  prop;
	public ReadCRMConfiguration()
	{
		
		File f= new File("./configuration/config.properties");
		
		try
		{
			
			FileInputStream fis=new FileInputStream(f);
			 prop= new Properties();
			prop.load(fis);
			
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				
				
			}
	}
		
//		public static void main(String args[])
//		{
//			ReadCRMConfiguration cong=new ReadCRMConfiguration();
//			System.out.println(prop.getProperty("url"));
//		}
	public String getpropertyUrlApp(){
		
		String urlapp= prop.getProperty("url");
		return urlapp;
	}
public String getbrowser(){
		
		String brows= prop.getProperty("browser");
		return brows;
	}
		
public String getusername(){
	
	String uname= prop.getProperty("username");
	return uname;
}

public String getpassword(){
	
	String pwd= prop.getProperty("password");
	return pwd;
}
public String getchromepath()
{
	String crome=prop.getProperty("chrompath");
	return crome;
			
}
	
	
public String firefoxpath()
{
	String fox=prop.getProperty("firefox");
	return fox;
			
}

}
