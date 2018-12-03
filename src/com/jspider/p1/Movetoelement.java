package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");
		WebElement aboutus = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[@title='About Us']"));
		Actions a=new Actions(driver);
		a.moveToElement(aboutus).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@title='Company']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
