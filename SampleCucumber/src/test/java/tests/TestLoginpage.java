package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginpage 
{
WebDriver driver;
@Test(priority =0)
public void testsetup()
{
	 WebDriverManager.chromedriver().driverVersion("111.0.5563.65").setup();
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(co);
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 
}
@Test(priority=1)
public void testlogin()
{
	
UltimateQA_Homepage homepage=PageFactory.initElements(driver, UltimateQA_Homepage.class);
homepage.OrangeHrmlogin("Admin", "admin123");


}


	

	
	
}
