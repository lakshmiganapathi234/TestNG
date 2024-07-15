package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	 public ProductsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	}
	@FindBy(id = "SearchProductName")
	private WebElement productname;
	@FindBy(id = "SearchWarehouseId")
	private WebElement Warehouse;
	@FindBy(xpath = "//option[text()=\"Warehouse 1 (New York)\"]")
	private WebElement Warehouse_1;
	@FindBy(id = "SearchCategoryId")
	private WebElement category;
	@FindBy(xpath = "//option[text()=\"Computers\"]")
	private WebElement computer_category;
	@FindBy(id = "search-products")
	private WebElement searchButton;
	
	public void searchProduct(String Productname) {
		  productname.sendKeys(Productname);
		  Warehouse.click();
		  Warehouse_1.click();
		  category.click();
		  computer_category.click();
		  searchButton.click();
	}


}
