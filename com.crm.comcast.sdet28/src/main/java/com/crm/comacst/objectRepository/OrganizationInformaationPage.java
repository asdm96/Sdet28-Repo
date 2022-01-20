package com.crm.comacst.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * Organization information pom class
 * @author Adarsh M
 *
 */
public class OrganizationInformaationPage {
	public OrganizationInformaationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement orgInfoText;
	
	public WebElement getOrgInfoText() {
		return orgInfoText;
	}
	
	/**
	 * It will return the organization information text
	 * @return
	 */
	public String getOrgInfomationText() {
		return orgInfoText.getText();	
	}
	

}
