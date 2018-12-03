package com.jspider.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("bhavyamesta@gmail.com");
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
	}

}
