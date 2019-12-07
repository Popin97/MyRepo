package com.pftc.seleniumEasy.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderTeaPageObj extends Base{
	
	public OrderTeaPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Menu")
	public WebElement Menu; 	
	
	
	
	
	
	
	
	
	public void inputFormsButton() {
		Menu.click();
	}
	

}
