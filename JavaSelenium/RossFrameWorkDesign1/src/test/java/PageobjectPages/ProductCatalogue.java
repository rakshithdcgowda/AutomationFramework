package PageobjectPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectCommonPages.CommonPage;

public class ProductCatalogue extends CommonPage {
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver)
	{

		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".mb-3")
	List<WebElement> ProductList;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productBy = By.cssSelector(".mb-3");
	By AddtoCart = By.cssSelector(".card-body button:last-of-type");
	By toastmessage = By.id("toast-container");
	
	
	
	public List<WebElement> getProductList()
	{
		waitUntilElementVisible(productBy);
		return ProductList;
	}
	
	
	public WebElement getProductByName(String ProductName)
	{
		 WebElement Prod = getProductList().stream().filter(Product->Product.findElement(By.tagName("b")).
					getText().equalsIgnoreCase(ProductName)).findFirst().orElse(null);
		 
		 return Prod;
	}
	
	public CartPage addProductToCart(String product) throws InterruptedException
	{
	WebElement Prod=getProductByName(product);
		 Prod.findElement(AddtoCart).click();
		 waitUntilElementVisible(toastmessage);
		 waitUntilElementDisappear(spinner);
		 return new CartPage(driver);
	}
	
	

}
