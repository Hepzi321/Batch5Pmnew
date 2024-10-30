package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) {
		
	
	WebDriver driver = HelperClass.browserSetting("chrome");
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	WebElement gmail = driver.findElement(By.linkText("Gmail"));
	//Action class
	
	Actions act = new Actions(driver);
	act.contextClick(gmail).build().perform();
	}

}
