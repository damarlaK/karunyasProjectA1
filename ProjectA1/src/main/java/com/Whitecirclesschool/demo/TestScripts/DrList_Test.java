package com.Whitecirclesschool.demo.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Whitecirclesschool.demo.ProjectA1.Pages.*;

public class DrList_Test extends BaseTest {

	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;
	private Doctors_Lists dL;
	private Dr_Steven_Spielberg ss;
	private DR_Tim_Short ts;
	private Dr_James james;
	private String actual;
	private String expected;

	@Test()
	public void DoctorsListValidatioN() throws InterruptedException {
		lp = new Login_Page(driver);
		wp = new Welcome_Page(driver);
		pA1 = new Projects(driver);
		dL = new Doctors_Lists(driver);
		Thread.sleep(3000);
		lp.applicationlogin();
		wp.LetsBtn();
		pA1.ProjA1();

		String actualMessage = dL.getSuccessMessage().getText();
		String expectedMessage = "Doctor List";
		Assert.assertEquals(actualMessage, expectedMessage);

	}

	@Test(dependsOnMethods = "DoctorsListValidatioN", alwaysRun = true)
	public void validatelinktext() throws InterruptedException {
		ss = new Dr_Steven_Spielberg(driver);
		ts = new DR_Tim_Short(driver);
		james = new Dr_James(driver);

		dL.clDrStevenSpieberg();

		Thread.sleep(3000);

		// Verify Steven page
		actual = ss.DrStevenSpielberglink().getText();
		expected = "Dr Steven Spielberg";
		Assert.assertEquals(actual, expected);
		driver.navigate().back();

		// Verify Timshort page
		dL.clTimShort();
		actual = ts.DrTimShortlink().getText();
		expected = "Dr Tim Short";
		Assert.assertEquals(actual, expected);
		driver.navigate().back();

		dL.clDrJames();
		driver.navigate().back();

	}

}
