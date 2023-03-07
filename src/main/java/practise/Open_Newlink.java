package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Newlink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.nopcommerce.com/");
		
		String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Register")).sendKeys(tab);
		

	}

}
