package com.sample_TestNG;

import org.testng.annotations.Test;

public class Dependencies_Management {

	@Test(groups = {"test1"})
	public void loginAmazon() {
		System.out.println("Succesfully logged in ");
	}
	
	@Test(dependsOnMethods = "loginAmazon")
	public void searchProduct() {
		System.out.println("Product has been searched");
	}
	
	@Test(groups = {"test2"},dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("Product has been add to Cart");
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void proceedToBuy() {
		System.out.println("Payment process has been started");
	}

}
