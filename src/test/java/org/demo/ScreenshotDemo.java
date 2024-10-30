package org.demo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenshotDemo {
	
//	
//	public static void captureCompleteScreenshot() throws AWTException, IOException
//	{
//		
//		Robot r = new Robot();
//		
//	//Get the screen size
//		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
//		
//		Rectangle rect = new Rectangle(d);
//		
//		BufferedImage b = r.createScreenCapture(rect);
//		
//	File de = new File("./Screenshot/Robot" +System.currentTimeMillis()+ ".png");
//		
//		
//		
//		
//		
//	ImageIO.write(b, "png", de);
//		
//		
//	}
	
	public static void captureScreenshot(WebDriver driver) throws IOException
	{
	
	TakesScreenshot tks = (TakesScreenshot)driver; //we are downcasting to the driver
	
	File temp = tks.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./screenshot/facebook "+System.currentTimeMillis() +".png"); //It is my destination path
	
	FileUtils.copyFile(temp, dest);
	
	
	}
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
	
	WebDriver driver = HelperClass.browserSetup("chrome");
	
 driver.get("https://www.facebook.com/");
 
 driver.manage().window().maximize();
 
 WebElement uname = driver.findElement(By.id("email"));
 
 uname.sendKeys("Oranium@gmail.com");
 
 captureScreenshot(driver);
 
 Thread.sleep(2000);
 
 WebElement pass = driver.findElement(By.id("pass"));
 
 pass.sendKeys("oranium123");
 
 Thread.sleep(2000);
 
 
 
 driver.findElement(By.name("login")).click();
}

}