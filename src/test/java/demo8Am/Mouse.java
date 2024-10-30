package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetting("chrome");
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//Mouse Hover operation
		
		WebElement arrow = driver.findElement(By.xpath("////span[@class='nav-line-2 ']/span']"));
		
		WebElement orders = driver.findElement(By.xpath("//span[text()='Orders']"));
		
		//Action class
		
		Actions act = new Actions(driver);
		
		act.moveToElement(arrow).perform();
		
		act.moveToElement(orders).click().perform();
		
		
		
		
		
		
		
		
	
		

}
}
