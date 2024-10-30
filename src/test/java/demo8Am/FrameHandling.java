package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHandling {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetting("chrome");
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//switching to single frame using id
		
//		driver.switchTo().frame("singleframe")

		//switching to single frame using frame element
		
	WebElement iframe = driver.findElement(By.name("SingleFrame"));
//		
//		driver.switchTo().frame(iframe);
//				
//		WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
//		
//		inputbox.sendKeys("selenium");
		
		
		//switching to single frame using index
		
		driver.switchTo().frame(1);
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
		
		inputbox.sendKeys("selenium");
		
		
		driver.switchTo().defaultContent();    //It will switch to the default webpage
		
		
		WebElement inlineframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		inlineframe.click();
		
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(innerframe);
		
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		
		element.sendKeys("Selenium");
		
		driver.switchTo().frame(outerframe);
		
		driver.switchTo().defaultContent();
	}

}
