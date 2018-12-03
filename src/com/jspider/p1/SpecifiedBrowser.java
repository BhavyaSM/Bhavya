package com.jspider.p1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpecifiedBrowser {
	static
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> link = driver.getWindowHandles();
		for(String allLink:link)
		{
			driver.switchTo().window(allLink);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.equals("ICON Clinical Research"))
			{
				driver.close();
			}
		}
		
	}

}
