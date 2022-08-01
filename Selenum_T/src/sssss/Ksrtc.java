package sssss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ksrtc {
	public static void main(String[] args) throws InterruptedException 
	{
		 System.out.println("This is Java Script Program");
		 System.setProperty("webdriver.chrome.driver","F:\\Selenium Server And Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
			 
		 driver.get("https://ksrtc.in/oprs-web/");
			 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 
	//For page ScrollDown
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("scrollBy(0,300)");
		 
	//Leaving From:
		 
		 WebElement cityname = driver.findElement(By.id("fromPlaceName"));
		 cityname.sendKeys("BENG");
		 
		 JavascriptExecutor js1 = (JavascriptExecutor)driver;
		 
		 	String jcityname = "return document.getElementById(\"fromPlaceName\").value;";
		 	
		 	String ctynm = (String)js1.executeScript(jcityname);
		 	
		 	System.out.println(ctynm);
		 	
		 	while(!ctynm.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		 	{
		 		Thread.sleep(2000);
		 		cityname.sendKeys();
		 		jcityname = "return document.getElementById(\"fromPlaceName\").value;";
		 		ctynm = (String)js1.executeScript(jcityname);
			 	
			 	System.out.println("In While Loop :: "+ctynm);
		    }
		 	
		 	driver.findElement(By.id("fromPlaceName")).sendKeys();
		 	
		 
		 
		 
}
}