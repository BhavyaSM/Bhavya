package com.jspider.p1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> window = driver.getWindowHandles();
		for(String all:window)
		{
			driver.switchTo().window(all);
			String text = driver.getTitle();
			System.out.println(text);
			driver.close();
			Thread.sleep(1000);
		}

	}

}
