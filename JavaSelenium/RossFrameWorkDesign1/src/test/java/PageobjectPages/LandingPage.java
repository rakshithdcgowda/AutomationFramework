package PageobjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectCommonPages.CommonPage;

public class LandingPage extends CommonPage {
	
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="userEmail")
	WebElement UserName;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement signinbtn;
	
	//ng-tns-c4-7 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-error
			
	@FindBy(xpath="//div[contains(@class,'flyInOut')]")
	WebElement errorMessage;
	
	public String getErrorMessage()
	{
		waitUntilWebElementVisible(errorMessage);
		return errorMessage.getText();
	}
	
	public ProductCatalogue logintoApplication(String userName, String Password)
	{
		UserName.sendKeys(userName);
		password.sendKeys(Password);
		signinbtn.click();
		return new ProductCatalogue(driver);
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}

}
