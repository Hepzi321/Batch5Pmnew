package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConditionalCommands {
	
	
	public static void main(String[] args) throws InterruptedException {
	
         ChromeOptions c = new ChromeOptions();
      
         
         c.addArguments("--headless");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://formstone.it/components/checkbox/");
		
		driver.manage().window().maximize();
		
		
//	   Thread.sleep(2000);
//		
//		WebElement firstname = driver.findElement(By.id("email"));
//		
//		boolean displayed = firstname.isDisplayed();
//		
//		System.out.println(displayed);
//		
//		boolean enabled = firstname.isEnabled();
//		
//		System.out.println(enabled);
//		
//		firstname.isSelected()
		
//		WebElement clickbox = driver.findElement(By.className("fs-checkbox-marker"));
//		
//		clickbox.click();
//		
//		boolean selected = clickbox.isSelected();
//		
//		
//		System.out.println(selected);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
}

}