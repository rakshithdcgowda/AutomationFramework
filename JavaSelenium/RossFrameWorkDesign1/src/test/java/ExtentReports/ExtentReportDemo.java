package ExtentReports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	static ExtentReports extent;
	
	@BeforeMethod
	public static ExtentReports extentreports()
	{
		String path= System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Report");
		report.config().setDocumentTitle("Test Results");
		
		 extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Rakshith Gowda");
		return extent;
		
		
	}
	
	
	@Test
	public void initialDemo()
	{
		ExtentTest Test = extent.createTest("initialDemo");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(driver.getTitle());
		driver.close();
		
		Test.fail("Results Do not attach");
		
		extent.flush();
	}

}
