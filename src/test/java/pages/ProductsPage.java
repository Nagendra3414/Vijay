package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[text() ='Products']")
	public WebElement products;

	@FindBy(xpath = "(//*[text() ='Add to cart'])[1]")
	public WebElement addCart;

	@FindBy(xpath = "//*[@class ='shopping_cart_link']")
	public WebElement shopCart;

	// Constructor method

	public ProductsPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}
		// Operation methods

		
		public void productDisplay() {
			products.isDisplayed();
			
			System.out.println("Login is successful");
		}


	    public void ClickAddCart()
	    {
	    	addCart.click();
	    	System.out.println("Add cart clciked");
	    }
	    
	    
	    public void ClickshopCart()
	    {
	    	shopCart.click();
	    	System.out.println("Shop cart clciked");
	    }

}
