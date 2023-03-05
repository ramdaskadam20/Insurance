import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElemennt {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	 
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://demo.nopcommerce.com/");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
	  WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	  Thread.sleep(3000);
	   submit.click();
	   
	   List<WebElement> all=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
	  System.out.println(all.size());
	  
	  for(WebElement text:all)
	  {
		  System.out.println(text.getText());
	  }
	  
	}

}
