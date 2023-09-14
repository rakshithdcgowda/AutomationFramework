package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignments {

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String Text = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		System.out.println(Text);
		
		Select sa = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		sa.selectByVisibleText(Text);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(Text);
		
		driver.findElement(By.id("alertbtn")).click();
		 
		Alert Alt = driver.switchTo().alert();
		
		String AlrtText= Alt.getText();
		
		System.out.println(AlrtText);
		
		if(AlrtText.contains(Text))
		{
			System.out.println("Validation Successful");
		}
		else
		{
			System.out.println("Validation unsuccessful");
		}
		
		Alt.accept();
		
		
		
		
		
	}

}
