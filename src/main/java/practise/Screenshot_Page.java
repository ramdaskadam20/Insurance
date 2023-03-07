package practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Page {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com/");
		
		/*//Full pagescreenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti=new File("E:\\documents\\screenshot\\ram.jpg");
		FileHandler.copy(src, desti); */
		
		
		//Specific part
		WebElement part=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=part.getScreenshotAs(OutputType.FILE);
		File desti=new File("E:\\documents\\screenshot\\products.jpg");
		FileHandler.copy(src, desti);
	}

}
