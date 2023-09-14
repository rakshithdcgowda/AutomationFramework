package PageObjectCommonPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageobjectPages.OrdersPage;

public class CommonPage {
	
	
	WebDriver driver;
	
	
	@FindBy(xpath="//button[contains(@routerlink,'cart')]")
	WebElement CartIcon;
	
	@FindBy(xpath="//button[contains(@routerlink,'myorders')]")
	WebElement ordersIcon;
	
	public CommonPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitUntilElementVisible(By Element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
	}
	
	public void waitUntilWebElementVisible(WebElement Element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOf(Element));
	}
	
	public void waitUntilElementDisappear(WebElement Element) throws InterruptedException
	{
		Thread.sleep(2000);
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(8));
		//wait.until(ExpectedConditions.invisibilityOf(Element));
	}
	
	public void clickCart()
	{
		CartIcon.click();
	}
	
	
	public OrdersPage GoToOrdersPage()
	{
		ordersIcon.click();
		return new OrdersPage(driver);
	}

}
