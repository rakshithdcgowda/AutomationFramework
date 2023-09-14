package SeleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignWindows {

	public static void main(String[] args) {
		
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				
				
				driver.get("https://the-internet.herokuapp.com/windows");
				
				driver.findElement(By.xpath("//div/h3/following-sibling::a[@target='_blank']")).click();
				
				Set<String> windows = driver.getWindowHandles();
				
				Iterator<String> it = windows.iterator();
				
				String parentid = it.next();
				
				String childid = it.next();
				
				driver.switchTo().window(childid);
				
				System.out.println(driver.findElement(By.tagName("h3")).getText());
				
				driver.switchTo().window(parentid);
				
				System.out.println(driver.findElement(By.tagName("h3")).getText());

	}

}
