package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoTest2 {


	@Test(dataProvider="create")
	public void test1(String username, String password) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
	}
	@DataProvider(name="create")
	public Object[][] dataSet1(){
		return new Object[][] {
			{"standard_user3", "se3cret_sauce"},
			{"locked_out_user1", "secret_sauce1"}
		};
		
		
		
		
	}
}
