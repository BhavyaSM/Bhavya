package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web8 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///E:/Jspider/Web%20page/web8.html");
		WebElement hotel = driver.findElement(By.id("kundapur shetty house"));
		Select s1=new Select(hotel);
		
		s1.selectByIndex(0);
		s1.selectByValue("p");
		s1.selectByVisibleText("Fish");
		Thread.sleep(1000);
		
		s1.deselectByIndex(0);
		s1.deselectByValue("p");
		Thread.sleep(1000);
		s1.deselectByVisibleText("Fish");

	}

}
