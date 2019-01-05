package com.Whitecirclesschool.demo.ProjectA1.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects {

	@FindBy(css = " #project1 > div > div > a > img")
	private WebElement ProjectA1;

	public Projects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ProjA1() {
		ProjectA1.click();
	}
}
