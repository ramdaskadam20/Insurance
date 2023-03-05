package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handledropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement country=driver.findElement(By.xpath("//select[@id='input-country']"));
	
		Select s=new Select(country);
		Thread.sleep(3000);
		
		//s.selectByVisibleText("Albania");
		//s.selectByValue("9");
		//s.selectByIndex(9);
		List<WebElement>alloptions=s.getOptions();
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}

	}

}
