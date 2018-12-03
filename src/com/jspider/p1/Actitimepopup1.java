package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitimepopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com//login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(10000);
  driver.findElement(By.xpath("//a[@class='content tasks']")).click();
  
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Delete']")).click();
		Thread.sleep(2000);   
		
		driver.findElement(By.id("deleteTaskPopup_deleteConfirm_cancelBtn")).click();
		
	}

}
