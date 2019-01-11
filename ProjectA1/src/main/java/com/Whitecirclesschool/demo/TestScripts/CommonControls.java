package com.Whitecirclesschool.demo.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CommonControls {

	public boolean verifyUpvoteButton(WebDriver driver) {
		boolean alertPresent = true;

		try {
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			alertPresent = false;

		}
		return alertPresent;
	}

	public boolean verifyCreatedDate(WebElement createdDate) {
		boolean createDate = createdDate.getText().contains("GMT");
		return createDate;
	}

	public boolean verifyDescription(WebElement Description) {

		boolean DescriptionPresent = true;
		int Descriptionlength = Description.getText().length();
		if (Descriptionlength < 14) {
			DescriptionPresent = false;
		}
		return DescriptionPresent;
	}

	public boolean verifyTitle(WebElement Title) {

		boolean TitlePresent = true;
		int Titlelength = Title.getText().length();
		System.out.println(Titlelength);
		if (Titlelength < 8) {
			TitlePresent = false;
		}
		return TitlePresent;
	}
}
