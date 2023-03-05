package practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_browserwindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//String windowid=driver.getWindowHandle();
		//System.out.println(windowid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		//First Iterator
		/*Iterator<String> it=windowIDs.iterator();
		
		String parentID=it.next();
		String childID=it.next();
		
		System.out.println(parentID);
		System.out.println(childID);  */
		
		
		//Second Method-Using ArrayList
		
		List<String> windowIDslist=new ArrayList(windowIDs);
		
		/*String parentID=windowIDslist.get(0);
		String childID=windowIDslist.get(1);
		
		System.out.println(parentID);
		System.out.println(childID);  
		
		//hoe to use window ids for switching browser
		
		
		driver.switchTo().window(childID);
		
		System.out.println("child window title is:"+driver.getTitle()); */
		
		
		// For each loop
		
		for(String winID:windowIDslist)
		{
			//System.out.println(winID);
			String title=driver.switchTo().window(winID).getTitle();
			System.out.println(title);
		}
		
		//driver.close();
		driver.quit();
		
	}

}
