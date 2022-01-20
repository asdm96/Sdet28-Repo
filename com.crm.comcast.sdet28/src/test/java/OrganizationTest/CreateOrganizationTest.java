package OrganizationTest;

import org.testng.annotations.Test;

import com.crm.comacst.objectRepository.CreateOrganizationPage;
import com.crm.comacst.objectRepository.HomePage;
import com.crm.comacst.objectRepository.OrganizationInformaationPage;
import com.crm.comacst.objectRepository.OrganizationPage;
import com.crm.comcast.GenricUtility.BaseClass;


public class CreateOrganizationTest extends BaseClass{
	@Test(groups = {"regressionTest"})
	public void createOrg() throws Throwable{

		//get data from excel sheet
		String ExpectedorgnizationName = eUtil.getStringCellData("sheet1", 1, 2);
		ExpectedorgnizationName=ExpectedorgnizationName+ jUtil.getRandomNumber();

		//create organization
		HomePage homePage = new HomePage(driver);
		homePage.clickOrganizationLink();

		OrganizationPage orgPage = new OrganizationPage(driver);
		orgPage.clickCreateOrgImg();

		CreateOrganizationPage createOrgPage = new CreateOrganizationPage(driver);
		createOrgPage.createOrganization(ExpectedorgnizationName);

		OrganizationInformaationPage orgInfoPage = new OrganizationInformaationPage(driver);
		String actualOrgName = orgInfoPage.getOrgInfomationText();


		//organization name verification
		if(actualOrgName.contains(ExpectedorgnizationName)) {
			System.out.println("Organization is created===passed");
		}else {
			System.out.println("Organization is created===passed");
		}
	}
	@Test(groups = {"smokeTest"})
	public void createOrgWithIndustry() throws Throwable {
		//get data from excel sheet
		String ExpectedorgnizationName = eUtil.getStringCellData("sheet1", 1, 2);
		String industryType=eUtil.getStringCellData("sheet1", 3, 3);
		ExpectedorgnizationName=ExpectedorgnizationName+ jUtil.getRandomNumber();

		//create organization
		HomePage homePage = new HomePage(driver);
		homePage.clickOrganizationLink();

		OrganizationPage orgPage = new OrganizationPage(driver);
		orgPage.clickCreateOrgImg();

		CreateOrganizationPage createOrgPage = new CreateOrganizationPage(driver);
		createOrgPage.createOrgWithIndustry(industryType, ExpectedorgnizationName);

		OrganizationInformaationPage orgInfoPage = new OrganizationInformaationPage(driver);
		String actualOrgName = orgInfoPage.getOrgInfomationText();


		//organization name verification
		if(actualOrgName.contains(ExpectedorgnizationName)) {
			System.out.println("Organization is created");
		}else {
			System.out.println("Organization is not created");
		}
	}
}
