package SeleniumConcepts;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeWaits {


	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebDriverWait wait=new WebDriverWait(driver,5);
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		WebElement DropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select drop=new Select(DropDown);
		
		drop.selectByValue("consult");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.id("signInBtn")).click();
		
		//String[] Options= {"","","",""};
		
		
		addItem(driver);
		
		//addItem1(driver);

	}
	
	
	public static void addItem(WebDriver driver)
	{
		List<WebElement> ListOfItems = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(int i=0;i<ListOfItems.size();i++)
		{
			ListOfItems.get(i).click();
		
		}
		
		
		
	}
	
	

}
