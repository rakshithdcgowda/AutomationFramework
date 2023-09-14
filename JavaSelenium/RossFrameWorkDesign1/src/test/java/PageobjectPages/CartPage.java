package PageobjectPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectCommonPages.CommonPage;

public class CartPage extends CommonPage{
	
	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkOutBtn;
	
	@FindBy(xpath="//div[@class='cartSection']//h3")
	List<WebElement> cartLists;
	
	
	
	public boolean verifyProductDisplayed(String ProductName)
	{
		 boolean flag = cartLists.stream().anyMatch(cartprod->cartprod.getText().equalsIgnoreCase(ProductName));
		 return flag;
	}
	
	public CheckOutPage clickCheckOut()
	{
		checkOutBtn.click();
		return new CheckOutPage(driver);
	}

	
	
	

}
