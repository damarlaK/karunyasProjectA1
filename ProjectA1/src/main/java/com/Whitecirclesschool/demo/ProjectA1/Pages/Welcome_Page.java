package com.Whitecirclesschool.demo.ProjectA1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {

	@FindBy(linkText = "LogOut")
	private WebElement logout;

	@FindBy(css = "body > div.elementor.elementor-102 > div > div > section.elementor-element.elementor-element-1ebf249.elementor-section-height-full.elementor-section-boxed.elementor-section-height-default.elementor-section-items-middle.elementor-section.elementor-top-section > div > div > div > div > div > div.elementor-element.elementor-element-ca79e64.elementor-widget.elementor-widget-heading > div > h1")
	private WebElement SuccessMessage;

	@FindBy(id = "work")
	private WebElement LetsWorkBtn;

	public Welcome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;

	}

	public WebElement getSuccessMessage() {
		return SuccessMessage;
	}

	public void LetsBtn() {
		LetsWorkBtn.click();
	}
}
