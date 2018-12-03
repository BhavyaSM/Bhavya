package com.jspider.p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(1000);
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		Thread.sleep(1000);
int count = allsuggestion.size();
System.out.println("size="+count);

for(WebElement suggestion:allsuggestion)
{
	String text = suggestion.getText();
	System.out.println("text="+text);
}
	
	WebElement s = allsuggestion.get(count-1);
	s.click();
	driver.close();
	
}
	}


