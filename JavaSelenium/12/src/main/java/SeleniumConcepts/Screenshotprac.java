package SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotprac {

	public static void main(String[] args) throws IOException {
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		TakesScreenshot src= (TakesScreenshot) driver;
		
		File temp = src.getScreenshotAs(OutputType.FILE);
		
		File loc = new File("C:\\Users\\rchandregowda\\Desktop\\Rakshith\\ScroonShot1.png");
		
		FileUtils.copyFile(temp, loc);
		
		
	}

}
