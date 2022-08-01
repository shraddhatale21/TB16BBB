package sssss;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) {
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	//driver.get("https://demo.guru99.com/test/newtours/index.php");
	driver.get("https://demo.guru99.com/test/newtours/index.php");
	WebElement a=driver.findElement(By.name("userName"));
	a.sendKeys("Shraddha");
	//password
	WebElement aa=driver.findElement(By.name("password"));
	aa.sendKeys("tale123");
	//
	driver.findElement(By.tagName("submit")).click();
	
	
}

}
