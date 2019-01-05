package com.Whitecirclesschool.demo.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Whitecirclesschool.demo.ProjectA1.Pages.DR_Tim_Short;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Doctors_Lists;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Dr_Steven_Spielberg;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Login_Page;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Projects;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Welcome_Page;

public class DrTS_Test {
	private WebDriver driver;
	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;
	private Doctors_Lists dL;
	private DR_Tim_Short ts;
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
		ts = new DR_Tim_Short(driver);	
		Thread.sleep(3000);
		lp.applicationlogin();
		wp.LetsBtn();
		pA1.ProjA1();

		dL.clDrStevenSpieberg();
		Thread.sleep(3000);
		// Verify Dr Tim Short page
		actual = ts.DrTimShortlink().getText();
		expected = "Dr Tim Short";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 1)
	public void validateTitle1onevenspelbergpage() throws InterruptedException {

		actual = ts.tsTitle1().getText();
		expected = "";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void validateTitle2onevenspelbergpage() throws InterruptedException {

		actual = ts.tsTitle2().getText();
		expected = "";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void validateTitle3onevenspelbergpage() throws InterruptedException {

		actual = ts.tsTitle3().getText();
		expected = "";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 4)
	public void validateDesp1onevenspelbergpage() throws InterruptedException {

		actual = ts.tsDesp1().getText();
		expected = "Lorem ipsum dolor sit amet, ut nec eros metus fames. Quam dictum a dui tincidunt quis.";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void validateDesp2onevenspelbergpage() throws InterruptedException {

		actual = ts.tsDesp2().getText();
		expected = "Lorem ipsum dolor sit amet, ut nec eros metus fames. Quam dictum a dui tincidunt quis.";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 6)
	public void validateDesp3onevenspelbergpage() throws InterruptedException {

		actual = ts.tsDesp3().getText();
		expected = "Lorem ipsum dolor sit amet, ut nec eros metus fames. Quam dictum a dui tincidunt quis.";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 7)
	public void validateCreate1onevenspelbergpage() throws InterruptedException {

		actual = ts.tsCreate1().getText();
		expected = "Invalid Date";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 8)
	public void validateCreate2onevenspelbergpage() throws InterruptedException {

		actual = ts.tsCreate2().getText();
		expected = "Invalid Date";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 9)
	public void validateCreate3onevenspelbergpage() throws InterruptedException {

		actual = ts.tsCreate3().getText();
		expected = "Invalid Date";
		Assert.assertEquals(actual, expected);
		Thread.sleep(3000);

	}

	@Test(priority = 10)
	public void validateButton1onevenspelbergpage() throws InterruptedException {

		boolean buttonenable1 = ts.tsbutton1().isEnabled();
		Assert.assertTrue(buttonenable1);

	}

	@Test(priority = 11)
	public void validateButton2onevenspelbergpage() throws InterruptedException {

		boolean buttonenable2 = ts.tsbutton2().isEnabled();
		Assert.assertTrue(buttonenable2);

	}

	@Test(priority = 12)
	public void validateButton3onevenspelbergpage() throws InterruptedException {

		boolean buttonenable3 = ts.tsbutton3().isEnabled();
		Assert.assertTrue(buttonenable3);

	}

	@AfterTest
	public void close() {
		driver.close();
	}
}
