package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

	
	
	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Remove']")
	public WebElement Remove;

	@FindBy(xpath = "(//*[text() ='Checkout'])")
	public WebElement Checkout;
	
	
	
	// Constructor method

	public YourCartPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}
	
	
	//Operation Methods
	
	public void RemoveDisplay()
	{
		Remove.isDisplayed();
		
		System.out.println("I am in Your cart Page");
	}
	
	
	public void CheckoutClick()
	{
		Checkout.click();
		
		System.out.println("Checkout clicked");
	}
	

}
