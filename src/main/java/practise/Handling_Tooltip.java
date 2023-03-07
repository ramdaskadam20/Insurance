package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Tooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		
	WebElement ele=driver.findElement(By.xpath("//input[@id='age']"));
	
	String tool=ele.getAttribute("title");
	System.out.println(tool);
		

	}

}
