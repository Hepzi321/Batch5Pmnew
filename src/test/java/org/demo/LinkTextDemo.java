package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);		
		WebElement e = driver.findElement(By.partialLinkText("ail"));
		
		e.click();
		
			driver.close();
	}

}
