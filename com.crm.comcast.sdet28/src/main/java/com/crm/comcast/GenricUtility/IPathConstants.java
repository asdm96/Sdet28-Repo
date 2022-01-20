package com.crm.comcast.GenricUtility;
/**
 * Constant values
 * @author Adarsh M
 *
 */
public interface IPathConstants {
	String PROPERTY_FILEPATH="./src/test/resources/commonData.properties";
	String EXCEL_FILEPATH="./src/test/resources/vtigerTestScriptData.xlsx";
	
	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_PATH="./src/main/resources/chromedriver.exe";
	
	String FIREFOX_KEY="webdriver.gecko.driver";
	String FIREFOX_PATH="./src/main/resources/geckodriver.exe";
	
	String SHEET_NAME= "Sheet1";
	String DATABASE_URL="jdbc:mysql://localhost:3306/studentinfo";

}
