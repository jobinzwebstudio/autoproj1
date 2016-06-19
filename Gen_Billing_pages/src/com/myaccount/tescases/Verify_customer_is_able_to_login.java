package com.myaccount.tescases;

import org.testng.annotations.Test;

import com.utilities.BrowserFactory;

public class Verify_customer_is_able_to_login {

	@Test
	public static void main(String[] args) {


		
		BrowserFactory.LoadURL("firefox","https://myaccount.talktalk.co.uk");
		
		

	}

}
