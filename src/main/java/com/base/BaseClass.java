package com.base;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String string)	 {

		WebDriverManager.chromedriver().setup();

		 return driver= new ChromeDriver();
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void sendvalues(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void clear_text(WebElement element) {
		element.clear();
	}
	public static void doubleClick_element(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	public static void select_dropdown_by_visible_text(WebElement dropdownElement, String visibleText) {
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(visibleText);
	}
	public static void pressCtrlA(WebElement element) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	}

	
	public static void selectElementWithArrowAndEnter(WebElement element) throws AWTException {
		
		
		// Simulate pressing the down arrow key
		robotKeyPressDown();

		// Simulate pressing the Enter key
		robotKeyPressEnter();
	}

	public static void robotKeyPressDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);
		robot.keyRelease(java.awt.event.KeyEvent.VK_DOWN);
	}

	public static void robotKeyPressEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	}

	public static void typeAndPressEnter(WebElement element, String text) {
		Actions actions = new Actions(driver);
		actions.sendKeys(element, text).sendKeys(Keys.ENTER).perform();
	}

	public void assertStringTest(Object actualResult, Object expectedResult) {

		assertEquals(actualResult, expectedResult);
	}

	 public void mouse_clickElement(WebElement element) {
	            Actions actions = new Actions(driver);
	            actions.moveToElement(element).click().perform();
	        } 
	 
	 public static void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	
	 

}
