package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
WebDriver driver = HelperClass.browserSetting("chrome");
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		WebElement rome = driver.findElement(By.id("box6"));
		
		WebElement denmark = driver.findElement(By.id("box104"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(washington, norway).dragAndDrop(rome, denmark).build().perform();
		
		
		
	}

}
