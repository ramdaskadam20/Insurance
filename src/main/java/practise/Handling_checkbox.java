package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List<WebElement> allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
	System.out.println("Total no of checkboxes: "+allcheckboxes.size());
	
	for(WebElement checkbox:allcheckboxes)
	{
		checkbox.click();
	}
		
		

	}

}
