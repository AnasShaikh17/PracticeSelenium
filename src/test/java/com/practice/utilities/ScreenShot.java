package com.practice.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenShot {

public void takeScreenShot(WebDriver ldriver, ITestResult tr)
{
	TakesScreenshot ts = ((TakesScreenshot)ldriver);
	File f = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("./ScreenShot/"+tr.getName()+".png");
	
	try {
	FileUtils.copyFile(f, dest);
	}
	catch(Exception e)
	{}
	}
	
}
