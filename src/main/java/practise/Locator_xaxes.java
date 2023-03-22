package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_xaxes {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	
	//self
	String text=driver.findElement(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/self::a")).getText();
	 
	System.out.println(text);
	
	//parent
	
	String text1=driver.findElement(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/parent::td")).getText();
	 
	System.out.println(text1);
	
	//child
	
		List<WebElement> all=driver.findElements(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/ancestor::tr/child::td	"));
		 
		System.out.println("Number of child ele:    "+all.size());
		
	//Ancestor
	
		String text3=driver.findElement(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/ancestor::tr")).getText();
		 
		System.out.println(text3);
		
	//decent
		
		List<WebElement> dece=driver.findElements(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/ancestor::tr/descendant::*"));
		 
		System.out.println("Number of descedant node:   "+dece.size());
		
	//following
	
		List<WebElement> follow=driver.findElements(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/ancestor::tr/following::tr"));
		 
		System.out.println("Number of follow node:   "+follow.size());
		
	//following-sibilng
		
			List<WebElement> followsi=driver.findElements(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/ancestor::tr/following-sibling::tr"));
			 
			System.out.println("Number of following-sibling node:   "+followsi.size());
			
		
	//preceding
			
			List<WebElement> prece=driver.findElements(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/ancestor::tr/preceding::tr"));
			 
			System.out.println("Number ofpreceding node:   "+prece.size());
     //preceding-sibiling
			
			List<WebElement> precesib=driver.findElements(By.xpath("//a[contains(text(),'Uflex Ltd.' )]/ancestor::tr/preceding-sibling::tr"));
			 
			System.out.println("Number of preceding-sibling node:   "+precesib.size());
	}

}
