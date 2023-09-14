package SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowColoumCountAssign {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	int rowsize = driver.findElements(By.xpath("//div[@class='left-align']//table//tr")).size();
		
		int ColumSize = driver.findElements(By.xpath("//div[@class='left-align']//table//th")).size();
		
		System.out.println(ColumSize);
		
		System.out.println(rowsize);
		
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//div[@class='left-align']//table//tr"));
		
		for(int i=0;i<rowdata.size();i++)
		{
			if(i==2)
			{
				List<WebElement> Exactdata = rowdata.get(i).findElements(By.tagName("td"));
				
				for(WebElement obj:Exactdata)
				{
					System.out.println(obj.getText());
				}
				
				
				break;
			}
			
		}
		
		
	}

}
