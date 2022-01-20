package com.crm.comacst.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenricUtility.WebDriverUtility;
/**
 * HomePage pom design
 * @author Adarsh M
 *
 */
public class HomePage extends WebDriverUtility {
	//initialization of elements
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//declaration of elements
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutImg;
	
	@FindBy(linkText ="Sign Out")
	private WebElement signOutLink;
	
	@FindBy(name="username textFied")
	private WebElement unTextField;
	
   //getters methods
	public WebElement getLogoutImg() {
		return logoutImg;
	}
	public WebElement getSignOutLink() {
		return signOutLink;
	}
	public WebElement getOrganizationLink() {
		return organizationLink;
	}
    //getters method
	public WebElement getContactsLink() {
		return contactsLink;
	}
	//business logics
	/**
	 * This method will click on organization link
	 */
	public void clickOrganizationLink() {
		organizationLink.click();
	}
	/**
	 * This method will click on contacts link
	 */
	public void clickOnContactLink() {
		contactsLink.click();
	}
	/**
	 * This method will perform logout action
	 */
	public void logout() {
		mouseOver(driver, logoutImg);
		signOutLink.click();	
	}
}
