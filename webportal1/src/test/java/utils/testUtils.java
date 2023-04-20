package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest{
	public void getscreenshot() throws IOException {
Date currentDate = new Date();
String screenshotfilename = currentDate.toString().replace(" ","-").replace(":","-");
File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+ screenshotfilename+ ".png"));
}
}