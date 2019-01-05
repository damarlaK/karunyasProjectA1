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

public class Login_Test {

	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.whitecircleschool.com/");
	}

	@Test
	public void logininformation() {
		Login_Page lp = new Login_Page(driver);
		Welcome_Page wp = new Welcome_Page(driver);
		lp.applicationlogin();
		boolean logoutStatus = wp.getLogout().isDisplayed();
		Assert.assertTrue(logoutStatus);
	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
