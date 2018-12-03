package com.jspider.p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Allselected {
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
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		
		int count = alloptions.size();
		System.out.println(count);
		
		for(WebElement a:alloptions)
		{
			String text = a.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
		driver.close();
	}

}
