package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardaction_Multiple {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://text-compare.com/");
		
		WebElement input1=driver.findElement(By.xpath("//textarea [@name='text1']"));
		WebElement input2=driver.findElement(By.xpath("//textarea [@name='text2']"));
		
		input1.sendKeys("Welcome to selenuim");
		
		Actions act=new Actions(driver);
		
		
		//Ctrl+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl+C
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//tab-shift to input box2
		
		act.sendKeys(Keys.TAB).perform();
		
		
		//ctrl+v
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		

	}

}
