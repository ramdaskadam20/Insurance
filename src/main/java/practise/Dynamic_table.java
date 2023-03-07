package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_table {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/admin/index.php");
	
		
		//login
		driver.findElement(By.name("username")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='sales']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='orders']")).click();

	}

}
