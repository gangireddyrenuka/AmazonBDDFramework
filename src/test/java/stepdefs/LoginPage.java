//package stepdefs;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import base.TestBaseClass;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LoginPageObjects;
//
//public class LoginPage extends TestBaseClass {
//	
//public  WebDriver driver;
//
//LoginPageObjects lp=new LoginPageObjects(driver);
//
//@Given("^User is on loginpage$")
//public void user_is_on_loginpage() {
//	
//	instializationbrowser();
//	
//	Assert.assertTrue(lp.verifySignAct());
//	lp.setSignInAct();
//	
//	Assert.assertTrue(lp.verifySigntn());
//	lp.setSignInBtn();
//	//System.setProperty("webdriver.chrome.driver", "C:/Users/Kaushik/github/AmazonBDDFramework/Drivers/chromedriver.exe");
//    // WebDriver driver=new ChromeDriver();
//     //driver.manage().window().maximize();
//    // driver.get("https://www.amazon.in/");
//     
//     //WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
//	// Actions act=new Actions(driver);
//     //act.moveToElement(signin).click().build().perform();
//}
//
//@And("^User enters valid email or phonenumber$")
//public void user_enters_valid_email_or_phonenumber() throws InterruptedException {
//	
//	//Thread.sleep(3000);
//	//WebElement phnNumber = driver.findElement(By.xpath("//input[@id='ap_email']"));
//	//phnNumber.sendKeys("gangireddyrenuka253@gmail.com");
//	Assert.assertTrue(lp.verifyloginInputBox());
//	lp.setLoginInputBox(conf.getUserName());
//	
//	Assert.assertTrue(lp.verifycontinueButton());
//	lp.setContinuebtn();}

//@And("^ And user is enters "<username>" and "<password>"")
//
//@When("^Click on continue button$")
//public void click_on_login_button() {
//	//WebElement continueBtn=driver.findElement(By.id("continue"));
//	//continueBtn.click();
//
//Assert.assertTrue(lp.verifypasswordInputBox());
//lp.setpassword(conf.getPassWord());
//
//Assert.assertTrue(lp.verifyLoginbutton());
//lp.setLoginBtnclick();
//}
//
//@Then("user should be displayed Amazonpage")
//public void user_should_be_displayed_Amazonpage() {
//	
//WebElement password=driver.findElement(By.id("ap_password"));
//	password.sendKeys("devanshi143");	
//}	
//}