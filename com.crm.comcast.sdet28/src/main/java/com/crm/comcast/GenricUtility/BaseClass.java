package com.crm.comcast.GenricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.comacst.objectRepository.HomePage;
import com.crm.comacst.objectRepository.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	public FileUtility fUtil = new FileUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public JavaUtility jUtil = new JavaUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	 
     @BeforeSuite(groups = {"smokeTest","regressionTest"})
     public void configBs() {
    	 //connection to db
    	 System.out.println("====Connect to DB========"); 
     }
     //@Parameters("browser")
     @BeforeClass(groups = {"smokeTest","regressionTest"})
     public void configBc() throws Throwable {
    	 //launching the browser
    	 String browser = fUtil.getPropertyFileData("browser");
    	 String url = fUtil.getPropertyFileData("url");
    	 
    	if(browser.equals("Chrome")) {
 			System.setProperty(IPathConstants.CHROME_KEY, IPathConstants.CHROME_PATH);
 			driver = new ChromeDriver();
 		}
 		else if(browser.equals("firefox")) {
 			System.setProperty(IPathConstants.FIREFOX_KEY, IPathConstants.FIREFOX_PATH);
 			driver= new FirefoxDriver();
 		}
 		else {
 			System.out.println("Browser not available");
 		} 
    	 
    	 sdriver=driver;
    	 driver.manage().window().maximize();
    	 wUtil.waitForPageLoad(driver);
    	 driver.get(url);
    	
     }
     @BeforeMethod(groups = {"smokeTest","regressionTest"})
     public void configBm() throws Throwable {
    	 String userName = fUtil.getPropertyFileData("username");
    	 String password = fUtil.getPropertyFileData("password");
    	 LoginPage login = new LoginPage(driver);
    	 login.loginToApplication(userName, password);
     }
     @AfterMethod(groups = {"smokeTest","regressionTest"})
     public void configAm() {
    	 HomePage homePage = new HomePage(driver);
    	 homePage.logout();
    	 
     }
     @AfterClass(groups = {"smokeTest","regressionTest"})
     public void configAc() {
    	 //closing or quitting the browser
    	 driver.quit(); 
     }
     @AfterSuite(groups = {"smokeTest","regressionTest"})
     public void configAs() {
    	 //closing the database connection
    	 System.out.println("====Database connection is closed"); 
     }
}
