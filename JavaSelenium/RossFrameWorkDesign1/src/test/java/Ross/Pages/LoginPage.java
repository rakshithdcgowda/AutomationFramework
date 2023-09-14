package Ross.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="userEmail")
	WebElement username;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement LoginBtn;
	
	
	public void navigateto()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
	public void Login()
	{
		username.sendKeys("DC@123.com");
		password.sendKeys("Rakshith@123");
		LoginBtn.click();
	}
	
	
	
}
