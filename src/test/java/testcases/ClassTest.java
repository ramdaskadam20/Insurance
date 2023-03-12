package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTest {
	WebDriver driver;
	@BeforeMethod
	public void googleTest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
	}
	@Test
	public void test1()
	{
	
	boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	@AfterMethod
	public void close()
	{
		System.out.println("close all browser");
	}
}
