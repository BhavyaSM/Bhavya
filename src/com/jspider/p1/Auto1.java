package com.jspider.p1;





import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println("title=:"+title);
		
		String s=driver.getCurrentUrl();
		System.out.println("url:"+s);
		
driver.navigate().to("https://www.facebook.com");
Thread.sleep(1000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);

driver.navigate().refresh();
driver.close();
	}

	
	}


