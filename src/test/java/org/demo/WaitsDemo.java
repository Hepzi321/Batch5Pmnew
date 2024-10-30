package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {
	public static void main(String[] args) {
		
	

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	WebElement e = driver.findElement(By.xpath("//*[@aria-haspopup='false']"));
	
	e.sendKeys("Oranium");
	
}
}
