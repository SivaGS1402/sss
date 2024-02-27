package com.Manager;

import org.openqa.selenium.WebDriver;

import com.Model.LoginPage_Model;
import  com.Model.My_info_Orange;

public class PageObjectManager {

	public static WebDriver driver;
	
	private LoginPage_Model lp;
	
	public LoginPage_Model getInstanceLP() {

		if(lp == null) {

			lp= new LoginPage_Model(driver);
		}
		return lp;
	}

	
	private My_info_Orange myInf;

	public My_info_Orange getInstancemyInf() {

		if(myInf == null) {

			myInf = new My_info_Orange(driver); 

		}
		return myInf;
	}
	public PageObjectManager(WebDriver abc) {
		
		driver= abc;

	}
}
