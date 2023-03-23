package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletedPage {

	
	
	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Checkout: Complete!']")
	public WebElement CompleteDisplay;

	@FindBy(xpath = "(//*[text() ='Thank you for your order!'])")
	public WebElement ThankYou;
	
	@FindBy(xpath = "(//*[text() ='Open Menu'])")
	public WebElement Menu;
	
	
	
	@FindBy(xpath = "(//*[text() ='Logout'])")
	public WebElement Logout;
	
	// Constructor method

	public CompletedPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}
	
	
	//Operation Methods
	
	public void CompleteDisplay()
	{
		CompleteDisplay.isDisplayed();
		
		System.out.println("I am in Completed Page");
	}
	
	
	public void ThankYouDiplay()
	{
		ThankYou.isDisplayed();
		
		System.out.println("Thank you for your order!");
	}
	
	
	public void ClickMenu()
	{
		Menu.click();
	}
	
	
	public void LogoutClcik()
	
	{
		Logout.click();
	}
	
	

}
