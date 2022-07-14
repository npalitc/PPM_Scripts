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
	Node_Activity__UpdateContractRateDetails
*/
public class Node_Activity__UpdateContractRateDetails extends PageObjectBase
{

	public Node_Activity__UpdateContractRateDetails()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_3_UserId_textbox_TEXTBOX, final String Step_3_Password_textbox_TEXTBOX, final String Step_9_Number_textbox_TEXTBOX, final String Step_17_AmendmentEffectiveDate_textbox_TEXTBOX, final String Step_20_NoteForApprover_textbox_TEXTBOX, final String Step_12_Number_textbox_TEXTBOX, final String Step_19_AmendmentEffectiveDate_textbox_TEXTBOX, final String Step_24_PRPerson_textbox_TEXTBOX, final String Step_24_PRCurrency_textbox_TEXTBOX, final String Step_24_PRRate_textbox_TEXTBOX, final String Step_24_PRStartDate_textbox_TEXTBOX, final String Step_24_PRContractLineNumber_textbox_TEXTBOX) throws Exception

	{

	VerifyMessage_Page verifymessage_page_init=PageFactory.initElements(driver, VerifyMessage_Page.class);

	LaunchURL_Page launchurl_page_init=PageFactory.initElements(driver, LaunchURL_Page.class);

	SignInPage_Page signinpage_page_init=PageFactory.initElements(driver, SignInPage_Page.class);

	HomePage_Page homepage_page_init=PageFactory.initElements(driver, HomePage_Page.class);

	Contracts_Page contracts_page_init=PageFactory.initElements(driver, Contracts_Page.class);

	ManageContractTemplates_Page managecontracttemplates_page_init=PageFactory.initElements(driver, ManageContractTemplates_Page.class);

	EditContract_xxxSelected_Page editcontract_xxxselected_page_init=PageFactory.initElements(driver, EditContract_xxxSelected_Page.class);

	SubmitContract_Page submitcontract_page_init=PageFactory.initElements(driver, SubmitContract_Page.class);

	EditContractsBilling_Page editcontractsbilling_page_init=PageFactory.initElements(driver, EditContractsBilling_Page.class);

	EditContracts_EditBillPlan_Page editcontracts_editbillplan_page_init=PageFactory.initElements(driver, EditContracts_EditBillPlan_Page.class);

	EditContractsOverview_Page editcontractsoverview_page_init=PageFactory.initElements(driver, EditContractsOverview_Page.class);

	EditContractsLines_Page editcontractslines_page_init=PageFactory.initElements(driver, EditContractsLines_Page.class);

	editcontractslinesDetails_Page editcontractslinesdetails_page_init=PageFactory.initElements(driver, editcontractslinesDetails_Page.class);

	CreateContractFromTemplate_Page createcontractfromtemplate_page_init=PageFactory.initElements(driver, CreateContractFromTemplate_Page.class);

	EditContractsParties_Page editcontractsparties_page_init=PageFactory.initElements(driver, EditContractsParties_Page.class);

	TasksContracts_Page taskscontracts_page_init=PageFactory.initElements(driver, TasksContracts_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__UpdateContractRateDetails", "TC_Node_Activity__UpdatePersonRateDetails___2_", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform LaunchURL Action");

	testReport.fillTableStep("Step 1", "Perform LaunchURL Action");

	launchurl_page_init.enter_URL_field(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify SignInPage screen");

	testReport.fillTableStep("Step 2", "verify SignInPage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_2");

	Reporter.log("Step - 3- Fill SigninPage form SignInPage screen");

	testReport.fillTableStep("Step 3", "Fill SigninPage form SignInPage screen");

	signinpage_page_init.set_UserId_textbox(Step_3_UserId_textbox_TEXTBOX);
	signinpage_page_init.set_Password_textbox(Step_3_Password_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_3");

	Reporter.log("Step - 4- click SignIn button SignInPage screen");

	testReport.fillTableStep("Step 4", "click SignIn button SignInPage screen");

	signinpage_page_init.click_SignIn_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_4");

	Reporter.log("Step - 5- verify HomePage screen");

	testReport.fillTableStep("Step 5", "verify HomePage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_5");

	Reporter.log("Step - 6- click Navigator hyperlink HomePage screen");

	testReport.fillTableStep("Step 6", "click Navigator hyperlink HomePage screen");

	homepage_page_init.click_Navigator_hyperlink();
	Thread.sleep(5000);
	homepage_page_init.click_Show_More_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_6");

	Reporter.log("Step - 7- click Contracts hyperlink HomePage screen");

	testReport.fillTableStep("Step 7", "click Contracts hyperlink HomePage screen");
	Thread.sleep(5000);
	homepage_page_init.click_Contracts_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_7");

	Reporter.log("Step - 8- verify Contracts screen");

	testReport.fillTableStep("Step 8", "verify Contracts screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_8");

	Reporter.log("Step - 9- click TasksContract button Contracts screen");

	testReport.fillTableStep("Step 9", "click TasksContract button Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.click_TasksContract_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_9");

	Reporter.log("Step - 10- click  ManageContracts hyperlink TasksContracts popup");

	testReport.fillTableStep("Step 10", "click  ManageContracts hyperlink TasksContracts popup");
	Thread.sleep(5000);
	taskscontracts_page_init.click_ManageContracts_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_10");

	Reporter.log("Step - 11- verify Contracts screen");

	testReport.fillTableStep("Step 11", "verify Contracts screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_11");

	Reporter.log("Step - 12- Fill AdvancedSearch form Contracts screen");

	testReport.fillTableStep("Step 12", "Fill AdvancedSearch form Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.set_Number_textbox(Step_12_Number_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_12");

	Reporter.log("Step - 13- click Search button Contracts screen");

	testReport.fillTableStep("Step 13", "click Search button Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.click_Search_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_13");

	Reporter.log("Step - 14- click SelectRowSearchResults button Contracts screen");

	testReport.fillTableStep("Step 14", "click SelectRowSearchResults button Contracts screen");

	//contracts_page_init.click_SelectRowSearchResults_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_14");

	Reporter.log("Step - 15- click SearchResultsNumberLink hyperlink Contracts screen");

	testReport.fillTableStep("Step 15", "click SearchResultsNumberLink hyperlink Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.click_SearchResultsNumberLink_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_15");

	Reporter.log("Step - 16- verify EditContract xxxSelected screen");

	testReport.fillTableStep("Step 16", "verify EditContract xxxSelected screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_16");

	Reporter.log("Step - 17- click Billing hyperlink EditContract xxxSelected screen");

	testReport.fillTableStep("Step 17", "click Billing hyperlink EditContract xxxSelected screen");
	Thread.sleep(5000);
	editcontract_xxxselected_page_init.click_Billing_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_17");

	Reporter.log("Step - 18- verify EditContractsBilling screen");

	testReport.fillTableStep("Step 18", "verify EditContractsBilling screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_18");

	Reporter.log("Step - 19- click BillPlansT M BP hyperlink EditContractsBilling screen Billing form");

	testReport.fillTableStep("Step 19", "click BillPlansT M BP hyperlink EditContractsBilling screen Billing form");
	Thread.sleep(5000);
	editcontractsbilling_page_init.click_BillPlansT_M_BP_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_19");

	Reporter.log("Step - 20- verify EditContracts EditBillPlan screen");

	testReport.fillTableStep("Step 20", "verify EditContracts EditBillPlan screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_20");

	Reporter.log("Step - 21- click SchedulesandOverrides hyperlink EditContracts EditBillPlan screen");

	testReport.fillTableStep("Step 21", "click SchedulesandOverrides hyperlink EditContracts EditBillPlan screen");
	Thread.sleep(5000);
	editcontracts_editbillplan_page_init.click_SchedulesandOverrides_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_21");

	Reporter.log("Step - 22- click ExpandPersonRateTable button EditContracts EditBillPlan screen SchedulesandOverrides form");

	testReport.fillTableStep("Step 22", "click ExpandPersonRateTable button EditContracts EditBillPlan screen SchedulesandOverrides form");
	Thread.sleep(5000);
	editcontracts_editbillplan_page_init.click_ExpandPersonRateTable_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_22");

	Reporter.log("Step - 23- click PRAddBtn button EditContracts EditBillPlan screen SchedulesandOverrides form");

	testReport.fillTableStep("Step 23", "click PRAddBtn button EditContracts EditBillPlan screen SchedulesandOverrides form");
	Thread.sleep(5000);
	//editcontracts_editbillplan_page_init.click_PRAddBtn_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_23");

	Reporter.log("Step - 24- Fill SchedulesandOverrides form EditContracts EditBillPlan screen");

	testReport.fillTableStep("Step 24", "Fill SchedulesandOverrides form EditContracts EditBillPlan screen");
	Thread.sleep(5000);
		/*
		 * editcontracts_editbillplan_page_init.set_PRPerson_textbox(
		 * Step_24_PRPerson_textbox_TEXTBOX);
		 * editcontracts_editbillplan_page_init.set_PRCurrency_textbox(
		 * Step_24_PRCurrency_textbox_TEXTBOX);
		 * editcontracts_editbillplan_page_init.set_PRRate_textbox(
		 * Step_24_PRRate_textbox_TEXTBOX);
		 * editcontracts_editbillplan_page_init.set_PRStartDate_textbox(
		 * Step_24_PRStartDate_textbox_TEXTBOX);
		 * editcontracts_editbillplan_page_init.set_PRContractLineNumber_textbox(
		 * Step_24_PRContractLineNumber_textbox_TEXTBOX);
		 */
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_24");

	Reporter.log("Step - 25- click Save button EditContracts EditBillPlan screen");

	testReport.fillTableStep("Step 25", "click Save button EditContracts EditBillPlan screen");
	Thread.sleep(5000);
	//editcontracts_editbillplan_page_init.click_Save_button();
	driver.findElement(By.xpath("//*[contains(@id,'SPsv2')]")).click();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractRateDetails","Step_25");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_11");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		//driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__UpdateContractRateDetails");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
