package practise;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_wait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		             //Fluent wait
				Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
						.withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(5))
						 .ignoring(NoSuchElementException.class);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		  
		
		driver.findElement(By.name("q")).sendKeys("selenuim");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		//usage of fluient wait
		WebElement ele=wait.until(new Function<WebDriver,WebElement>()
				{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//a[text()='WebDriver']"));
			}
			
		  });
		
		//driver.findElement(By.xpath("//a[text()='WebDriver']")).click();
		
            ele.click();


	}

}
