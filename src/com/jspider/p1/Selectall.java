package com.jspider.p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectall {
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
		Thread.sleep(2000);
		Select sel=new Select(hotel);
		List<WebElement> all = sel.getOptions();
		int count = all.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		sel.selectByIndex(i);
		 
			System.out.println(i);
			Thread.sleep(2000);
		}
		driver.close();
	}

}
