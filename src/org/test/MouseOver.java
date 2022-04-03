package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement crs = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(crs).perform();
		
		driver.findElement(By.xpath("//span[text()='Selenium']")).click();
		
	 
		 
	    
		
	}

}
