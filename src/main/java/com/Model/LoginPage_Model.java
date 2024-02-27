package com.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Model {

	public static WebDriver driver;
	
	@FindBy(xpath ="//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public LoginPage_Model(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
