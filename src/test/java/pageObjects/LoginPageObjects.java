package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.TestBaseClass;

public class LoginPageObjects extends TestBaseClass {

	 public WebDriver driver;


	public  LoginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//span[text()='Hello, Sign in']")
	WebElement signinAct;
    
	@FindBy(how=How.XPATH,using="//span[@class='nav-line-3']")
	WebElement signInBtn;
 
	@FindBy(how=How.ID,using="ap_email")
	WebElement loginInputBox;

	@FindBy(how=How.ID,using="continue")
	WebElement continueBtn;

	@FindBy(how=How.ID,using="ap_password")
	WebElement passwordInputBox;

	@FindBy(how=How.ID,using="signInSubmit")
	WebElement loginBtn;
	
	public boolean verifySignAct()
	{
		boolean status = signinAct.isDisplayed();
		return status;
	}

	public boolean verifySigntn()
	{
		boolean status = signInBtn.isEnabled();
		return status;
	}

	public boolean verifyloginInputBox()
	{
		boolean status = loginInputBox.isDisplayed();
		return status;
	}


	public boolean verifycontinueButton()
	{
		boolean status = continueBtn.isEnabled();
		return status;
	}
	public boolean verifypasswordInputBox()
	{
		boolean status = passwordInputBox.isDisplayed();
		return status;
	}

	public boolean verifyLoginbutton(){
		boolean status = loginBtn.isEnabled();
		return status;
	}
	
	public void setSignInAct()
	{
		signinAct.click();
	}
	public void setSignInBtn()
	{
		signInBtn.click();
	}


	public void setLoginInputBox(String cInBx)
	{
		loginInputBox.sendKeys(cInBx);
	}

	public void setContinuebtn()
	{
		continueBtn.click();
	}
	
	public void setpassword(String pBx)
	{
		passwordInputBox.sendKeys(pBx);
	}
	
	public void setLoginBtnclick()
	{
		loginBtn.click();
	}
}