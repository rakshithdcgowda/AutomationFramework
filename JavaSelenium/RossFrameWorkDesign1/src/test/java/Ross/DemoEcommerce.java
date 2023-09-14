package Ross;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoEcommerce {
	
	
	

	public static void main(String[] args) throws InterruptedException
	{
		String ProductName="adidas original";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userEmail")).sendKeys("DC@123.com");
		driver.findElement(By.id("userPassword")).sendKeys("Rakshith@123");
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card'][1]")));
		
		Thread.sleep(3000);
		
		List<WebElement> Products = driver.findElements(By.xpath("//div[@class='card']"));
		
		  WebElement Prod = Products.stream().filter(Product->Product.findElement(By.tagName("b")).
				getText().equalsIgnoreCase(ProductName)).findFirst().orElse(null);
		  
		  Prod.findElement(By.xpath("//button[2]")).click();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));	
		  
		
		  
		  driver.findElement(By.xpath("//button[contains(@routerlink,'cart')]")).click();
		  
		  
		 List<WebElement> cartlists = driver.findElements(By.xpath("//div[@class='cartSection']//h3"));
		 
		 boolean flag = cartlists.stream().anyMatch(cartprod->cartprod.getText().equalsIgnoreCase(ProductName));
		 
		 Assert.assertTrue(flag);
		 
		 
		
		 
	}

}
