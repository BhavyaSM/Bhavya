package com.jspider.p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Fdpopup {

	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile profile=new FirefoxProfile();
		String key="browser.helperApps.neverAsk.saveToDisk";
		String value="application/zip";
		profile.setPreference(key, value);
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
Thread.sleep(2000);
		
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		
		
	}

}
