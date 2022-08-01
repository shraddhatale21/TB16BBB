package sssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
public static void main(String[] args) {
	System.out.println("hello facebook");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//name
	WebElement n=driver.findElement(By.name("email"));
	n.sendKeys("Shraddha21");
	
	//password
	
	WebElement s=driver.findElement(By.id("pass"));
	s.sendKeys("Tale123");
	
	//login
	//driver.findElement(By.tagName("button")).click();
	
	//forgot password
	driver.findElement(By.linkText("Forgotten password?")).click();
	
	
}
}
