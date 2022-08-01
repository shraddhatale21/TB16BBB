package sssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocator {
public static void main(String[] args) {
	System.out.println("css locator");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Downloads/index%20(1).html");
		driver.findElement(By.cssSelector("input#uid")).sendKeys("shraddha");
		driver.findElement(By.cssSelector("input#pid")).sendKeys("s123@");
		
//tagname calss
		driver.findElement(By.cssSelector("input.username")).sendKeys("abc");
//tagname attribute and value
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("qqsqs");
//tagname classnmae attribute value
		
		driver.findElement(By.cssSelector("input.username[name='uname']")).sendKeys("as123");
		
		
}
}
