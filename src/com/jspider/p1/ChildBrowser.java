package com.jspider.p1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowser {

	static
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		allwh.remove(pwh);

		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
		driver.switchTo().window(pwh);
		Thread.sleep(2000);
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\hp\\Desktop\\Bhavya Mestha_2018.pdf");

	}

}
