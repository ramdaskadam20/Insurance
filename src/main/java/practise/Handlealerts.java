package practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlealerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		
		 alt.accept();*/
		
		/*driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alt=driver.switchTo().alert();
		alt.dismiss(); */
		
		
       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("welcome");
		Thread.sleep(3000);
		alt.accept();
		

	}

}
