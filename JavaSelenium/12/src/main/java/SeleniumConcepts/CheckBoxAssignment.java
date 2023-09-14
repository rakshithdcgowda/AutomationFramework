package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class CheckBoxAssignment {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		boolean Value = driver.findElement(By.id("checkBoxOption1")).isSelected();
		
		if(Value==false)
		{
			driver.findElement(By.id("checkBoxOption1")).click();
		}
		
		boolean Value1 = driver.findElement(By.id("checkBoxOption1")).isSelected();
		
		System.out.println(Value1);
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
