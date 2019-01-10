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
import com.Whitecirclesschool.demo.ProjectA1.Pages.Login_Page;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Projects;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Welcome_Page;

public class AlertBocTimshort {
	private WebDriver driver;
	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;
	private Doctors_Lists dL;
	private DR_Tim_Short ts;
	//private String actual;
	//private String expected;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.whitecircleschool.com/");
	}
	@Test(priority = 0)
	public void Alertbox1() throws InterruptedException {
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
		
		boolean alertPresent = true;
		ts.tsbutton1();
		try {
			driver.switchTo().alert().accept();
		}
		
		catch(Exception e) {
			alertPresent = false;
		}
		
//		try {
//			driver.switchTo().alert().accept();
//
//		} catch (Exception e) {
//			alertPresent = false;
//
//		}
		Assert.assertTrue(alertPresent);

	}

@AfterTest
public void close() {
	driver.close();
}
}
