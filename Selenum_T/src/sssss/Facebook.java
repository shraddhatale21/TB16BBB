package sssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	System.out.println("hello facebook");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//tagname id
	driver.findElement(By.cssSelector("input#email")).sendKeys("shraddha");//username
	
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("tale123");
	//login using tagname att value
	driver.findElement(By.cssSelector("button[name='login']")).click();
	//tagname classnmae att value
	driver.findElement(By.className("button._42ft[name='login']")).clear();
	
	
	//match with substring
	driver.findElement(By.cssSelector("input[name^='email']")).sendKeys("1234");
	
	//drirect method parent >child
	driver.findElement(By.cssSelector("div[class='_6lux'] >input[id='email']")).sendKeys("dipak");
	//using space
	driver.findElement(By.cssSelector("div[class='_6lux']  input[id='email']")).sendKeys("sss");
	
	//nth child
	driver.findElement(By.cssSelector("div._6ltg :nth-child(1)")).click();
	

	
	
}
}
