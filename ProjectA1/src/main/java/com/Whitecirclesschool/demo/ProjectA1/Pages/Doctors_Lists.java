package com.Whitecirclesschool.demo.ProjectA1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Doctors_Lists {
	@FindBy(linkText = "Dr. Steven Spielberg")
	private WebElement DrSteven;

	@FindBy(linkText = "Dr. Tim Short")
	private WebElement DrTim;

	@FindBy(linkText = "Dr. James")
	private WebElement DrJames;

	@FindBy(css = "body > div.elementor.elementor-120 > div > div > section.elementor-element.elementor-element-232c027.elementor-section-boxed.elementor-section-height-default.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > h2")
	private WebElement SuccessMessage;
	
	
	public Doctors_Lists(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSuccessMessage() {
		return SuccessMessage;
	}

	public void clDrStevenSpieberg() {
		DrSteven.click();
	}

	public void clTimShort() {
		DrTim.click();
	}

	public void clDrJames() {
		DrJames.click();
	}
	
}
