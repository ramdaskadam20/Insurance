package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {

	public static void main(String[] args) throws InterruptedException {
      
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//sendkeys
		driver.get("https://www.foundit.in/");
		
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("E:\\testing\\Ram2022\\Ramdaska_cv.pdf");
		Thread.sleep(2000);
		
		//By using robot class
		WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		//copy path,Ctrl+v,Enter
		
		  //Robot rb=new Robot();
		
		
		
		
		
		

	}

}
