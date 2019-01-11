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

public class WelcomePage_Test extends BaseTest {

	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;

	@Test(priority = 0)
	public void verifyWelcomePage() throws InterruptedException {
		lp = new Login_Page(driver);
		wp = new Welcome_Page(driver);
		Thread.sleep(3000);
		lp.applicationlogin();
		String actualMessage = wp.getSuccessMessage().getText();
		String expectedMessage = "Welcome to the Project";
		Assert.assertEquals(actualMessage, expectedMessage);
		Thread.sleep(3000);

	}

	@Test(dependsOnMethods = "verifyWelcomePage",alwaysRun =true)
	public void LetsWbtn() throws InterruptedException {
		wp.LetsBtn();
		Thread.sleep(3000);
		}

	@Test(dependsOnMethods = "LetsWbtn", alwaysRun = true)
	public void projectA1page() {
		pA1 = new Projects(driver);
		pA1.ProjA1();
	}

}
