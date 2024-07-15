package nopCommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import webpages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginpage;
	@BeforeClass
	public void setup() {
		// Initialize WebDriver, open browser, etc.
        driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        loginpage = new LoginPage(driver);
	}
	
	@Test
	void testLogin(){
		loginpage.login();
	}
	@Test
	void testNavigateProductsPage(){
		loginpage.navigatetoProductsPage();
	}


}
