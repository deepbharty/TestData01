package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbSignup {
	
	public WebDriver driver;
	By createAccount=By.cssSelector("a[data-testid='open-registration-form-button']");
	
	By firstName=By.name("firstname");

	By lastName=By.name("lastname");
	
	By email=By.name("reg_email__");
	
	By confEmail=By.name("reg_email_confirmation__");
	
	By pass=By.name("reg_passwd__");
	
	//Date Of Birth
	
	By Day=By.id("day");
	
	By month=By.id("month");
	
	By year=By.id("year");
	
	//Gender
	
	By gender=By.cssSelector("span[data-type='radio'] span label");
	
	By submit=By.name("websubmit");
	
	By regError=By.id("reg_error_inner");
	
	public FbSignup(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	public WebElement createAccountButton() {
		return driver.findElement(createAccount);
		
	}
	
	public WebElement firstName() {
		return driver.findElement(firstName);
		
	}
	
	public WebElement lastName() {
		return driver.findElement(lastName);
		
	}
	
	public WebElement Email_Phone() {
		return driver.findElement(email);
		
	}
	
	public WebElement ConfEmail_Phone() {
		return driver.findElement(confEmail);
		
	}
	
	public WebElement password() {
		return driver.findElement(pass);
		
	}
	
	//Date of Birth Functions
	public WebElement day() {
		return driver.findElement(Day);	
	}
	
	public WebElement month() {
		return driver.findElement(month);	
	}
	
	public WebElement year() {
		return driver.findElement(year);	
	}
	
	//Gender List Method
	
	public List<WebElement> gender() {
		return driver.findElements(gender);	
	}
	
	public WebElement submit() {
		return driver.findElement(submit);	
	}
	
	public WebElement registrationErrorValidation() {
		return driver.findElement(regError);	
	}
	
	
}
