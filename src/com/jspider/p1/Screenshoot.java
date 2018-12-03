package com.jspider.p1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoot {

	public static <TakeScreenshot> void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot t= (TakesScreenshot) driver;
		File src =t.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshot.png");
		
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
