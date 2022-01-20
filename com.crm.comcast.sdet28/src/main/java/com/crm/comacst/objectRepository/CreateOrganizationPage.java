package com.crm.comacst.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.comcast.GenricUtility.WebDriverUtility;
/**
 * Create organization pom class
 * @author Adarsh M
 *
 */
public class CreateOrganizationPage extends WebDriverUtility{
	public CreateOrganizationPage(WebDriver driver	) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement organizationTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(name="industry")
	private WebElement industryDropDown;

	public WebElement getOrganizationTextField() {
		return organizationTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This method will create an organization
	 * @param orgName
	 */
	public void createOrganization(String orgName) {
		organizationTextField.sendKeys(orgName);
		saveButton.click();
	}
	/**
	 * Create org with industry drop down
	 * @param industryName
	 * @param orgName
	 */
	public void createOrgWithIndustry(String industryName,String orgName) {
		organizationTextField.sendKeys(orgName);
		selectOption(industryName, industryDropDown);
		saveButton.click();
	}
	

}
