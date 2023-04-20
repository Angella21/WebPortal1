package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandText{
	@Test
public void verifyTitle() {
	
	
		// System.setProperty("webdriver.edge.driver","C:\\Users\\Angela.Shalievska\\Desktop\\edge\\msedgedriver.exe");
	SoftAssert softAssert = new SoftAssert();
		String Expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	String ExpectedText = "Search";
	WebDriverManager.edgedriver().setup();
	System.out.println(Expectedtitle);
		 EdgeDriver driver = new EdgeDriver();
	
		 
	driver.get("https://www.ebay.com/");
	String ActualTitle = driver.getTitle();
	String ActualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
	System.out.println(ActualTitle);
	System.out.println("Verifying title!");
	softAssert.assertEquals(ActualTitle, Expectedtitle);
	System.out.println("Verifying text!");
	softAssert.assertEquals(ActualText, ExpectedText, "Test success!!!");
	softAssert.assertAll();
	driver.close();
}}
