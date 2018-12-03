package com.jspider.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Jspider/Web%20page/web4.html");
		
		WebElement submit = driver.findElement(By.id("s"));
		submit.submit();
		Thread.sleep(7000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		 WebElement fname = driver.findElement(By.id("fn"));
		 Thread.sleep(1000);
		 
		 fname.sendKeys("Bhavya");
		 Thread.sleep(1000);
		 
		 fname.clear();
		 
		 WebElement fb = driver.findElement(By.linkText("FaceBook"));
		 String tag=fb.getTagName();
		 System.out.println("tag name:"+tag);
		 
		 
		 String at = fb.getAttribute("href");
		 System.out.println("attribute name:"+at);
		 
		 String text = fb.getText();
		 System.out.println("text="+text);
		 
		 String color = fb.getCssValue("color");
		 System.out.println("color="+color);
		 
		 String fz = fb.getCssValue("font-size");
		 
		System.out.println("size="+fz);
		driver.close();
	}

}
