package SeleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindows {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> Windows = driver.getWindowHandles();
		
		Iterator<String> Itr = Windows.iterator();
		String ParentID = Itr.next();
		String ChildID = Itr.next();
		
		driver.switchTo().window(ChildID);
		
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		
		
		String UserName = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].split(" ")[1].trim();
		
		
		driver.switchTo().window(ParentID);
		
		driver.findElement(By.id("username")).sendKeys(UserName);
		
		

	}

}
