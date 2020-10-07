package crmLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.NAME,using="username")
	WebElement username;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
	@FindBy(how=How.CLASS_NAME,using="btn btn-small")
	WebElement loginBtn;
	
	public boolean usernameInputBox()
	{
		 boolean status = username.isDisplayed();
		 return status;
	}
	public boolean passwordInputBox()
	{
		 boolean status = password.isDisplayed();
		 return status;
	}
	public boolean loginBtn()
	{
		 boolean status = loginBtn.isEnabled();
		 return status;
	}
	
	public void setUsername(String uName){
		
		username.sendKeys(uName);
	}
public void setPassword(String pwd){
		
		password.sendKeys(pwd);
	}
public void loginbtn(){
	
	loginBtn.click();
}
public String getTitle(){
	String title=driver.getTitle();
	return title;
}

}
