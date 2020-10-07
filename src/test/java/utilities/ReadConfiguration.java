package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfiguration {
	
	public static Properties prop;
	
	public ReadConfiguration(){
		
		File f=new File("./configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(f);
			
			Properties prop = new Properties();
			prop.load(fis);
		}
		
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
  //  public static void main(String[] args){
		
		//ReadConfiguration rc = new ReadConfiguration();
	
		//System.out.println(prop.getProperty("url"));
		
		
	//}
	
	public String geturlApplication()
    {
		String urlapp = prop.getProperty("url");
		return urlapp;
	}
	
	public String getBrowser()
	{
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	public String getUserName(){
		
		String uName=prop.getProperty("username");
		return uName;
	}
	
	public String getPassWord(){
		
		String pswd= prop.getProperty("password");
		return pswd;
		
		
	}
	//public String ContinueBtn()
	//{
		
	//}
	
	public String chromPath()
	{
		String chrompath= prop.getProperty("chrompath");
		return chrompath;
	}
	
	public String firefoxPath()
	{
		String firefoxpath= prop.getProperty("firefoxpath");
		return firefoxpath;
	}


}
