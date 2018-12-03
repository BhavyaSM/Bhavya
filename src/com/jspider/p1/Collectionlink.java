package com.jspider.p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collectionlink {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Jspider/Web%20page/web5.html");
		
		//to get address of all links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		//to get the number of links
		int count = allLinks.size();
		System.out.println("count="+count);
		
		//to print all the links
		
		for(int i=0;i<count;i++)
		{
			WebElement a = allLinks.get(i);
			String text = a.getText();
			System.out.println("text="+text);
		}
	}

}
