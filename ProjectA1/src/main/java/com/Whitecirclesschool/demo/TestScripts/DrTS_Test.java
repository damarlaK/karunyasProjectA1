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
		dL.clTimShort();
		// Verify Dr Tim Short page
		actual = ts.DrTimShortlink().getText();
		expected = "Dr Tim Short";
		Assert.assertEquals(actual, expected);

	}

	@Test(priority = 1)
	public void validateTitle1TomShortPage() {
		boolean titlePresent = true;
		int titleLength = ts.tsTitle1().getText().length();
		System.out.println(titleLength);		
		
		if(titleLength<8) {
			titlePresent = false;
		}
		
		Assert.assertTrue(titlePresent);

	}

	@Test(priority = 2)
	public void validateTitle2TomShortPage() {

			boolean titlePresent = true;
			int titleLength = ts.tsTitle2().getText().length();
			if(titleLength<8) {
				titlePresent = false;
			}
			
			Assert.assertTrue(titlePresent);

			}

	@Test(priority = 3)
	public void validateTitle3TomShortPage() {
			boolean titlePresent = true;
			int titleLength = ts.tsTitle3().getText().length();
			if(titleLength<8) {
				titlePresent = false;
			}
			
			Assert.assertTrue(titlePresent);

		}

	@Test(priority = 4)
	public void validateDesp1TimShortPage() {

		boolean DescriptionPresent = true;
		int Descriptionlength = ts.tsDesp1().getText().length();
		if(Descriptionlength<14) {
			DescriptionPresent = false;
		}
		Assert.assertTrue(DescriptionPresent);

	}

	@Test(priority = 5)
	public void validateDesp2TimShortpage() throws InterruptedException {

		boolean DescriptionPresent = true;
		int Descriptionlength = ts.tsDesp2().getText().length();
		if(Descriptionlength<14) {
			DescriptionPresent = false;
		}
		Assert.assertTrue(DescriptionPresent);

	}
	@Test(priority = 6)
	public void validateDesp3TimShortgpage() throws InterruptedException {

		boolean DescriptionPresent = true;
		int Descriptionlength = ts.tsDesp3().getText().length();
		if(Descriptionlength<14) {
			DescriptionPresent = false;
		}
		Assert.assertTrue(DescriptionPresent);

	}
	@Test(priority = 7)
	public void validateCreate1TimShortpage()  {

		boolean createDate = ts.tsCreate1().getText().contains("GMT");
		Assert.assertTrue(createDate);

	}


	@Test(priority = 8)
	public void validateCreate2TimShortpage() throws InterruptedException {

		boolean createDate = ts.tsCreate2().getText().contains("GMT");
		Assert.assertTrue(createDate);

	}


	@Test(priority = 9)
	public void validateCreate3TimShortpage() throws InterruptedException {

		boolean createDate = ts.tsCreate3().getText().contains("GMT");
		Assert.assertTrue(createDate);

	}


	@Test(priority = 10)
	public void validateButton1TimShortpage()  {

			boolean alertPresent = true;
			ts.tsbutton1();
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {
				alertPresent = false;

			}
			Assert.assertTrue(alertPresent);

		}

	@Test(priority = 11)
	public void validateButton2TimShortpage() 
	{
		
			boolean alertPresent = true;
			ts.tsbutton1();
			try {
				driver.switchTo().alert().accept();

			} catch (Exception e) {
				alertPresent = false;

			}
			Assert.assertTrue(alertPresent);

		}
	

	@Test(priority = 12)
	public void validateButton3TimShortpage() {
			boolean alertPresent = true;
			ts.tsbutton1();
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
