package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Jspider/Web%20page/web8.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.id("kundapur shetty house"));
		Select sel=new Select(a);
		if(sel.isMultiple())
		{
			System.out.println("multiple");
		}
		else
		{
			System.out.println("not multiple");
		}
		Thread.sleep(1000);
		driver.close();
	}

}
