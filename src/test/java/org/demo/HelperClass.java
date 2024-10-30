package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperClass {
	
	public static WebDriver browserSetup(String browserName){
		
		WebDriver driver = null;
		switch(browserName)
		{
		
		case "chrome":
		driver = new ChromeDriver();
		break;
		
		case "edge":
		driver = new EdgeDriver();
		break;
		
		case "firefox":
		driver = new FirefoxDriver();
		break;
		
		default:
	
		System.out.println("Provide valid browser name");
		
	}
		
		return driver;

}
}
