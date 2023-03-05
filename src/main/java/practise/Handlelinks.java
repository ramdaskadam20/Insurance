package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlelinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.partialLinkText("Mob")).click();
		
		//how to capture all links
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		//System.out.println("Number of links:"+alllinks.size());
		

		for(WebElement links:alllinks)
		{
			System.out.println(links.getText());
			System.out.println(links.getAttribute("href"));
		}
		
		
	}

}
