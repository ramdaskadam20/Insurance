package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_wait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//Explicit wait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("selenuim");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		WebElement ele=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='WebDriver']")));
		
		//driver.findElement(By.xpath("//a[text()='WebDriver']")).click();
		ele.click();


	}

}
