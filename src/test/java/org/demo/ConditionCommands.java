package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConditionCommands {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.id("FirstName"));
		
		boolean displayed = firstname.isDisplayed();
		
		System.out.println(displayed);
		
		boolean enabled = firstname.isEnabled();
		System.out.println(enabled);
		
		WebElement female_radiobtn = driver.findElement(By.id("gender-female"));
		
		female_radiobtn.click();
		
		boolean selected = female_radiobtn.isSelected();
		System.out.println(selected);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
    String pageSource = driver.getPageSource();
    
    System.out.println(pageSource);
	
	driver.close();
		

}
}
