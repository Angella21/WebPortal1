package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.testUtils;

public class Listener extends testUtils implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test case is starting!");
	}

public void onTestSuccess(ITestResult result) {
	System.out.println("Test case is success!");

	}

public void onTestFailure(ITestResult result) {
	System.out.println("Test case is failed-sc captured!");
try {
	getscreenshot();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public void onTestSkipped(ITestResult result) {
	System.out.println("Test case is skipped!");

}
}
