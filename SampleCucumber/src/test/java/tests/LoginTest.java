package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 

{
	
 WebDriver driver;
  
 
  
  @Given("user is on login page")
  public void user_is_on_login_page() 
  
  {
	  
	  	 WebDriverManager.chromedriver().driverVersion("111.0.5563.65").setup();
	  	 ChromeOptions co = new ChromeOptions();
	  	 co.addArguments("--remote-allow-origins=*");
	  	 driver = new ChromeDriver(co);
	  	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  	 driver.manage().window().maximize();
	  	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	 
	  	 
	  
	  
	  
  }

  @When("user logins")
  public void user_logins() 
  {
	  UltimateQA_Homepage homepage=PageFactory.initElements(driver, UltimateQA_Homepage.class);
	  homepage.OrangeHrmlogin("Admin", "admin123");
      
  }

  @Then("user is navigated to Homepage")
  public void user_is_navigated_to_Homepage() 
  {
	  String Title=driver.getTitle();
		if( Title.contains("hrm"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("fail");
		}
      
  }


}
