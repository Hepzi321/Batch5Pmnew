package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpathDemo {
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.id("APjFqb"));
		
		textbox.click();  //to click
		
		textbox.sendKeys("Elon musk");  //Enter the values
		
		textbox.sendKeys(Keys.ENTER);   //search or enter
		
		Thread.sleep(3000);         //To wait for sometime (2000) 2 sec
		
		driver.close();          //To close the driver
		
		
		
	}

}
