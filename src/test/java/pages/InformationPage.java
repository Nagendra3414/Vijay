package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Checkout: Your Information']")
	public WebElement InfoDisplay;

	@FindBy(xpath = "//*[@id ='first-name']")
	public WebElement FirstName;

	@FindBy(xpath = "//*[@id ='last-name']")
	public WebElement LastName;

	@FindBy(xpath = "//*[@id ='postal-code']")
	public WebElement Zipcode;

	@FindBy(xpath = "//*[@id ='continue']")
	public WebElement Continue;

	// Constructor method

	public InformationPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// Operation Methods

	public void InfoDisplay() {
		InfoDisplay.isDisplayed();

		System.out.println("I am in InfoDisplay Page");
	}

	public void FirstNameEnter(String fname)
	{
		FirstName.sendKeys(fname);
	}
	
	public void LastNameEnter(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	
	public void ZipcodeEnter(String Zname)
	{
		Zipcode.sendKeys(Zname);
	}
	
	
	public void ContinueClick()
	{
		Continue.click();
		
		System.out.println("Clicked on Continue");
	}
	
	
}
