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
	public void validateTitle1onevenspelbergpage() throws InterruptedException {

		actual = ss.ssTitle1().getText();
		expected = "This is awesome";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void validateTitle2onevenspelbergpage() throws InterruptedException {

		actual = ss.ssTitle2().getText();
		expected = "This is awesome";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void validateTitle3onevenspelbergpage() throws InterruptedException {

		actual = ss.ssTitle3().getText();
		expected = "This is awesome";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void validateDesp1onevenspelbergpage() throws InterruptedException {

		actual = ss.ssDesp1().getText();
		expected = "Lorem ipsum dolor sit amet, ut nec eros metus fames. Quam dictum a dui tincidunt quis.";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void validateDesp2onevenspelbergpage() throws InterruptedException {

		actual = ss.ssDesp2().getText();
		expected = "Lorem ipsum dolor sit amet, ut nec eros metus fames. Quam dictum a dui tincidunt quis.";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public void validateDesp3onevenspelbergpage() throws InterruptedException {

		actual = ss.ssDesp3().getText();
		expected = "Lorem ipsum dolor sit amet, ut nec eros metus fames. Quam dictum a dui tincidunt quis.";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 7)
	public void validateCreate1onevenspelbergpage() throws InterruptedException {

		actual = ss.ssCreate1().getText();
		expected = "Mon Apr 23 2018 05:30:00 GMT+0530 (India Standard Time)";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 8)
	public void validateCreate2onevenspelbergpage() throws InterruptedException {

		actual = ss.ssCreate2().getText();
		expected = "Mon Apr 23 2018 05:30:00 GMT+0530 (India Standard Time)";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 9)
	public void validateCreate3onevenspelbergpage() throws InterruptedException {

		actual = ss.ssCreate3().getText();
		expected = "Mon Apr 23 2018 05:30:00 GMT+0530 (India Standard Time)";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 10)
	public void validateButton1onevenspelbergpage() throws InterruptedException {

		boolean buttonenable1 = ss.ssbutton1().isEnabled();
		Assert.assertTrue(buttonenable1);

	}

	@Test(priority = 11)
	public void validateButton2onevenspelbergpage() throws InterruptedException {

		boolean buttonenable2 = ss.ssbutton2().isEnabled();
		Assert.assertTrue(buttonenable2);

	}

	@Test(priority = 12)
	public void validateButton3onevenspelbergpage() throws InterruptedException {

		boolean buttonenable3 = ss.ssbutton3().isEnabled();
		Assert.assertTrue(buttonenable3);

	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
