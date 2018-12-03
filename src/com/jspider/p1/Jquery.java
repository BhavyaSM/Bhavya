package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(0);
		
			
		 
		 WebElement src = driver.findElement(By.id("draggable"));
		 //driver.switchTo().frame(1);
		 
		 WebElement dst = driver.findElement(By.id("droppable"));
		 //driver.switchTo().frame(2);
		 
		 Actions a1=new Actions(driver);
		 Thread.sleep(1000);
		 a1.dragAndDrop(src, dst).perform();
		
	}

}
