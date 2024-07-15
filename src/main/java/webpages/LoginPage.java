package webpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	private WebElement catalogdropdown;
	@FindBy(xpath = "//p[normalize-space()='Products']")
	private WebElement productsButton;
	
	
	  public void login(){
		  	
	        loginButton.click();
	  }
	  public void navigatetoProductsPage(){
		  catalogdropdown.click();
		  productsButton.click();
	  }
	  }
