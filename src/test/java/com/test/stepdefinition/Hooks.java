package com.test.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@functional")
	public void beforeValidation(){
		System.out.println("Before Testing the Functional Test case");
	}
	
	@After("@functional")
	public void AfterValidation(){
		System.out.println("After Testing the Functional Test case");
	}
}
