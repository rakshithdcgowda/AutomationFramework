package SeleniumConcepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceProject {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rchandregowda\\Desktop\\Rakshith\\SeleniumFrameworkBuilding\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] ProductToBeClicked = { "Brocolli", "Cucumber", "Carrot" };

		AddItem(driver,ProductToBeClicked );

		// ClickAddToCart(driver, ProductToBeClicked);

	}

	public static void AddItem(WebDriver driver, String[] ClickingOption) 
	{
         List<WebElement> Products = driver.findElements(By.xpath("//div[@class='product']"));
         
         
         for(int i=0;i<Products.size();i++)
         {
        	String[] Text=  Products.get(i).getText().split("-");
        	
        	String ProductName= Text[0].trim();
        	
        	int j=0;
        	
        	List<String> NeedToClick = Arrays.asList(ClickingOption);
        	
        	if(NeedToClick.contains(ProductName))
        	{
        		j++;
        		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        		
        		if(j==NeedToClick.size())
        		{
        			break;
        		}
        	}
        	 
        	
        	 
        	 
         }
         
         driver.quit();
    	 
         
         
         
         
         
	}

	public static void ClickAddToCart(WebDriver driver, String[] ItemName) throws InterruptedException {
		int j = 0;
		for (int i = 0; i < ItemName.length; i++) {
			j++;
			driver.findElement(By.xpath("//h4[contains(text(),'" + ItemName[i] + "')]/..//div[@class='product-action']/button")).click();
			System.out.println("Item " + ItemName[i] + " Added to cart succefully");
			Thread.sleep(3000);
			if (j == ItemName.length)
			{
				break;
			}

		}

		driver.quit();
	}

}
