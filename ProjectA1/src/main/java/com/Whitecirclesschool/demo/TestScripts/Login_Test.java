package com.Whitecirclesschool.demo.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Whitecirclesschool.demo.ProjectA1.Pages.Login_Page;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Welcome_Page;

public class Login_Test extends BaseTest {

	
	@Test
	public void logininformation() {
		Login_Page lp = new Login_Page(driver);
		Welcome_Page wp = new Welcome_Page(driver);
		lp.applicationlogin();
		boolean logoutStatus = wp.getLogout().isDisplayed();
		Assert.assertTrue(logoutStatus);
	}

}
