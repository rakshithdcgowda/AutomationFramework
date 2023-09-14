package SeleniumConcepts;

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

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> Links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		SoftAssert a=new SoftAssert();
		
		for(WebElement Link : Links)
		{
			String LinkName=Link.getAttribute("href");
			
			 HttpURLConnection   conn= (HttpURLConnection)new URL(LinkName).openConnection();
			 
			 conn.setRequestMethod("HEAD");
			 
			 conn.connect();
			 
			 int ResposeCode = conn.getResponseCode();
			 
			 
			a.assertTrue(ResposeCode<400, "The link with Text"+Link.getText()+" is broken with code" +ResposeCode);
			
			
		}
		
		
		a.assertAll();
		
		
		
		

	}
	
	private static Object getReturnCode(WebElement Link) {

		// TODO Auto-generated method stub

		return null;

		}

}
