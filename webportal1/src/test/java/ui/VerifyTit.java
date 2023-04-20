package ui;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTit{
	@Test
public void verifyTitle() {
	
	
		// System.setProperty("webdriver.edge.driver","C:\\Users\\Angela.Shalievska\\Desktop\\edge\\msedgedriver.exe");
	String Expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	WebDriverManager.edgedriver().setup();
	System.out.println(Expectedtitle);
		 EdgeDriver driver = new EdgeDriver();
	
		 
	driver.get("https://www.ebay.com/");
	String ActualTitle = driver.getTitle();
	System.out.println(ActualTitle);
	Assert.assertEquals(ActualTitle, Expectedtitle);
	driver.close();
}}
