package com.jspider.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Jspider/Web%20page/web4.html");
		WebElement s = driver.findElement(By.id("fn"));
		if(s.isEnabled())
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("disabled");
		}
		
	}

}
