package com.jspider.p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Redbrick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://home.redbrickhealth.com/");
		WebElement fq = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(fq).perform();
		Thread.sleep(3000);
		
		
		List<WebElement> link = driver.findElements(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']/..//a[@class='nav-link']"));
		
		int count = link.size();
		System.out.println(count);
		Thread.sleep(10000);
		
		for(WebElement a:link)
		{
		//Thread.sleep(10000);
		String text = a.getText();
		System.out.println(text);
	}
   driver.close();
}
}
