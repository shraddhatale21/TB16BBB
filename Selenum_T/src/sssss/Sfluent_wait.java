package sssss;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Sfluent_wait {
	public static void main(String[] args) {
		System.out.println("hello");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement element =w.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				WebElement msg=t.findElement(By.xpath("//*[@id=\"demo\"]"));
				System.out.println("Hello this id fluent");
				String s=msg.getText();
				if(s.equalsIgnoreCase("Software Testing Material - DEMO PAGE"))
				{System.out.println(s);
				return msg;
			}
				else {
				return null;
			}
		}
		
		
		
	});

}
}
