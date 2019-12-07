package com.pftc.seleniumEasy.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.pftc.seleniumEasy.PageObject.Base;
import com.pftc.seleniumEasy.PageObject.OrderTeaPageObj;
import com.pftc.seleniumEasy.PageObject.SimpleFormDemoPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderTeaStepDef extends Base{
	
	
	OrderTeaPageObj orderTeaPageObj;
	
	@Given("^the user navigate to We are passionate about tea$")
	public void the_user_navigate_to_We_are_passionate_about_tea() throws Throwable {
	
		//	WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://www.practiceselenium.com/");
		
		String URL = prop.getProperty("firstApp");
		driver.get(URL);
		orderTeaPageObj=new OrderTeaPageObj();
		
		
	}

	@When("^the user click on the Menue$")
	public void the_user_click_on_the_Menue() throws Throwable {
		orderTeaPageObj.inputFormsButton();
				
		
	}

	@Then("^the user click on Check out for grean tea$")
	public void the_user_click_on_Check_out_for_grean_tea() throws Throwable {
	    
	}

	@Then("^the user fill out customer information$")
	public void the_user_fill_out_customer_information() throws Throwable {
	    
	}

	@Then("^the customer inputs payment information$")
	public void the_customer_inputs_payment_information() throws Throwable {
	    
	}

}
