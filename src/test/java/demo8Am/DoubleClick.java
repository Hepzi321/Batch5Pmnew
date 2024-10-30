package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {
WebDriver driver = HelperClass.browserSetting("chrome");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement field1 = driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("8AM Batch");
		
		WebElement copytext = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
	//Action class
		
		Actions act = new Actions(driver);
		

		act.doubleClick(copytext).perform();
	}
}
		