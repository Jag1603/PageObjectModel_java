package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class UltimateQA_Homepage 
{
	WebDriver driver;
	
	
	
	public UltimateQA_Homepage(WebDriver driver)
	{
		this.driver = driver;
	}


	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(how=How.XPATH,using="//button[text()=' Login ']")
	WebElement loginbutton;
	
	@FindBy(how=How.LINK_TEXT,using="Forgot your password?")
	WebElement Forgotpassword;
	
	
	public  void OrangeHrmlogin(String user_name, String Pass_word)
	{
		username.sendKeys(user_name);
		password.sendKeys(Pass_word);
		loginbutton.click();
		
	}
	
	
	
	
	
	

}
