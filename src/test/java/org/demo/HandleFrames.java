package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame("singleframe");
		
		//driver.switchTo().frame(1);
		
//		
//	
//WebElement frameElement = driver.findElement(By.name("singleframe"));
//		
//		driver.switchTo().frame(frameElement);
//		
//		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		e.sendKeys("Oranium");
//		
//	driver.switchTo().defaultContent(); // It will switch to the default webpage
		//Inline frame
	WebElement inlineframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	
	inlineframe.click();
	
	
	WebElement outterframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(outterframe);
	
	
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	
	driver.switchTo().frame(innerframe);
		
		
			WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
			e.sendKeys("Selenium");
			
	}
}
