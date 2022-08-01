package sssss;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class Test {
public static void main(String[] args) {
	System.out.println("this is basic selenium");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/USER/Downloads/index.html");
	WebElement un=driver.findElement(By.id("uid"));
	un.sendKeys("CJC");
	driver.findElement(By.name("pass")).sendKeys("cjc@132");
	
	//driver.findElement(By.className("login")).click();
	
	WebElement dd=driver.findElement(By.tagName("select"));
	Select s=new Select(dd);
	s.selectByIndex(2);
	
	driver.findElement(By.linkText("Password? ")).click();
	
}
}
