package PageObject.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import PageobjectPages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingPage;

	public WebDriver initilizeDriver() throws IOException
	{
		
		Properties prop=new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\GlobalData.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
	
		if(browserName.equalsIgnoreCase("chrome"))
		{
			
		
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
	return driver;
	}
	
	public List<HashMap<String, String>> getJsonDataToMap(String filepath) throws IOException
	{
		
		//read json to String
		
		String jsonContent=FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);
		
		//String to Hash Map -Jackson databind
		
		ObjectMapper mapper=new ObjectMapper();
		
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
			
		});
		
		return data;
		
		
	}
	
	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+"//reports//ScreenShots"+testCaseName+".png");
		FileUtils.copyFile(source, destination);
		return System.getProperty("user.dir")+"//reports//ScreenShots"+testCaseName+".png";
	}
	
	@BeforeMethod
	public LandingPage launchApplication() throws IOException
	{
		WebDriver driver= initilizeDriver();
		 landingPage= new LandingPage(driver);
		 landingPage.goTo();
		return landingPage;
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
