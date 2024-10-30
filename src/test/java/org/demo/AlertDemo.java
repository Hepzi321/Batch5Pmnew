package org.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertDemo  {
	
public static void main(String[] args) throws InterruptedException{
	


	WebDriver driver = HelperClass.browserSetup("edge");
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.manage().window().maximize();
	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//	
//	
//	
//Alert alt = driver.switchTo().alert();
//alt.accept();
//
//	System.out.println(alt.getText());
	
	
	//Confirm alert
	
//	driver.findElement(By.xpath("//Click for JS Confirm']")).click();
//	
//	Alert alt = driver.switchTo().alert();
//	
//	alt.dismiss();
//	alt.accept();
	
	//prompt alert
	
//	
//	driver.findElement(By.xpath("//Click for JS Prompt']")).click();
//	
//	Alert alt = driver.switchTo().alert();
//	
//	alt.sendKeys("Selenium");
//	alt.accept();
}

}