package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetting("chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.id("pass"));
	//	WebElement login = driver.findElement(By.id("loginbutton"));
		
	//Action class
		Actions act = new Actions(driver);
		
		//1. send the text to email box as oranium
		
		act.sendKeys(email, "Oranium").perform();
		
		//2.select the text, ctrl + a
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		//3. ctrl + c
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//4. TO move to the password field
//		act.sendKeys(Keys.TAB).perform();
		
		act.moveToElement(pass).click().perform();
		
	//5. ctrl+v
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();	
		
		//6. two tabs, and then press enter
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
	}

}
