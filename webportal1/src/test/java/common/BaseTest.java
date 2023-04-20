package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver= null;
	
	@BeforeSuite
	public void launchBrowser() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
	}
	
	@AfterSuite
    public void closingBrowser() {
		
		driver.close();
		
	}
	
}
