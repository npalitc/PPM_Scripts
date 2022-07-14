package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Node_Activity__ApproveContract
*/
public class Node_Activity__ApproveContract extends PageObjectBase
{

	public Node_Activity__ApproveContract()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@SuppressWarnings("static-access")
	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_3_UserId_textbox_TEXTBOX, final String Step_3_Password_textbox_TEXTBOX, final String Step_9_Number_textbox_TEXTBOX, final String Step_17_AmendmentEffectiveDate_textbox_TEXTBOX, final String Step_20_NoteForApprover_textbox_TEXTBOX) throws Exception

	{

	VerifyMessage_Page verifymessage_page_init=PageFactory.initElements(driver, VerifyMessage_Page.class);
	Thread.sleep(1000);
	LaunchURL_Page launchurl_page_init=PageFactory.initElements(driver, LaunchURL_Page.class);
	Thread.sleep(1000);
	SignInPage_Page signinpage_page_init=PageFactory.initElements(driver, SignInPage_Page.class);
	Thread.sleep(1000);
	HomePage_Page homepage_page_init=PageFactory.initElements(driver, HomePage_Page.class);
	Thread.sleep(1000);
	Contracts_Page contracts_page_init=PageFactory.initElements(driver, Contracts_Page.class);
	Thread.sleep(1000);
	ManageContractTemplates_Page managecontracttemplates_page_init=PageFactory.initElements(driver, ManageContractTemplates_Page.class);
	Thread.sleep(1000);
	EditContract_xxxSelected_Page editcontract_xxxselected_page_init=PageFactory.initElements(driver, EditContract_xxxSelected_Page.class);
	Thread.sleep(1000);
	SubmitContract_Page submitcontract_page_init=PageFactory.initElements(driver, SubmitContract_Page.class);
	Thread.sleep(1000);
	EditContractsBilling_Page editcontractsbilling_page_init=PageFactory.initElements(driver, EditContractsBilling_Page.class);
	Thread.sleep(1000);
	EditContracts_EditBillPlan_Page editcontracts_editbillplan_page_init=PageFactory.initElements(driver, EditContracts_EditBillPlan_Page.class);
	Thread.sleep(1000);
	EditContractsOverview_Page editcontractsoverview_page_init=PageFactory.initElements(driver, EditContractsOverview_Page.class);
	Thread.sleep(1000);
	EditContractsLines_Page editcontractslines_page_init=PageFactory.initElements(driver, EditContractsLines_Page.class);
	Thread.sleep(1000);
	editcontractslinesDetails_Page editcontractslinesdetails_page_init=PageFactory.initElements(driver, editcontractslinesDetails_Page.class);
	Thread.sleep(1000);
	CreateContractFromTemplate_Page createcontractfromtemplate_page_init=PageFactory.initElements(driver, CreateContractFromTemplate_Page.class);
	Thread.sleep(1000);
	EditContractsParties_Page editcontractsparties_page_init=PageFactory.initElements(driver, EditContractsParties_Page.class);

	TasksContracts_Page taskscontracts_page_init=PageFactory.initElements(driver, TasksContracts_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__ApproveContract", "TC_Node_Activity__ApproversNote___2_", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform LaunchURL Action");

	testReport.fillTableStep("Step 1", "Perform LaunchURL Action");

	launchurl_page_init.enter_URL_field(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify SignInPage screen");

	testReport.fillTableStep("Step 2", "verify SignInPage screen");
	Thread.sleep(4000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_2");

	Reporter.log("Step - 3- Fill SigninPage form SignInPage screen");

	testReport.fillTableStep("Step 3", "Fill SigninPage form SignInPage screen");
	Thread.sleep(4000);
	signinpage_page_init.set_UserId_textbox(Step_3_UserId_textbox_TEXTBOX);
	signinpage_page_init.set_Password_textbox(Step_3_Password_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_3");

	Reporter.log("Step - 4- click SignIn button SignInPage screen");

	testReport.fillTableStep("Step 4", "click SignIn button SignInPage screen");
	Thread.sleep(4000);
	signinpage_page_init.click_SignIn_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_4");

	Reporter.log("Step - 5- verify HomePage screen");

	testReport.fillTableStep("Step 5", "verify HomePage screen");
	Thread.sleep(4000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_5");

	Reporter.log("Step - 6- click Navigator hyperlink HomePage screen");

	testReport.fillTableStep("Step 6", "click Navigator hyperlink HomePage screen");
	Thread.sleep(4000);
	homepage_page_init.click_Navigator_hyperlink();
	Thread.sleep(5000);
	homepage_page_init.click_Show_More_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_6");

	Reporter.log("Step - 7- click Contracts hyperlink HomePage screen");

	testReport.fillTableStep("Step 7", "click Contracts hyperlink HomePage screen");
	Thread.sleep(4000);
	homepage_page_init.click_Contracts_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_7");

	Reporter.log("Step - 8- verify Contracts screen");

	testReport.fillTableStep("Step 8", "verify Contracts screen");
	Thread.sleep(4000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_8");

	Reporter.log("Step - 9- Fill AdvancedSearch form Contracts screen");

	testReport.fillTableStep("Step 9", "Fill AdvancedSearch form Contracts screen");
	Thread.sleep(4000);
	contracts_page_init.set_Number_textbox(Step_9_Number_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_9");

	Reporter.log("Step - 10- click Search button Contracts screen");

	testReport.fillTableStep("Step 10", "click Search button Contracts screen");
	Thread.sleep(4000);
	contracts_page_init.click_Search_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_10");

	Reporter.log("Step - 11- click SearchResultsNumberLink hyperlink Contracts screen");

	testReport.fillTableStep("Step 11", "click SearchResultsNumberLink hyperlink Contracts screen");
	Thread.sleep(4000);
	contracts_page_init.click_SearchResultsNumberLink_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_11");

	Reporter.log("Step - 12- verify EditContract xxxSelected screen");

	testReport.fillTableStep("Step 12", "verify EditContract xxxSelected screen");
	Thread.sleep(4000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_12");

	Reporter.log("Step - 13- click ActionsDrpDwn button EditContract xxxSelected screen");

	testReport.fillTableStep("Step 13", "click ActionsDrpDwn button EditContract xxxSelected screen");
	Thread.sleep(4000);
	editcontract_xxxselected_page_init.click_ActionsDrpDwn_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_13");

	Reporter.log("Step - 14- click Amend button EditContract xxxSelected screen");

	testReport.fillTableStep("Step 14", "click Amend button EditContract xxxSelected screen");
	Thread.sleep(4000);
	editcontract_xxxselected_page_init.click_Amend_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_14");

	Reporter.log("Step - 15- click AmendContractOK button EditContract xxxSelected screen");

	testReport.fillTableStep("Step 15", "click AmendContractOK button EditContract xxxSelected screen");
	Thread.sleep(4000);
	editcontract_xxxselected_page_init.click_AmendContractOK_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_15");

	Reporter.log("Step - 16- verify EditContractsOverview screen");

	testReport.fillTableStep("Step 16", "verify EditContractsOverview screen");
	Thread.sleep(4000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_16");

	Reporter.log("Step - 17- Fill Overview form EditContractsOverview screen");

	testReport.fillTableStep("Step 17", "Fill Overview form EditContractsOverview screen");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[contains(@id,'pt_r1:0:inputDate2::content')]")).clear();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[contains(@id,'pt_r1:0:inputDate2::content')]")).sendKeys("7/7/21");
	Thread.sleep(5000);
	editcontractsoverview_page_init.set_AmendmentEffectiveDate_textbox(Step_17_AmendmentEffectiveDate_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_17");

	Reporter.log("Step - 18- click Submit button EditContract xxxSelected screen");

	testReport.fillTableStep("Step 18", "click Submit button EditContract xxxSelected screen");
	Thread.sleep(4000);
	editcontract_xxxselected_page_init.click_Submit_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_18");

	Reporter.log("Step - 19- verify SubmitContract screen");

	testReport.fillTableStep("Step 19", "verify SubmitContract screen");
	Thread.sleep(4000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_19");

	Reporter.log("Step - 20- Fill ReviewApprovers form SubmitContract screen");

	testReport.fillTableStep("Step 20", "Fill ReviewApprovers form SubmitContract screen");
	Thread.sleep(4000);
	submitcontract_page_init.set_NoteForApprover_textbox(Step_20_NoteForApprover_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_20");

	Reporter.log("Step - 21- click Submit button SubmitContract screen");

	testReport.fillTableStep("Step 21", "click Submit button SubmitContract screen");
	Thread.sleep(4000);
	submitcontract_page_init.click_Submit_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_21");

	Reporter.log("Step - 22- Verify VerifyMessage Action");

	testReport.fillTableStep("Step 22", "Verify VerifyMessage Action");

	Thread.sleep(4000);
	Reporter.log("Step - 23- verify HomePage screen");
	testReport.fillTableStep("Step 23", "verify HomePage screen");
	Thread.sleep(4000);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_23");

	Reporter.log("Step - 24- click Notifications button HomePage screen");

	testReport.fillTableStep("Step 24", "click Notifications button HomePage screen");
	Thread.sleep(4000);
	//homepage_page_init.click_Notifications_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__ApproveContract","Step_24");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_9");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		//driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__ApproveContract");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
