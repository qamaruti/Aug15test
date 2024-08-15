package com.prjct.qa.testcases;

import java.time.Duration;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.prjct.qa.base.TestBase;
import com.prjct.qa.pages.HomePage;
import com.prjct.qa.pages.LoginPage;

public class HomepageTest extends TestBase {

		LoginPage loginPage;
		HomePage homePage;

		public HomepageTest() {
			super();
		}

		@BeforeMethod
		public void setup() throws InterruptedException {

			initilization();
			loginPage = new LoginPage();
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
		}
		@Test (enabled=true)
		public void verifytitlepageTest() {
			String homepagetitle= homePage.verifyHomepageTitle();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(homepagetitle, "Login - Exacta Portal");
			
			System.out.println("Page Title is "+homepagetitle);
		}
		@Test(enabled=true)
		public void clickVerifyFavoritesPageLable() {
			homePage.clickFavoritiesMenu();
			String Lable1 = homePage.VerifyFavoritesPageLable();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(Lable1, "FAVORITES");
			System.out.println("Verified the label "+Lable1);
		}

		@Test(enabled=true)
		public void verifyOutboundPageLable() {
			homePage.clickOutboundMenu();
			String Lable2 = homePage.VerifyOutboundPageLable();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(Lable2, "OUTBOUND");
			System.out.println("Verified the label "+Lable2);

		}
		@Test(enabled=true)
		public void verifyInboundPageLable() {
			homePage.clickInboundMenu();
			String Lable3 = homePage.VerifyInboundPageLable();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(Lable3, "INBOUND");
			System.out.println("Verified the label "+Lable3);

		}
		@Test(enabled=true)
		public void verifyUsersandGroupsPageLable() {
			homePage.clickUsersandGroupsMenu();
			String Lable4 = homePage.VerifyUsersandGroupsPageLable();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(Lable4, "USERS AND GROUPS");
			System.out.println("Verified the label "+Lable4);

		}
		@Test(enabled=true)
		public void verifyInventoryMaintainancePageLable() {
			homePage.clickInventoryMaintainanceMenu();
			String Lable5 = homePage.VerifyInventoryMaintainancePageLable();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(Lable5, "INVENTORY MAINTENANCE");
			System.out.println("Verified the label "+Lable5);

		}
		@Test(enabled=true)
		public void verifyUtilitiesPageLable() {
			homePage.clickUtilitiesMenu();
			String Lable6 = homePage.VerifyUtilitiesPageLable();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(Lable6, "UTILITIES");
			System.out.println("Verified the label "+Lable6);

		}
		@Test(enabled=true)
		public void verifySelfserviceReportingPageLable() {
			homePage.clickSelfserviceReportingMenu();
			String Lable7 = homePage.VerifySelfserviceReportingPageLable();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			Assert.assertEquals(Lable7, "SELF SERVICE REPORTING");
			System.out.println("Verified the label "+Lable7);

		}

		@AfterMethod
		public void teardown() {
			driver.close();
		}

	}
