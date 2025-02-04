package demo8Am;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	
	public static void main(String[] args) {
		
	
	
	WebDriver driver = HelperClass.browserSetting("edge");
	driver.get("https://letcode.in/dropdowns");

	driver.manage().window().maximize();
	
//	WebElement dropdown = driver.findElement(By.id("fruits"));
//	
//	Select s = new Select(dropdown);
//
//s.selectByIndex(1);



//	s.selectByValue("2");
////	s.selectByVisibleText("Pine Apple");
//	
//	List<WebElement> options = s.getOptions();
//	
//	for(WebElement opt : options)
//	{
//		System.out.println(opt.getText());
//	}
	
	WebElement multidropdown = driver.findElement(By.id("superheros"));
	
Select s1 = new Select(multidropdown);

s1.selectByIndex(2);
s1.selectByValue("am");
s1.selectByVisibleText("Black Panther");
s1.selectByIndex(7);

WebElement f = s1.getFirstSelectedOption();
System.out.println(f.getText());

List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();

for(WebElement opt: allSelectedOptions)
{
	System.out.println(opt.getText());
}


s1.deselectByValue("ta");
s1.deselectByIndex(0);
s1.deselectByVisibleText("Black Panther");
s1.deselectAll();

}
}