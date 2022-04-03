package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	
	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
	 WebDriver driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("http://www.google.com/");
	 
	 String url = driver.getCurrentUrl();
     System.out.println(url);
	 
	 WebElement search = driver.findElement(By.name("q"));
	 search.sendKeys("Youtube");
	 
	 Thread.sleep(3000);	
	 driver.findElement(By.name("btnK")).click();
	  
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//h3[contains(text(),'YouTub')]")).click();
	 
	 String tit = driver.getTitle();
	 System.out.println(tit);
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Arabic Kuthu");
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	 
	 Thread.sleep(3000);
	 
 
     		
	 
	 
	 
	 		
	 
	 
	 
	}

}
