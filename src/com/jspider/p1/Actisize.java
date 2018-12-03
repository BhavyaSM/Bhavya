package com.jspider.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actisize {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://laptop-lm31ra9n/login.do");
		WebElement ab = driver.findElement(By.name("username"));
		
		//to get the size
		Dimension s = ab.getSize();
		System.out.println("size="+s);
		
		int h = s.getHeight();
		int w = s.getWidth();
		System.out.println("Height="+h);
		System.out.println("width="+w);
		
		//to get the location
		Point l = ab.getLocation();
		System.out.println("Location="+l);
		
		int x = l.getX();
		int y = l.getY();
		
		System.out.println("x-axix="+x);
		System.out.println("y-axix="+y);
		
		//to check whether the elements are displayed or not
		
		if(ab.isDisplayed())
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		//to check element is selected or not
		WebElement cb =driver.findElement(By.id("keepLoggedInCheckBox"));
		cb.click();
		
		if(cb.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		}
		
	}


