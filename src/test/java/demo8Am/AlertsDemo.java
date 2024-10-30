package demo8Am;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetting("chrome");
		
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement e = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
//		
//		e.click();
	
	
//		
//		Alert alt = driver.switchTo().alert();
//		
//		alt.accept();
		

		//Confirm alert
//		
//	driver.findElement(By.xpath("//Click for JS Confirm']")).click();
//	
//	Alert alt = driver.switchTo().alert();
//	
//alt.dismiss();
//alt.accept();
		
		//prompt alert
//		driver.findElement(By.xpath("//Click for JS Prompt']")).click();	
	
//		Alert alt = driver.switchTo().alert();
//		alt.sendKeys("Selenium");
//		alt.accept();
		
		
	}

}
