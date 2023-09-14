package PageobjectSteps;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.TestComponents.BaseTest;
import PageobjectPages.CartPage;
import PageobjectPages.CheckOutPage;
import PageobjectPages.ConfirmationPage;
import PageobjectPages.LandingPage;
import PageobjectPages.OrdersPage;
import PageobjectPages.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest extends BaseTest {
	
	
	public String ProductName="adidas original";

	@Test(dataProvider = "getHashMapData", groups = {"Purchase"})
	public void submitOrder(HashMap<String,String> input) throws IOException, InterruptedException
	{
		//String ProductName="adidas original";
		
		ProductCatalogue ProductCat= landingPage.logintoApplication(input.get("email"),input.get("password"));
		List<WebElement> Products = ProductCat.getProductList();
		CartPage cart=ProductCat.addProductToCart(input.get("product"));
		ProductCat.clickCart();
		boolean match=cart.verifyProductDisplayed(input.get("product"));
		  Assert.assertTrue(match);
		  CheckOutPage checkoutPage=cart.clickCheckOut();
		  checkoutPage.selectCountry("India");
		  ConfirmationPage confirmpage=checkoutPage.submitOrder();
		  String actualConfirmationMessage=confirmpage.getConfirmationMessage();
		  Assert.assertTrue(actualConfirmationMessage.contains("THANKYOU FOR THE ORDER"));
		 
	}

	@Test(dependsOnMethods = {"submitOrder"})
	public void VerifyOrdersList() throws IOException, InterruptedException
	{
		
		ProductCatalogue ProductCat= landingPage.logintoApplication("DC@123.com","Rakshith@123");
		
		OrdersPage ordersPage = ProductCat.GoToOrdersPage();
		Boolean match = ordersPage.VerifyOrderDisplay(ProductName);
		Assert.assertTrue(match, "Product is not present in the orders List");
		 
	}
	
	
	//sending data through dataProvider
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"DC@123.com","Rakshith@123","adidas original"},{"gowda@gmail.com","Gowda@123","ZARA COAT 3"}};
	}
	
	
	//sending data using haspmap through dataProvider
	@DataProvider
	public Object[][] getHashMapData() throws IOException
	{
		
		/*
		 * // storing data in hashmap and passing HashMap<String, String> map=new
		 * HashMap<String, String>(); map.put("email", "DC@123.com");
		 * map.put("password", "Rakshith@123"); map.put("product", "adidas original");
		 * 
		 * HashMap<String, String> map1=new HashMap<String, String>(); map1.put("email",
		 * "gowda@gmail.com"); map1.put("password", "Gowda@123"); map1.put("product",
		 * "ZARA COAT 3");
		 * 
		 */
		
		//get the data from json file
		List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\PageobjectData\\Data.json");
		
		return new Object[][] {{data.get(0)},{data.get(1)}};
	}
	
	
	

	
}
