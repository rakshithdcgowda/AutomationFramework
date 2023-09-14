package SeleniumConcepts;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EcommDiscount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		Thread.sleep(3000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> VegNames = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> originalList = VegNames.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> SortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		
		
		Assert.assertTrue(originalList.equals(SortedList), "Verification Failed");
		
		
		List<String> PriceList;
		
		do {
		List<WebElement> VegNames1 = driver.findElements(By.xpath("//tr/td[1]"));
		PriceList = VegNames.stream().filter(s->s.getText().contains("Rice")).map(s-> getpriceveggie(s)).
		collect(Collectors.toList());
		
		PriceList.forEach(s->System.out.println(s));
		
		if(PriceList.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		
		}while(PriceList.size()<1);

	}
	
	private static String getpriceveggie(WebElement s)
	{
		String Price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Price;
		
	}

}
