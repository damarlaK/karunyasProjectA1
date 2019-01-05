package com.Whitecirclesschool.demo.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Whitecirclesschool.demo.ProjectA1.Pages.Login_Page;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Projects;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Welcome_Page;

public class WelcomePage_Test {
	private WebDriver driver;
	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.whitecircleschool.com/");
	}

	@Test(priority=0)
	public void logininformation() throws InterruptedException {
		lp = new Login_Page(driver);
		wp = new Welcome_Page(driver);
		Thread.sleep(3000);
		lp.applicationlogin();
		boolean logoutStatus = wp.getLogout().isDisplayed();
		Assert.assertTrue(logoutStatus);

	}

	@Test(priority=1)
	public void welcomeMessageValidation() throws InterruptedException {

		String actualMessage = wp.getSuccessMessage().getText();
		String expectedMessage = "Welcome to the Project";
		Assert.assertEquals(actualMessage, expectedMessage);
		Thread.sleep(3000);

	}

	@Test(priority=2)
	public void LetsWbtn() throws InterruptedException {

		wp.LetsBtn();
		Thread.sleep(3000);
	}

	@Test(priority=3)
	public void prjectA1page() {
		pA1 = new Projects(driver);
		pA1.ProjA1();
	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
