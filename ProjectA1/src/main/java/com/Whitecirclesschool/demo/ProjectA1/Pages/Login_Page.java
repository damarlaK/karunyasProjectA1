package com.Whitecirclesschool.demo.ProjectA1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	

	@FindBy(id = "username-8")
	private WebElement user;

	@FindBy(id = "user_password-8")
	private WebElement pass;

	@FindBy(id = "um-submit-btn")
	private WebElement submit;
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public void applicationlogin() {
		user.sendKeys("karunyad");
		pass.sendKeys("Password!2");
		submit.click();

	}

}
