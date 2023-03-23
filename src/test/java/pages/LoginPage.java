package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// properties

	public WebDriver driver;

	// Locators

	@FindBy(xpath = "//*[@id ='user-name']")
	public WebElement username;

	@FindBy(xpath = "//*[@id ='password']")
	public WebElement password;

	@FindBy(xpath = "//*[@name ='login-button']")
	public WebElement loginButton;

	@FindBy(xpath = "//*[text() ='Epic sadface: Username is required']")
	public WebElement uidBlank;

	@FindBy(xpath = "//*[text() ='Epic sadface: Username and password do not match any user in this service']")
	public WebElement uidPasswordInvalid;

	@FindBy(xpath = "//*[text() ='Epic sadface: Password is required']")
	public WebElement passwordBlank;

	// Constructor method

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// Operation methods

	public void usernameEnter(String name) {
		username.sendKeys(name);
	}

	public void passwordEnter(String pwd) {
		password.sendKeys(pwd);
	}

	public void LoginClick() {
		loginButton.click();
	}
	
	
	public void LoginDisplay()
	{
		loginButton.isDisplayed();
		
		System.out.println("Logged out successfully");
	}

}
