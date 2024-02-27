package com.expectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Manager.PageObjectManager;
import com.base.BaseClass;

public class ParameterPractice extends BaseClass {

	static WebDriver driver;

	PageObjectManager pom;
	@Parameters({"url","username","password"})
	@Test

	private void adactinLogin(String url, String username, String password) {

		driver = browserLaunch("chrome");
		pom = new PageObjectManager(driver);
		
		urlLaunch(url);
		sendvalues(pom.getInstanceLP().getUsername(), username);
		sendvalues(pom.getInstanceLP().getPassword(), password);
		clickElement(pom.getInstanceLP().getLogin());

	}

}
