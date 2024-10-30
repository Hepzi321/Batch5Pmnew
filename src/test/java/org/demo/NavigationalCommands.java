package org.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		
		driver.navigate().forward();
		
		driver.navigate().forward();
		
		driver.navigate().forward();
		
		
		
		
		
	}

}
