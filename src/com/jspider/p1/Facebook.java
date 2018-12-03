package com.jspider.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//to manage the window
		driver.manage().window().maximize();
		
		//enter the url
		driver.get("https://www.facebook.com/");
		//First name textbox
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Bhavya");

		//sername textbox
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Mestha");
		
		//mobile number or email
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("bhavyamesta@gmail.com");
		
		//New password
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("123");
		
		//Date
		driver.findElement(By.cssSelector("select[id='day']")).sendKeys("18");
		
		//month
		driver.findElement(By.cssSelector("select[id='month']")).sendKeys("Feb");
		
		//year
		driver.findElement(By.cssSelector("select[id='year']")).sendKeys("1996");
		
		//female
		WebElement ab = driver.findElement(By.cssSelector("input[value='1']"));
				//to check  radio button is selected or not
				ab.click();
		if(ab.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		WebElement cd = driver.findElement(By.cssSelector("input[value='2']"));
		if(cd.isSelected())
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
			}
			
		
		//signup
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
