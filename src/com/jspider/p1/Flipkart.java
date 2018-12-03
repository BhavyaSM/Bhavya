package com.jspider.p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

static
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement b = driver.findElement(By.cssSelector("button[class='_2AkmmA _29YdH8']"));
		b.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		
		List<WebElement> allcb = driver.findElements(By.xpath("//span[.='iphone']/.."));
		
		
		int count = allcb.size();
		System.out.println("count="+count);
		
		for(int i=0;i<count;i++)
		{
			WebElement ab = allcb.get(i);
			String text = ab.getText();
			System.out.println("text="+text);
		}
		//driver.close();
		
	}

}
