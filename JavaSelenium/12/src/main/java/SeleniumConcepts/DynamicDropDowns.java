package SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		
		Thread.sleep(3000);
		
		//int LineValues = driver.findElements(By.xpath("//li[@class='ui-menu-item']")).size();
		
		for(int i=0;i<7;i++)
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			
			String dropdownvalue=driver.findElement(By.id("autocomplete")).getAttribute("value");
			System.out.println(dropdownvalue);
			
			if(dropdownvalue.contains("United States (USA)"))
			{
				
			}
			
		}
		
		
	}

}
