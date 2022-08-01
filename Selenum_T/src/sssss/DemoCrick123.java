package sssss;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCrick123 {

	public static void main(String[] args) {
		System.out.println("Hello wait function");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
		driver.manage().window().maximize();
		WebElement table=   driver.findElement(By.xpath("//div[@id='innings_1'] / child :: div[1]"));
		List<WebElement>ls=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int count=ls.size();
		System.out.println(count);
		
		//for run
	List<WebElement>rls=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)"));
		int rcount=rls.size();
		System.out.println(rcount);
		int sum=0;
		for (int i = 0; i < rcount-2; i++)
		{
	String run=		table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
			int runvalue=Integer.parseInt(run);
			sum=sum+runvalue;
			System.out.println(sum);	
		}
		System.out.println("Run is "+sum);
		//Extra run
		String erun=table.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[14]/div[2]")).getText();
		int erunvalue=Integer.parseInt(erun);
		
		int totalrun=sum+erunvalue;
		System.out.println("Total ru is"+totalrun);
		
		
		
		
}
}