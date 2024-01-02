package Sample;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		String str =  driver.findElement(By.xpath("")).getText();
		
		//By class in selenium is abstract class which ,means we can not create object
				
		// 100 elements
		List<WebElement> l1= driver.findElements(By.xpath(""));
		
		//Set have String values : So depends on what my method is returning my return type will change
		// if this Store String i have to store String
		Set<String> myWindows= driver.getWindowHandles();
		
		

	}

}
