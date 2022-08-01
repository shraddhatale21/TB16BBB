package sssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;

public class DemoWeb {
public static void main(String[] args) throws InterruptedException {
	System.out.println("hello");
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Desktop\\cjc1\\Testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/USER/Downloads/index%20(1).html");
	//sendkey usernmae
	driver.findElement(By.id("uid")).sendKeys("Shraddha");
	//click login
	//driver.findElement(By.id("login")).click();
//getText username
             WebElement u=driver.findElement(By.xpath("//label[@for='uname']"));
                  String utex=u.getText();
                  System.out.println(utex);
//getAttribute
    WebElement unv=driver.findElement(By.id("uid"));
                 System.out.println(unv.getAttribute("value"));
  
    Thread.sleep(2000);
   
    unv.clear();
                  
    //sub,it
   // WebElement login =driver.findElement(By.id("login"));
   // login.submit();
    
    //isDisplayed
    WebElement un =	driver.findElement(By.id("uid"));
    Boolean f=un.isDisplayed();
    System.out.println(un.isDisplayed());
    
    //checkbox
        WebElement a=  driver.findElement(By.id("remem"));
        Boolean d=a.isSelected();
    System.out.println(a.isSelected());
    
    //login enable
    WebElement l=driver.findElement(By.id("login"));
    Boolean k=l.isEnabled();
System.out.println(l.isDisplayed());
    

     
    
    		
    		
}
}
