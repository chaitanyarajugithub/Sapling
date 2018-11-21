package com.main.sapling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class ProfileFields {
	public static WebElement element = null;
	public static void Clickonprofilefields(WebDriver driver) throws InterruptedException {
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='ng-scope']//li[4]//div[1]//a[1]")).click();
		Thread.sleep(2000);
	}
	public static void ClickonNewfield(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div[1]/button")).click();
	}
		
	public static void Associatedsection(WebDriver driver) {
		try{
			Thread.sleep(2000);
			WebElement mySelectElement = driver.findElement((By.xpath("/html[1]/body[1]/div[5]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/md-input-container[1]/md-select[1]")));
			//Select dropdown= new Select(mySelectElement);
			mySelectElement.click();
			WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[6]/md-select-menu[1]/md-content[1]/md-option[1]/div[1]"));
			Actions action = new Actions(driver);
	        action.moveToElement(element).click().build().perform();
			//dropdown.selectByVisibleText("Personal Information");
			//dropdown.selectByIndex(1);
		}
		catch (Exception e) {
			}	
		}
	public static void Fieldname(WebDriver driver, String str1) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		element.clear();
		element.sendKeys(str1);
	}
	public static void Fieldtype(WebDriver driver) {
		try{
			Thread.sleep(1000);
			WebElement mySelectElement = driver.findElement((By.xpath("/html[1]/body[1]/div[5]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/md-input-container[3]/md-select[1]")));
			mySelectElement.click();
			WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/md-select-menu[1]/md-content[1]/md-option[1]/div[1]"));
			Actions action = new Actions(driver);
	        action.moveToElement(element).click().build().perform();
	  }
		catch (Exception e) {
			}	
		}
	public static void Filledby(WebDriver driver) {
		try{
			Thread.sleep(1000);
			WebElement mySelectElement = driver.findElement((By.xpath("/html[1]/body[1]/div[5]/md-dialog[1]/form[1]/md-dialog-content[1]/div[1]/md-input-container[4]/md-select[1]")));
			mySelectElement.click();
			WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[8]/md-select-menu[1]/md-content[1]/md-option[1]/div[1]"));
			Actions action = new Actions(driver);
	        action.moveToElement(element).click().build().perform();
		}
		catch (Exception e) {
			}	
		}
	public static void Helptext(WebDriver driver, String str1) throws InterruptedException {
		Thread.sleep(1000);
		element = driver.findElement(By.xpath("//*[@id=\"help-text\"]"));
		element.clear();
		element.sendKeys(str1);
	}

	
	public static void Submit(WebDriver driver) throws InterruptedException {
		//Thread.sleep(2000);
		element = driver.findElement(By.xpath("/html/body/div[6]/md-dialog/form/md-dialog-actions/div[2]/md-input-container/button"));
		element.submit();
	}
	
	
//	Method to Create Custom profile field
	public static void Createffield(WebDriver driver) throws InterruptedException {
		Clickonprofilefields(driver);
		ClickonNewfield(driver);
		Associatedsection(driver);
		Fieldname(driver, "HRNAME");
		Fieldtype(driver);
		Filledby(driver);
		Helptext(driver, "Required");
		Thread.sleep(2000);
		//Submit(driver);
	}
	
	

}
