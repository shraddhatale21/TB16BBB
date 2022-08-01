package sssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathLocator {
public static void main(String[] args) {
	System.out.println("xpath locator");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Downloads/index%20(1).html");
	//name  absolute 
	driver.findElement(By.xpath("/html/body/form/div[1]/input[1]")).sendKeys("cjc");
	//id  relative
	driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("cjc@123");
	
	//for dropbox  dynamic path   parent
	
	WebElement dd=driver.findElement(By.xpath("//option[1]/parent :: select"));
	Select s=new Select(dd);
	s.selectByIndex(2);
	//rememberme  child
	driver.findElement(By.xpath("//label[3]/child :: input")).click();
	
	
	//login  
	//driver.findElement(By.xpath("//div[1]/child :: button[1]")).click();
	//rememeber me sibling  not found
	//driver.findElement(By.xpath("//input[3]/preceding-sibling :: input[1]")).click();
	
	
	//not find   login
	//driver.findElement(By.xpath("//button[1]/preceding-sibling :: label[3]")).click();
	
	//driver.findElement(By.xpath("//button/preceding - sibling :: *")).click();
	
	
	
	
}
}
