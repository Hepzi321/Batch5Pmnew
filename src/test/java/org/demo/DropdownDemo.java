package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	public static void main(String[] args) {
		
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://letcode.in/dropdowns");
	
	driver.manage().window().maximize();
//	
//	WebElement dropdown = driver.findElement(By.id("fruits"));
//	
//	Select s = new Select (dropdown);
//	
//	s.selectByIndex(1);
//	
//	s.selectByValue("2");
//	
//	s.selectByVisibleText("Pine Apple");
//	
//	List<WebElement> options = s.getOptions();
//	
//	for (WebElement opt: options)
//	{
//		System.out.println(opt.getText());
//	}
//	}
	
	WebElement multidrop = driver.findElement(By.id("superheros"));
	
	Select s = new Select(multidrop);
	s.selectByIndex(2);
	s.selectByValue("bw");
	s.selectByVisibleText("Black panther");
	
	WebElement f = s.getFirstSelectedOption();
	System.out.println(f.getText());
	
	List<WebElement> options = s.getAllSelectedOptions();
	
	System.out.println("Print all the selected options...");
	
	for(WebElement opt : options)
	{
		System.out.println(opt.getText());
	}
	
	System.out.println("Print available options in multidropdowns");
	
	List<WebElement> options2 = s.getOptions();
	
	for(WebElement p : options2)
	{
		System.out.println(p.getText());
	}
	
	
	s.deselectByIndex(2);
	s.deselectByValue("bw");
	s.deselectByVisibleText("Black panther");
	s.deselectAll();
	}
	

}
