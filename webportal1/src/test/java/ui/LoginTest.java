package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
 
	@BeforeTest
	public void loginToApp() {
		
		System.out.println("Login to app!");
	}
	@Test(priority=2,description = "This is login test!")
	public void loginTest() {
		// TODO Auto-generated method stub
     System.out.println("Login is success!");
	}

	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB connected!");
	}
	@AfterMethod
	public void disconnectToDB() {
		System.out.println("DB disconnected!");
	}
	@Test(priority=1, description = "This is logout test!")
	public void logoutTest() {
		System.out.println("Logout success!");
	}
	
	@AfterTest
	public void logoutFromApp() {
		
		System.out.println("Logout from App!");
	}
}
