package SeleniumConcepts;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GetDiscount {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		Thread.sleep(3000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//tr/th")).click();
		
		List<WebElement> elementList = driver.findElements(By.id("//tr/td[1]"));
		
		
		List<String> OriginalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		

		List<String> SortedList = OriginalList.stream().sorted().collect(Collectors.toList());
		
		
		Assert.assertTrue(OriginalList.equals(SortedList));
		
		 List<String> Price = elementList.stream().filter(s->s.getText().contains("Banana")).map(s-> getpriceveggie(s))
		.collect(Collectors.toList());
		 
		 Price.stream().forEach(a->System.out.println(a));
		
	}
	private static String getpriceveggie(WebElement s)
	{
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
		
	}

}
