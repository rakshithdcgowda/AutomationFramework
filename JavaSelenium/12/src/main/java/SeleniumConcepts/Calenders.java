package SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		//String text=driver.findElement(By.cssSelector("th.datepicker-switch")).getText();
		
		
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> Days = driver.findElements(By.className("day"));
		
		for(int i=0;i<Days.size();i++)
		{
			String day=Days.get(i).getText();
			if(day.equalsIgnoreCase("23"))
			{
				Days.get(i).click();
				break;
			}
		}
	

		

	}

}
