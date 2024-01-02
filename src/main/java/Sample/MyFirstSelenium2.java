package Sample;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstSelenium2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		List<WebElement> allElements= driver.findElements(By.xpath(""));
		
		Set<String> allWindows= driver.getWindowHandles();
		
		

	}

}
