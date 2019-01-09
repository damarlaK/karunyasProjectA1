package com.Whitecirclesschool.demo.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Whitecirclesschool.demo.ProjectA1.Pages.Doctors_Lists;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Dr_Steven_Spielberg;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Login_Page;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Projects;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Welcome_Page;

public class DrSS_Test {

	private WebDriver driver;
	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;
	private Doctors_Lists dL;
	private Dr_Steven_Spielberg ss;
	private String actual;
	private String expected;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.whitecircleschool.com/");
	}

	@Test(priority = 0)
	public void DoctorsListValidatio() throws InterruptedException {
		lp = new Login_Page(driver);
		wp = new Welcome_Page(driver);
		pA1 = new Projects(driver);
		dL = new Doctors_Lists(driver);
		ss = new Dr_Steven_Spielberg(driver);
		Thread.sleep(3000);
		lp.applicationlogin();
		wp.LetsBtn();
		pA1.ProjA1();

		dL.clDrStevenSpieberg();
		Thread.sleep(3000);
		// Verify Steven page
		actual = ss.DrStevenSpielberglink().getText();
		expected = "Dr Steven Spielberg";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 1)
	public void validateTitle1Stevenspelbergpage() throws InterruptedException {

		boolean titlePresent = true;
		int titleLength = ss.ssTitle1().getText().length();
		if (titleLength < 6) {
			titlePresent = false;
		}

		Assert.assertTrue(titlePresent);

	}

	@Test(priority = 2)
	public void validateTitle2Stevenspelbergpage() throws InterruptedException {

		boolean titlePresent = true;
		int titleLength = ss.ssTitle2().getText().length();
		if (titleLength < 6) {
			titlePresent = false;
		}

		Assert.assertTrue(titlePresent);

	}

	@Test(priority = 3)
	public void validateTitle3Stevenspelbergpage() throws InterruptedException {

		boolean titlePresent = true;
		int titleLength = ss.ssTitle3().getText().length();
		if (titleLength < 6) {
			titlePresent = false;
		}

		Assert.assertTrue(titlePresent);

	}

	@Test(priority = 4)
	public void validateDesp1Stevenspelbergpage() {

		boolean DescriptionPresent = true;
		int DescriptionLength = ss.ssDesp1().getText().length();
		if (DescriptionLength < 14) {
			DescriptionPresent = false;
		}

		Assert.assertTrue(DescriptionPresent);

	}

	@Test(priority = 5)
	public void validateDesp2Stevenspelbergpage() {

		boolean DescriptionPresent = true;
		int DescriptionLength = ss.ssDesp2().getText().length();
		if (DescriptionLength < 14) {
			DescriptionPresent = false;
		}

		Assert.assertTrue(DescriptionPresent);

	}

	@Test(priority = 6)
	public void validateDesp3onevenspelbergpage() {

		boolean DescriptionPresent = true;
		int DescriptionLength = ss.ssDesp3().getText().length();
		if (DescriptionLength < 14) {
			DescriptionPresent = false;
		}

		Assert.assertTrue(DescriptionPresent);

	}

	@Test(priority = 7)
	public void validateCreate1Stevenspelbergpage() {

		boolean createDate = ss.ssCreate1().getText().contains("GMT");
		Assert.assertTrue(createDate);

	}

	@Test(priority = 8)
	public void validateCreate2Stevenspelbergpage() {

		boolean createDate = ss.ssCreate2().getText().contains("GMT");
		Assert.assertTrue(createDate);

	}

	@Test(priority = 9)
	public void validateCreate3Stevenspelbergpage() {

		boolean createDate = ss.ssCreate3().getText().contains("GMT");
		Assert.assertTrue(createDate);

	}

	@Test(priority = 10)
	public void validateButton1StevenSpelbergpage() {
		boolean alertPresent = true;
		ss.ssbutton1();
		try {
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			alertPresent = false;

		}
		Assert.assertTrue(alertPresent);

	}

	@Test(priority = 11)
	public void validateButton2StevenSpelbergpage() {
		boolean alertPresent = true;
		ss.ssbutton2();
		try {
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			alertPresent = false;

		}
		Assert.assertTrue(alertPresent);

	}

	@Test(priority = 12)
	public void validateButton3StevenSpelbergpage() {
		boolean alertPresent = true;
		ss.ssbutton3();
		try {
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			alertPresent = false;

		}
		Assert.assertTrue(alertPresent);

	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
