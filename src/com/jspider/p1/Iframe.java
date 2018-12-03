package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/Jspider/Web%20page/page1.html");
		driver.findElement(By.id("fn")).sendKeys("Bhavya");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("mn")).sendKeys("S");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ln")).sendKeys("MESTHA");
		
		
	}

}
