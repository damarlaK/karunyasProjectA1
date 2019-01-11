package com.Whitecirclesschool.demo.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Whitecirclesschool.demo.ProjectA1.Pages.DR_Tim_Short;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Doctors_Lists;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Login_Page;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Projects;
import com.Whitecirclesschool.demo.ProjectA1.Pages.Welcome_Page;

public class DrTS_Test extends BaseTest {

	private Login_Page lp;
	private Welcome_Page wp;
	private Projects pA1;
	private Doctors_Lists dL;
	private DR_Tim_Short ts;
	private String actual;
	private String expected;
	private CommonControls cc;

	@Test()
	public void DoctorsListValidatioN() throws InterruptedException {
		lp = new Login_Page(driver);
		wp = new Welcome_Page(driver);
		pA1 = new Projects(driver);
		dL = new Doctors_Lists(driver);
		ts = new DR_Tim_Short(driver);
		cc = new CommonControls();
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

	@Test(dependsOnMethods ="DoctorsListValidatioN",alwaysRun = true)
	public void validateTitle1TomShortPage() {
		Assert.assertTrue(cc.verifyTitle(ts.tsTitle1()));
	}

	@Test(dependsOnMethods="validateTitle1TomShortPage",alwaysRun = true )
	public void validateTitle2TomShortPage() {
		Assert.assertTrue(cc.verifyTitle(ts.tsTitle2()));
	}

	@Test(dependsOnMethods = "validateTitle2TomShortPage",alwaysRun = true)
	public void validateTitle3TomShortPage() {
		Assert.assertTrue(cc.verifyTitle(ts.tsTitle3()));
	}

	/*@Test(dependsOnMethods = "validateTitle3TomShortPage",alwaysRun = true)
	public void validateDesp1TimShortPage() {
		Assert.assertTrue(cc.verifyDescription(ts.tsDesp1()));
	}

	@Test(dependsOnMethods = "validateDesp1TimShortPage",alwaysRun = true)
	public void validateDesp2TimShortpage() {
		Assert.assertTrue(cc.verifyDescription(ts.tsDesp2()));
	}

	@Test(dependsOnMethods = "validateDesp2TimShortpage",alwaysRun = true)
	public void validateDesp3TimShortgpage() {
		Assert.assertTrue(cc.verifyDescription(ts.tsDesp3()));
	}

	@Test(dependsOnMethods = "validateDesp3TimShortgpage",alwaysRun = true)
	public void validateCreate1TimShortpage() {
		Assert.assertTrue(cc.verifyCreatedDate(ts.tsCreate1()));
	}

	@Test(dependsOnMethods = "validateCreate1TimShortpage",alwaysRun = true)
	public void validateCreate2TimShortpage() {
		Assert.assertTrue(cc.verifyCreatedDate(ts.tsCreate2()));
	}

	@Test(dependsOnMethods = "validateCreate2TimShortpage",alwaysRun = true)
	public void validateCreate3TimShortpage() {
		Assert.assertTrue(cc.verifyCreatedDate(ts.tsCreate3()));
	}

	@Test(dependsOnMethods = "validateCreate3TimShortpage",alwaysRun = true)
	public void validateButton1TimShortpage() {
		ts.tsbutton1();
		Assert.assertTrue(cc.verifyUpvoteButton(driver));
	}

	@Test(dependsOnMethods = "validateButton1TimShortpage",alwaysRun = true)
	public void validateButton2TimShortpage() {
		ts.tsbutton2();
		Assert.assertTrue(cc.verifyUpvoteButton(driver));
	}

	@Test(dependsOnMethods = "validateButton2TimShortpage",alwaysRun = true)
	public void validateButton3TimShortpage() {
		ts.tsbutton3();
		Assert.assertTrue(cc.verifyUpvoteButton(driver));
	}
*/
}
