package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	/*@DataProvider
	public Object[][] dataSet() {
		Object[][] dataset = new Object[4][2];
		//1row
		dataset[0][0] = "user1";
		dataset[0][1] = "password1";
		
		
		dataset[0][0] = "user1";
		dataset[0][1] = "password1";
		
		
		dataset[1][0] = "user2";
		dataset[1][1] = "password2";
		
		dataset[2][0] = "user3";
		dataset[2][1] = "password3";
		
		dataset[3][0] = "user4";
		dataset[3][1] = "password4";
		
		
		return dataset;
		
		
		
	}
	*/
	
	@DataProvider(name="create")
	public Object[][] dataSet1(Method m){
		Object[][] testdata = null;
		if(m.getName().equals("test")) 
		{
				testdata = new Object[][] {
			{"username", "pass"},
			{"username1", "pass1"}
			
		};
		}
		else if(m.getName().equals("test1")) {
			testdata = new Object[][]{
			{"username", "pass", "test"},
			{"username1", "pass1", "test"}
		};
		}
		
		
		
		return testdata;
}
}
