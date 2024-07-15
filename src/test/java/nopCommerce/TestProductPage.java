package nopCommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.LoginPage;
import webpages.ProductsPage;

public class TestProductPage {
	WebDriver driver;
	LoginPage loginpage;
	ProductsPage productpage;
	@BeforeClass
	public void setup() {
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        productpage = new ProductsPage(driver);
        loginpage = new LoginPage(driver);
	}
	@Test(priority = 1)
	void testLogin(){
		loginpage.login();
	}
	@Test(priority = 2)
	void testNavigateProductsPage(){
		loginpage.navigatetoProductsPage();
	}
	@Test(priority = 3)
	void testSearchProduct() {
		productpage.searchProduct("Computers");
	}

}
