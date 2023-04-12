package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebManager
{
public static WebDriver browser;
	

	public static void main(String[] args) throws InterruptedException 
	{
		
		  WebDriverManager.chromedriver().driverVersion("111.0.5563.65").setup();
		  ChromeOptions co = new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 browser = new ChromeDriver(co);
		 browser.get("https://www.google.com/");
		 browser.manage().window().maximize();
		 browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         browser.findElement(By.name("q")).sendKeys("testing");
         
         List<WebElement> suggestions=browser.findElements(By.xpath("//ul[@class='G43f7e']/li"));
         
		
         for (WebElement suggestion : suggestions) 
         {
			System.out.println(suggestion.getText());
		 }
         
         
     
         
         browser.switchTo().newWindow(WindowType.TAB).navigate().to("https://www.yahoo.com/");
         
         
         
	}

	
	
}
