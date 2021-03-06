package com.main.sapling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Browser_Resuable {
public	static WebDriver driver;
public static void Helper_Chrome(String url)
{
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
}
public static void Helper_firefox(String url)
{
	driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
}
public static void Helper_Ie(String url)
{
	driver=new InternetExplorerDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
}
public static void Helper_Opera(String Binarypath,String url)
{
	OperaOptions options = new OperaOptions();
	options.setBinary(Binarypath);
	driver = new OperaDriver(options);
	driver.get(url);
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
}
}
