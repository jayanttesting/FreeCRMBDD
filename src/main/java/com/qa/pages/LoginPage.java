package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {

	
	public LoginPage() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}


	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "username")
	WebElement loginbtn;
	
	
	public void LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
}
