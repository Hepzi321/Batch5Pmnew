package demo8Am;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	
	public static void main(String[] args) {
		
		ChromeOptions c = new ChromeOptions();
		
		c.addArguments("--headless");
		
		
		
		WebDriver driver = new ChromeDriver(c);


driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

String title = driver.getTitle();

System.out.println(title);



}
}
