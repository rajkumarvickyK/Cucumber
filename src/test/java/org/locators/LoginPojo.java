package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	//1.Non Parameterzied Constructer
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
		
		//2.private webelement
		@FindBy(id="email")
		private WebElement txtEmail;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement txtPass;
		
		@FindBy(name="login")
		private WebElement btnclk;
		
		//3.generate getters

		public WebElement getTxtEmail() {
			return txtEmail;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getBtnclk() {
			return btnclk;
		}

	

		

	}
