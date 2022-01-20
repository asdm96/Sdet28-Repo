package com.crm.comacst.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * Login page POM design
 * @author Adarsh M
 *
 */
public class LoginPage {
	
	//element initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//element identification or declaration
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
    
	//getters methods
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	//business logic for login action
	/**
	 * This method will perform application login action
	 * @param userName
	 * @param password
	 */
	public void loginToApplication(String userName,String password) {
		usernameTextField.sendKeys(userName);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	
	
	
	
	
	

}
