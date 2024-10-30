package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {
public static void main(String[] args) {
	WebDriver driver = HelperClass.browserSetting("edge");
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
//	WebElement inputbox = driver.findElement(By.name("q"));
//	
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	
//	WebElement ib = wait.until(ExpectedConditions.elementToBeClickable(inputbox));
//	
//	ib.sendKeys("Abdul Kalam");
//	
//	Boolean u = wait.until(ExpectedConditions.titleIs("Google"));
//	
//	System.out.println(u);
//	
	
}
}
