package sssss;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demifootter_link {
	public static void main(String[] args) {
		System.out.println("Hello wait function");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Total Hiperlink
		
		List<WebElement> lsh=driver.findElements(By.tagName("a"));
		int totalhl=lsh.size();
		System.out.println(totalhl);
		
		//Total footer no of hiperlink
		
		WebElement footer=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]"));
		List<WebElement> shlk=footer.findElements(By.tagName("a"));
		int s=shlk.size();
		System.out.println(s);
		
		// specific no of hyperlink on footer
		WebElement sfooter=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));
		List<WebElement> p=sfooter.findElements(By.tagName("a"));
		int pcount=p.size();
		System.out.println(pcount);
		
		
		
}
}