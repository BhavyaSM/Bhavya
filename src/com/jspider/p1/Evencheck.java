package com.jspider.p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Evencheck {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Jspider/Web%20page/web6.html");
		List<WebElement> allcb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = allcb.size();
		System.out.println("size="+count);
		
		for(int i=0;i<=count;i++)
		{
			if(i%2==0)
			{
				System.out.println("count="+i);
				WebElement cb = allcb.get(i);
				cb.click();
				Thread.sleep(500);
			}
			else
			{
				System.out.println("count="+i);
				WebElement cb = allcb.get(i);
				
				Thread.sleep(500);
			}
			
		}
		Thread.sleep(1000);
		driver.close();
	}



	}


