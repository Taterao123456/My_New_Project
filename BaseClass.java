package com.BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
	}

}
