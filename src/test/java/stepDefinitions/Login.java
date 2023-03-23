package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductsPage;

public class Login {

	LoginPage lp;
	WebDriver driver;
	ProductsPage pp;
	
	
	@Given("^print something$")
    public void print_something() throws Throwable {
       System.out.println("******************* Viajy is executing the scenarios ****************");
    }
	
	
	  @When("^enter (.+) and (.+)$")
	    public void enter_and(String username, String password) throws Throwable {
		  
		  lp = new LoginPage(driver);
		  lp.usernameEnter(username);
		  lp.passwordEnter(password);
		  lp.LoginClick();
		  
	        System.out.println(username + "  :" +password);
	    }
	
	@Given("^open the browser and URL$")
	public void open_the_browser_and_URL() {
		System.out.println("open the browser and URL");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
	}

	@When("^enter username and password$")
	public void enter_username_and_password() throws Throwable {

		System.out.println("enter username and password");
	}

	@Then("^close the Browser$")
	public void close_the_browser() throws Throwable {

		
		driver.close();
		System.out.println("close the Browser");
	}
	
	
	@Then("validate home page")
	public void validate_home_page() {
	    System.out.println("validate home page");
	    
	    pp = new ProductsPage(driver);
	    
	    pp.productDisplay();
	}
	
	
	@When("enter invalid username and password")
	public void enter_invalid_username_and_password() {
	    System.out.println("enter invalid username and password");
	}
}
