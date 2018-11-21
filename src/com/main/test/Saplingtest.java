package com.main.test;
import org.testng.annotations.Test;

import com.main.sapling.ProfileFields;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
public class Saplingtest {
public WebDriver driver;
Properties p;
FileInputStream fi;
WebDriverWait wait;
  /*@Test
  public void Products() throws InterruptedException {
 	  Actions ac=new Actions(driver);
	  WebElement products=driver.findElement(By.xpath("//*[text()='Products']"));
	  Thread.sleep(2000);
	  ac.moveToElement(products).click().perform();
	  Thread.sleep(2000);
	  WebElement Corehr=driver.findElement(By.xpath("//*[@id=\"hs_menu_wrapper_module_14694228367545\"]/ul/li[1]/ul/li[1]/a"));
	  ac.moveToElement(Corehr).click().perform();
	  Thread.sleep(2000);
	  String Coreurl=driver.getCurrentUrl();
	  String ValidateCoreurl="corehr";
	  if(Coreurl.contains(ValidateCoreurl)) {
		  Reporter.log("Core Hr Link Opened",true);
	  }
	  else {
		  Reporter.log("Core Hr Link failed to Open",true);
	  }
 }*/
	@Test
	public void login() throws InterruptedException {
		com.main.sapling.AdminloginPage login=PageFactory.initElements(driver, com.main.sapling.AdminloginPage.class);
		login.Verify_Login("chaitanyavarma2@gmail.com", "india@123");
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Reporter.log(url ,true);
		String verify="updates";
		
		if(url.contains(verify)) {
			Reporter.log("Login sucess",true);
		}else {
			Reporter.log("Login unsucess",true);
		}
		ProfileFields.Createffield(driver);
	}
  @Parameters("browser")	
	
  @BeforeTest
  public void beforeTest(String browser) throws IOException {
//Run Opera
	/*  
	  OperaOptions options = new OperaOptions();
	  options.setBinary("C:\\Users\\Dizerc1\\AppData\\Local\\Programs\\Opera\\56.0.3051.52\\opera.exe");
	  driver = new OperaDriver(options);
	  */
//Run Chrome
	  
	 //driver = new ChromeDriver();

//Run Firefox	
	
	// driver = new FirefoxDriver();
	  
//Run Safari	
	  
	 // driver = new SafariDriver();	

//Run IE	  
/*	  InternetExplorerOptions options = new InternetExplorerOptions();
	  options.requireWindowFocus();
	  driver = new InternetExplorerDriver(options);
	 // driver = new InternetExplorerDriver();
*/
	 
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 
		  driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
		  // Here I am setting up the path for my IEDriver
		  InternetExplorerOptions options = new InternetExplorerOptions();
		  options.requireWindowFocus();
		  driver = new InternetExplorerDriver(options);
		 
	 
	  }else if (browser.equalsIgnoreCase("Chrome")) { 
	 
		  driver = new ChromeDriver();
		 
	 
	  }else if (browser.equalsIgnoreCase("opera")) { 
		  OperaOptions options = new OperaOptions();
		  options.setBinary("C:\\Users\\Dizerc1\\AppData\\Local\\Programs\\Opera\\56.0.3051.52\\opera.exe");
		  driver = new OperaDriver(options);
	 }    
		 
	  p =new Properties();
	  fi =new FileInputStream("Sapling.properties");
	  p.load(fi);
	  driver.get(p.getProperty("objurl"));
	  //driver.manage().window().setSize(new Dimension(1600,900));
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
 }
}
