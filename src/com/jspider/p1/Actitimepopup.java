package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Actitimepopup {

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
		
		String xp="//div[@onclick='openHelpAndSupportMenu(event)']";
		

		WebElement help = driver.findElement(By.xpath(xp));
		help.click();
		//Select sel=new Select(help);
		//sel.selectByVisibleText("About your actiTIME");
		//Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		WebElement text = driver.findElement(By.xpath("//span[.='(build 40469)']"));
		String a = text.getText();
		System.out.println(a);

	}

}
