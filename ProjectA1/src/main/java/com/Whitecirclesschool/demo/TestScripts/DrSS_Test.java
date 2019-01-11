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

public class DrSS_Test extends BaseTest {

	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;
	private Doctors_Lists dL;
	private Dr_Steven_Spielberg ss;
	private String actual;
	private String expected;
	private CommonControls cc;

	@Test()
	public void DoctorsListValidatioN() throws InterruptedException {

		lp = new Login_Page(driver);
		wp = new Welcome_Page(driver);
		pA1 = new Projects(driver);
		dL = new Doctors_Lists(driver);
		ss = new Dr_Steven_Spielberg(driver);
		cc = new CommonControls();
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

	@Test(dependsOnMethods="DoctorsListValidatioN", alwaysRun=true)
	public void validateTitle1Stevenspelbergpage() {
		Assert.assertTrue(cc.verifyTitle(ss.ssTitle1()));
	}

	@Test(dependsOnMethods="validateTitle1Stevenspelbergpage",alwaysRun=true)
	public void validateTitle2Stevenspelbergpage(){
		Assert.assertTrue(cc.verifyTitle(ss.ssTitle2()));	}

	@Test(dependsOnMethods="validateTitle2Stevenspelbergpage",alwaysRun=true)
	public void validateTitle3Stevenspelbergpage()  {
		Assert.assertTrue(cc.verifyTitle(ss.ssTitle3()));
	}

	@Test(dependsOnMethods="validateTitle3Stevenspelbergpage",alwaysRun=true)
	public void validateDesp1Stevenspelbergpage() {
		Assert.assertTrue(cc.verifyDescription(ss.ssDesp1()));
	}

	@Test(dependsOnMethods="validateDesp1Stevenspelbergpage",alwaysRun=true)
	public void validateDesp2Stevenspelbergpage() {
		Assert.assertTrue(cc.verifyDescription(ss.ssDesp2()));
	}

	@Test(dependsOnMethods="validateDesp2Stevenspelbergpage",alwaysRun=true)
	public void validateDesp3onevenspelbergpage() {
		Assert.assertTrue(cc.verifyDescription(ss.ssDesp3()));	}

	@Test(dependsOnMethods="validateDesp3onevenspelbergpage",alwaysRun=true)
	public void validateCreate1Stevenspelbergpage() {
		Assert.assertTrue(cc.verifyCreatedDate(ss.ssCreate1()));
	}

	@Test(dependsOnMethods="validateCreate1Stevenspelbergpage",alwaysRun=true)
	public void validateCreate2Stevenspelbergpage() {
		Assert.assertTrue(cc.verifyCreatedDate(ss.ssCreate2()));
	}

	@Test(dependsOnMethods="validateCreate2Stevenspelbergpage",alwaysRun=true)
	public void validateCreate3Stevenspelbergpage() {

		Assert.assertTrue(cc.verifyCreatedDate(ss.ssCreate3()));
	}

	@Test(dependsOnMethods="validateCreate3Stevenspelbergpage",alwaysRun=true)
	public void validateButton1StevenSpelbergpage() {
		ss.ssbutton1();
		Assert.assertTrue(cc.verifyUpvoteButton(driver));
		}

	@Test(dependsOnMethods="validateButton1StevenSpelbergpage",alwaysRun=true)
	public void validateButton2StevenSpelbergpage() {
		ss.ssbutton2();
		Assert.assertTrue(cc.verifyUpvoteButton(driver));
	}

	@Test(dependsOnMethods="validateButton2StevenSpelbergpage",alwaysRun=true)
	public void validateButton3StevenSpelbergpage() {
		ss.ssbutton3();
		Assert.assertTrue(cc.verifyUpvoteButton(driver));
	}

}
