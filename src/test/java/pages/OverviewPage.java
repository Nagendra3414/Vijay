package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

	
	
	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Checkout: Overview']")
	public WebElement OverViewDisplay;

	@FindBy(xpath = "(//*[text() ='Finish'])")
	public WebElement Finish;
	
	
	
	// Constructor method

	public OverviewPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}
	
	
	//Operation Methods
	
	public void OverViewDisplay()
	{
		OverViewDisplay.isDisplayed();
		
		System.out.println("I am in Overview Page");
	}
	
	
	public void FinishClick()
	{
		Finish.click();
		
		System.out.println("Finish clicked");
	}
}
