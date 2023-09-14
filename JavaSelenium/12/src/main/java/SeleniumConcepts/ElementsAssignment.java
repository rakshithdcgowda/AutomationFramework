package SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementsAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("name")).sendKeys("Rakshith");
		
		driver.findElement(By.name("email")).sendKeys("rakshithdc1997@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Abc@!23");
		
		boolean checkBox = driver.findElement(By.id("exampleCheck1")).isSelected();
		if(checkBox==false)
		{
			driver.findElement(By.id("exampleCheck1")).click();
		}
		
	   
	    
	    Select drpdwn= new Select(driver.findElement(By.id("exampleFormControlSelect1")));
	    
	    drpdwn.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("01/02/2022");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		driver.quit();
		
		
		
	}

}
