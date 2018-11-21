package com.main.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import junit.framework.Assert;

public class Test {
	
	public class TestIEBrowser {
		
		//static final String driverPath = "IE driver path";
		public WebDriver driver;
		
		@BeforeTest
		public void setUp() {
			System.out.println("*******************");
			System.out.println("launching IE browser");
		//	System.setProperty("webdriver.ie.driver", driverPath+"IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		@org.testng.annotations.Test
		public void testGooglePageTitleInIEBrowser() {
			driver.navigate().to("http://www.google.com");
			String strPageTitle = driver.getTitle();
			System.out.println("Page title: - "+strPageTitle);
		//	Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
		}

		@AfterTest
		public void tearDown() {
			if(driver!=null) {
				System.out.println("Closing IE browser");
				driver.quit();
			}
		}
	}

}
