package com.sample_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Suite {

	WebDriver driver;

	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser() {

		startTime=System.currentTimeMillis();

		WebDriverManager.chromedriver().setup();
		driver= new  ChromeDriver();
	}
	@Test
	public void openGoogle() {

		driver.get("https://www.google.com/");
	}

	@Test
	public void openBing() {

		driver.get("https://www.bing.com/");
	}

	@Test
	public void openYahoo() {

		driver.get("https://www.yahoo.com/");
	}

	@AfterSuite
	public void closeBrowser() {

		endTime=System.currentTimeMillis();
		
		driver.quit();

		long totalTime = endTime-startTime;
		System.out.println("Total time taken "+totalTime);
	}


}
