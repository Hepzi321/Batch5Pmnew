package org.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingWindows {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement inputbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
	
	    inputbox.sendKeys("selenium");
	    inputbox.sendKeys(Keys.ENTER);
	    
	    //Getting all the links
	    
	    
	    
	   List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
	   
	   for(WebElement l:alllinks)
	   {
		   l.click();
	   }
	   
	   // Windows Handling
	  String parentwindowid = driver.getWindowHandle(); // Get the parent window
	   
	  System.out.println("Parent window id" +parentwindowid); //id1E9B4C16FC58CBE3A67E9741768462C9

	  Set<String> allwindows = driver.getWindowHandles();
	  
	  // Switch to all the child windows and get the title of it
	  
//	  for (String Currhandle: allwindows)
//	  {
//		driver.switchTo().window(Currhandle);
//		String title = driver.getTitle();
//		System.out.println(title);
//	  }
//	  
//	  for (String Currhandle: allwindows)
//	  {
//		driver.switchTo().window(Currhandle);
//		String title = driver.getTitle();
//		
//		if(title.equals("Selenium disulfide - Wikipedia"))
//		{
//		System.out.println(title);
//		driver.close();
//	   }
////		
//		List<String> l = new ArrayList<>(allwindows);
		
//	for (String a : l)
//	{
//		driver.switchTo().window(a);
//		driver.close();
////	}
//		
//		driver.switchTo().window(l.get(4));
//		String title2 = driver.getTitle();
//		System.out.println(title2);
//	  
//	}
	  
	  for (String currhandle : allwindows)
	  {
		  if (parentwindowid!=currhandle)
		  {
			  driver.switchTo().window(currhandle);
			  String title = driver.getTitle();
			  System.out.println(title);
		  }
		  
	  }
	  
	  
	}

}
