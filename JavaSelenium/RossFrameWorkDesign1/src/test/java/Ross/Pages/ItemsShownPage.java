package Ross.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsShownPage {
	
	
	WebDriver driver;
	
	public ItemsShownPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//div[@class='card']")
	List<WebElement> ItemsList;
	
	public void ItemsAddtoCart(String ProductName)
	{
		WebElement Item = ItemsList.stream().filter(Product->Product.findElement(By.tagName("b")).
				getText().equalsIgnoreCase(ProductName)).findFirst().orElse(null);
		
          Item.findElement(By.xpath("//button[2]")).click();
	}

}
