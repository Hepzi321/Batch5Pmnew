package demo8Am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGetAttribute {
	
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	WebElement inpubox = driver.findElement(By.name("q"));
	
	inpubox.sendKeys("A.P.J Abdul Kalam");
	String attribute = inpubox.getAttribute("value");
	
	System.out.println(attribute);
	
	String classname = inpubox.getAttribute("class");
	System.out.println(classname);
	
	String name= inpubox.getAttribute("name");
	System.out.println(name);
	
	WebElement gmail = driver.findElement(By.linkText("Gmail"));
	
	String innerHTML = gmail.getAttribute("innerHTML");
	
	System.out.println(innerHTML);
	
	
}

}
