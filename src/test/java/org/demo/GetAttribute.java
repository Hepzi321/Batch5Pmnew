package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("A.P.J Abdul Kalam");
		
		String attribute = input.getAttribute("value");
		
		System.out.println(attribute);
		
		String classname = input.getAttribute("class");
		System.out.println(classname);
		
		String name = input.getAttribute("name");
		System.out.println(name);
		
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		String gmailtext = gmail.getAttribute("innerHTML");
		System.out.println(gmailtext);
		
	}

}
