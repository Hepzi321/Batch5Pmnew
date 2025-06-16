package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo8Am.HelperClass;

public class LinksDemo {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetting("chrome");
		
		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().window().maximize();
		
		// Fetch all the tags
		List<WebElement> alltags = driver.findElements(By.linkText("a"));
		
		for(WebElement tags:alltags)
		{
			String Url = tags.getAttribute("href");
			LinksCheckerDemo.brokenlinkDemo(Url);
			System.out.prinyln("My changes");
		}
	}

}
