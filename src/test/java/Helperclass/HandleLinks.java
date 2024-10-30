package Helperclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo8Am.HelperClass;

public class HandleLinks {
	
	public static void main(String[] args) {
		
			WebDriver driver = HelperClass.browserSetting("chrome");
			driver.get("https://www.softwaretestingmaterial.com/");
			driver.manage().window().maximize();
			
			//Fetch all the s tags
			
			List<WebElement> alltags = driver.findElements(By.tagName("a"));
			
			for(WebElement tags:alltags)
			{
				String url = tags.getAttribute("href");
				HelperBrokenLinkCheck.brokenLinkChecker(url);
			}
	}

}
