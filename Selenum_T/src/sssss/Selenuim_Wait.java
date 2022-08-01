package sssss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenuim_Wait {
public static void main(String[] args) {
	System.out.println("Hello wait function");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	//implicit wait
	driver.findElement(By.name("reg_email__")).sendKeys("Shraddhatale95@gmail.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//explicit wait
	driver.findElement(By.name("firstname")).sendKeys("Shraddha");
	driver.findElement(By.name("lastname")).sendKeys("Tale");
	driver.findElement(By.name("reg_email__")).sendKeys("shraddhatale21@gmail.com");
	
	WebDriverWait wdw=new WebDriverWait(driver, 10);
	wdw.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email_confirmation__"))).sendKeys("ShraddhaTale21@gmai.com");
	
	
	
}
}
