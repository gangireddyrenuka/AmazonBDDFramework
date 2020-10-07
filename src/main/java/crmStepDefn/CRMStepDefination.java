package crmStepDefn;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import base.TestBaseClass;
import crmLoginPage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMStepDefination extends TestBaseClass{
	
	//WebDriver driver;
	LoginPage lp=new LoginPage(driver);

	@Given("^user is already in login page$")
	public void user_is_already_in_login_page(){
		
		Instializationbrowser();
		
		 String expectedtitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
		 //System.out.println(title);
		 Assert.assertEquals(expectedtitle, lp.getTitle());

	}

//	@When("^title of the login page is free crm$")
//	public void title_of_the_login_page_is_free_crm() throws Throwable {
//
//		 String title=driver.getTitle();
//		 System.out.println(title);
//		 Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//
//	}

	@Given("User enters username and password")
	public void user_enters_username_and_password() 
	{
		Assert.assertTrue(lp.usernameInputBox());
		lp.setUsername(conf.getusername());
		
		Assert.assertTrue(lp.passwordInputBox());
		lp.setPassword(conf.getpassword());
	}

	@Then("^user clicks on login page$") 
	public void user_clicks_on_login_page() throws Throwable
	{
	 Assert.assertTrue(lp.loginBtn());
	 lp.loginBtn();
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeAsyncScript("arguments[0].click();" ,loginBtn);
	//}
	//@Then("^user is on home page$")
	//public void user_is_on_home_page() throws Throwable {
		
		//String title=driver.getTitle();
		//System.out.println("Home page title::" + title);
		//Assert.assertEquals("COGMENTO", title);
				
//	 @Then("^close the browser$")
//	public void close_the_browser()
//	{
//		
//		driver.quit();
//	}
}
}