package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlebrokenlinks {

	public static void main(String[] args) throws IOException {
		
     WebDriverManager.chromedriver().setup();
     
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.deadlinkcity.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     List<WebElement> alllinks=driver.findElements(By.tagName("a"));
     //System.out.println(alllinks.size());
     int brokenlink=0;
     
     for(WebElement ele:alllinks)
     {
    	 String url=ele.getAttribute("href");
    	 if(url==null || url.isEmpty())
    	 {
    		 System.out.println("url is empty");
    		 continue;
    	 }
    	 URL link=new URL(url);
    	 try
    	 {
    		 HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
    		 httpconn.connect();
    		 if(httpconn.getResponseCode()>=400)
    		 {
    			 System.out.println(httpconn.getResponseCode()+url+"   is"+"broken links");
    			 brokenlink++;
    		 }
    		 else
    		 {
    			 System.out.println(httpconn.getResponseCode()+url+"   is"+"valid link");
    		 }
    	 }catch(Exception e)
    	 {
    		
    	 }
    	 
     }
     System.out.println("Total No of broken link:"+brokenlink);

	}

}
