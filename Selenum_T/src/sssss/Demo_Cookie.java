package sssss;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.Cookie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Cookie {
	public static void main(String[] args) {
		System.out.println("Hello wait function");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Set<org.openqa.selenium.Cookie> c=driver.manage().getCookies();
		
		
		int count=c.size();
		System.out.println(count);
		
	 
		
}
}
