package sssss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {
		System.out.println("Hello wait function");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		//driver.switchTo().alert().accept();
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		//driver.switchTo().alert().dismiss();
		
	
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		   String s=  driver.switchTo().alert().getText();
		   driver.switchTo().alert().accept();
		   System.out.println(s);
		
}
}

