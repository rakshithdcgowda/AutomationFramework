package PageobjectSteps;

import java.io.IOException;
import java.time.Duration;
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
import org.testng.annotations.Test;

import PageObject.TestComponents.BaseTest;
import PageObject.TestComponents.Retry;
import PageobjectPages.CartPage;
import PageobjectPages.CheckOutPage;
import PageobjectPages.ConfirmationPage;
import PageobjectPages.LandingPage;
import PageobjectPages.ProductCatalogue;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorHandlingTest extends BaseTest {
	
	
	

	@Test(retryAnalyzer = Retry.class)
	public void LoginErrorValidation() throws IOException, InterruptedException
	{
		
		landingPage.logintoApplication("DC@123.com","Rakshith@1234");
		String errorMessage=landingPage.getErrorMessage();
		System.out.println(errorMessage);
		Assert.assertEquals(errorMessage, "Incorrect email  password.");
		
		 
	}
	
	
	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException
	{
		String ProductName="adidas original123";
		
	
		
		
		ProductCatalogue ProductCat= landingPage.logintoApplication("DC@123.com","Rakshith@123");
		
		CartPage cart=ProductCat.addProductToCart(ProductName);
		ProductCat.clickCart();
		boolean match=cart.verifyProductDisplayed(ProductName);
		  Assert.assertFalse(match);
		 
	}


}
