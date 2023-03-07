package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sizeandlocation_ele {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		//location
		System.out.println("location(x,y):"+logo.getLocation());
		System.out.println("location(x):"+logo.getLocation().getX());
		System.out.println("location(y):"+logo.getLocation().getY());
		
		
		
		//
		
		System.out.println("location(x):"+logo.getRect().getX());
		System.out.println("location(y):"+logo.getRect().getY());
		
		//size
				System.out.println("size of ele is:"+logo.getSize());
				
		
	}

}
