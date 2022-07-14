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
	Node_Activity__CaptureAndPublishProjectProgress_
*/
public class Node_Activity__CaptureAndPublishProjectProgress_ extends PageObjectBase
{

	public Node_Activity__CaptureAndPublishProjectProgress_()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_3_UserId_textbox_TEXTBOX, final String Step_3_Password_textbox_TEXTBOX, final String Step_13_SourceTemplate_textbox_TEXTBOX, final String Step_13_ProjectName_textbox_TEXTBOX, final String Step_13_Ledger_textbox_TEXTBOX, final String Step_13_TransferToGeneralLedger_dropdown_DROPDOWN, final String Step_13_PostInGeneralLedger_dropdown_DROPDOWN, final String Step_10_ProjectNumber_textbox_TEXTBOX, final String Step_10_TeamMember_textbox_TEXTBOX, final String Step_13_Actions_dropdown_DROPDOWN, final String Step_15_Save_dropdown_DROPDOWN, final String Step_15_TransactionCurrency_textbox_TEXTBOX, final String Step_15_RawCost_textbox_TEXTBOX, final String Step_15_BurdenedCost_textbox_TEXTBOX, final String Step_13_ProjectNumber_textbox_TEXTBOX, final String Step_13_ExpenditureOrg_textbox_TEXTBOX, final String Step_17_Actions_dropdown_DROPDOWN, final String Step_17_Costing_dropdown_DROPDOWN, final String Step_17_Billing_dropdown_DROPDOWN, final String Step_13_FileName_textbox_TEXTBOX, final String Step_13_Businessunit_textbox_TEXTBOX, final String Step_13_TransactionSource_dropdown_DROPDOWN, final String Step_19_ProjectNum_textbox_TEXTBOX, final String Step_19_TaskNum_textbox_TEXTBOX, final String Step_20_ClassCode_textbox_TEXTBOX, final String Step_20_To_dropdown_DROPDOWN, final String Step_21_AutomaticallyGenerateBudget_checkbox_CHECKBOX, final String Step_21_Person_textbox_TEXTBOX, final String Step_21_StartDate_textbox_TEXTBOX, final String Step_21_ProjectRole_dropdown_DROPDOWN, final String Step_25_Resource_textbox_TEXTBOX, final String Step_25_PlannedBudgetAmt_textbox_TEXTBOX, final String Step_25_Description_textbox_TEXTBOX, final String Step_27_Billable_checkbox_CHECKBOX, final String Step_27_WorkType_dropdown_DROPDOWN, final String Step_27_ServiceType_dropdown_DROPDOWN, final String Step_23_AddDD_dropdown_DROPDOWN, final String Step_23_TaskName_textbox_TEXTBOX, final String Step_23_ServiceType_dropdown_DROPDOWN, final String Step_30_Billable_checkbox_CHECKBOX, final String Step_26_TaskNum_dropdown_DROPDOWN, final String Step_28_TaskNum_dropdown_DROPDOWN, final String Step_29_ServiceType_dropdown_DROPDOWN, final String Step_30_TaskNum_dropdown_DROPDOWN, final String Step_31_ServiceType_dropdown_DROPDOWN, final String Step_32_TaskNum_dropdown_DROPDOWN, final String Step_33_ServiceType_dropdown_DROPDOWN, final String Step_20_ServiceType_dropdown_DROPDOWN, final String Step_27_FileName_textbox_TEXTBOX, final String Step_33_Person_textbox_TEXTBOX, final String Step_33_StartDate_textbox_TEXTBOX, final String Step_33_ProjectRole_dropdown_DROPDOWN, final String Step_34_ProgressDate_textbox_TEXTBOX) throws Exception

	{

	VerifyMessage_Page verifymessage_page_init=PageFactory.initElements(driver, VerifyMessage_Page.class);

	LaunchURL_Page launchurl_page_init=PageFactory.initElements(driver, LaunchURL_Page.class);

	Msg__1__Page msg__1__page_init=PageFactory.initElements(driver, Msg__1__Page.class);

	SignInPage_Page signinpage_page_init=PageFactory.initElements(driver, SignInPage_Page.class);

	HomePage_Page homepage_page_init=PageFactory.initElements(driver, HomePage_Page.class);

	CostsTasks_Page coststasks_page_init=PageFactory.initElements(driver, CostsTasks_Page.class);

	ManageAccountingPeriods_Page manageaccountingperiods_page_init=PageFactory.initElements(driver, ManageAccountingPeriods_Page.class);

	Confirmation_Page confirmation_page_init=PageFactory.initElements(driver, Confirmation_Page.class);

	ImportCosts_Page importcosts_page_init=PageFactory.initElements(driver, ImportCosts_Page.class);

	CostsOverview_Page costsoverview_page_init=PageFactory.initElements(driver, CostsOverview_Page.class);

	ManageProjectCosts_Page manageprojectcosts_page_init=PageFactory.initElements(driver, ManageProjectCosts_Page.class);

	ExpenditureItem_Page expenditureitem_page_init=PageFactory.initElements(driver, ExpenditureItem_Page.class);

	TransferExpenditureItem_Page transferexpenditureitem_page_init=PageFactory.initElements(driver, TransferExpenditureItem_Page.class);

	CreateAccounting_Page createaccounting_page_init=PageFactory.initElements(driver, CreateAccounting_Page.class);

	ManageUnprocessedCosts_Page manageunprocessedcosts_page_init=PageFactory.initElements(driver, ManageUnprocessedCosts_Page.class);

	EditTransaction_Page edittransaction_page_init=PageFactory.initElements(driver, EditTransaction_Page.class);

	CaptureCosts_Page capturecosts_page_init=PageFactory.initElements(driver, CaptureCosts_Page.class);

	ManageProjectPlan_Page manageprojectplan_page_init=PageFactory.initElements(driver, ManageProjectPlan_Page.class);

	ManageProjectPlanTasks_Page manageprojectplantasks_page_init=PageFactory.initElements(driver, ManageProjectPlanTasks_Page.class);

	PFMMyProjects_Page pfmmyprojects_page_init=PageFactory.initElements(driver, PFMMyProjects_Page.class);

	PFMMyProjectsTasks_Page pfmmyprojectstasks_page_init=PageFactory.initElements(driver, PFMMyProjectsTasks_Page.class);

	CreateProjects_Page createprojects_page_init=PageFactory.initElements(driver, CreateProjects_Page.class);

	ProjectOverview_Page projectoverview_page_init=PageFactory.initElements(driver, ProjectOverview_Page.class);

	ProjectOverviewTasks_Page projectoverviewtasks_page_init=PageFactory.initElements(driver, ProjectOverviewTasks_Page.class);

	ManageFinProjectSettings_Page managefinprojectsettings_page_init=PageFactory.initElements(driver, ManageFinProjectSettings_Page.class);

	EditBasicInfo_Page editbasicinfo_page_init=PageFactory.initElements(driver, EditBasicInfo_Page.class);

	Attchments_Page attchments_page_init=PageFactory.initElements(driver, Attchments_Page.class);

	Open_Page open_page_init=PageFactory.initElements(driver, Open_Page.class);

	AddTeamMembers_Page addteammembers_page_init=PageFactory.initElements(driver, AddTeamMembers_Page.class);

	ChangeProjectStatus_Page changeprojectstatus_page_init=PageFactory.initElements(driver, ChangeProjectStatus_Page.class);

	EditProjectClassification_Page editprojectclassification_page_init=PageFactory.initElements(driver, EditProjectClassification_Page.class);

	ManageFinProjectPlan_Page managefinprojectplan_page_init=PageFactory.initElements(driver, ManageFinProjectPlan_Page.class);

	EditTaskDetails_Page edittaskdetails_page_init=PageFactory.initElements(driver, EditTaskDetails_Page.class);

	ManageResources_Page manageresources_page_init=PageFactory.initElements(driver, ManageResources_Page.class);

	AdditionalInformation_Page additionalinformation_page_init=PageFactory.initElements(driver, AdditionalInformation_Page.class);

	SetBaselineForProjectPlan_Page setbaselineforprojectplan_page_init=PageFactory.initElements(driver, SetBaselineForProjectPlan_Page.class);

	ManageBudgetVersions_Page managebudgetversions_page_init=PageFactory.initElements(driver, ManageBudgetVersions_Page.class);

	EditBudget_Page editbudget_page_init=PageFactory.initElements(driver, EditBudget_Page.class);

	OpenProject_Page openproject_page_init=PageFactory.initElements(driver, OpenProject_Page.class);

	PublishProgress_Page publishprogress_page_init=PageFactory.initElements(driver, PublishProgress_Page.class);

	CaptureProgress_Page captureprogress_page_init=PageFactory.initElements(driver, CaptureProgress_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__CaptureAndPublishProjectProgress_", "TC_Node_Activity__CaptureAndPublishProjectProgress_", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform LaunchURL Action");

	testReport.fillTableStep("Step 1", "Perform LaunchURL Action");

	launchurl_page_init.enter_URL_field(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify SignInPage screen");

	testReport.fillTableStep("Step 2", "verify SignInPage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_2");

	Reporter.log("Step - 3- Fill SigninPage form SignInPage screen");

	testReport.fillTableStep("Step 3", "Fill SigninPage form SignInPage screen");

	signinpage_page_init.set_UserId_textbox(Step_3_UserId_textbox_TEXTBOX);
	signinpage_page_init.set_Password_textbox(Step_3_Password_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_3");

	Reporter.log("Step - 4- click SignIn button SignInPage screen");

	testReport.fillTableStep("Step 4", "click SignIn button SignInPage screen");

	signinpage_page_init.click_SignIn_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_4");

	Reporter.log("Step - 5- verify HomePage screen");

	testReport.fillTableStep("Step 5", "verify HomePage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_5");

	Reporter.log("Step - 6- click Navigator hyperlink HomePage screen");

	testReport.fillTableStep("Step 6", "click Navigator hyperlink HomePage screen");
	Thread.sleep(5000);
	homepage_page_init.click_Navigator_hyperlink();
	Thread.sleep(5000);
	homepage_page_init.click_Show_More_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_6");

	Reporter.log("Step - 7- click ProjectFinancialManagement hyperlink HomePage screen");

	testReport.fillTableStep("Step 7", "click ProjectFinancialManagement hyperlink HomePage screen");
	Thread.sleep(5000);
	homepage_page_init.click_ProjectFinancialManagement_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_7");

	Reporter.log("Step - 8- verify PFMMyProjects screen");

	testReport.fillTableStep("Step 8", "verify PFMMyProjects screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_8");

	Reporter.log("Step - 9- click SearchExpand button PFMMyProjects screen");

	testReport.fillTableStep("Step 9", "click SearchExpand button PFMMyProjects screen");
	Thread.sleep(5000);
	pfmmyprojects_page_init.click_SearchExpand_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_9");

	Reporter.log("Step - 10- Fill Search form PFMMyProjects screen");

	testReport.fillTableStep("Step 10", "Fill Search form PFMMyProjects screen");
	Thread.sleep(5000);
	//pfmmyprojects_page_init.set_ProjectNumber_textbox(Step_10_ProjectNumber_textbox_TEXTBOX);
	//pfmmyprojects_page_init.set_ProjectNumber_textbox("48");
	pfmmyprojects_page_init.set_TeamMember_textbox(Step_10_TeamMember_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_10");

	Reporter.log("Step - 11- click Search button PFMMyProjects screen");

	testReport.fillTableStep("Step 11", "click Search button PFMMyProjects screen");
	Thread.sleep(5000);
	pfmmyprojects_page_init.click_Search_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_11");

	Reporter.log("Step - 12- click ProjectNameLink hyperlink PFMMyProjects screen");

	testReport.fillTableStep("Step 12", "click ProjectNameLink hyperlink PFMMyProjects screen");
	Thread.sleep(5000);
	//pfmmyprojects_page_init.click_ProjectNameLink_hyperlink();
	driver.findElement(By.xpath("//*[contains(@id,'_ATp:table1:0:commandLink1')]")).click();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_12");

	Reporter.log("Step - 13- verify ProjectOverview screen");

	testReport.fillTableStep("Step 13", "verify ProjectOverview screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_13");

	Reporter.log("Step - 14- click Tasks button ProjectOverview screen");

	testReport.fillTableStep("Step 14", "click Tasks button ProjectOverview screen");
	Thread.sleep(5000);
	//projectoverview_page_init.click_Tasks_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_14");
	driver.findElement(By.xpath("//*[contains(@id,'sdi2::icon')]")).click(); //Tasks
	Reporter.log("Step - 15- verify ProjectOverviewTasks popup");

	testReport.fillTableStep("Step 15", "verify ProjectOverviewTasks popup");

	//projectoverviewtasks_page_init.verify_Text("[Don't Care]");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_15");

	Reporter.log("Step - 16- click ManageFinProjectPlan hyperlink ProjectOverviewTasks popup");

	testReport.fillTableStep("Step 16", "click ManageFinProjectPlan hyperlink ProjectOverviewTasks popup");
	Thread.sleep(5000);
	projectoverviewtasks_page_init.click_ManageFinProjectPlan_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_16");

	Reporter.log("Step - 17- verify ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 17", "verify ManageFinProjectPlan screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_17");

	Reporter.log("Step - 18- Select SetBaseline clickchoice ManageFinProjectPlan screen Task menubar Actions menu");

	testReport.fillTableStep("Step 18", "Select SetBaseline clickchoice ManageFinProjectPlan screen Task menubar Actions menu");
	Thread.sleep(5000);
	driver.findElement(By.linkText("Actions")).click();
	Thread.sleep(5000);
	managefinprojectplan_page_init.click_SetBaseline_menuitem();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_18");

	Reporter.log("Step - 19- Select SetBaseLineForAllTasks clickchoice ManageFinProjectPlan screen Task menubar Actions menu");

	testReport.fillTableStep("Step 19", "Select SetBaseLineForAllTasks clickchoice ManageFinProjectPlan screen Task menubar Actions menu");
	Thread.sleep(5000);
	managefinprojectplan_page_init.click_SetBaseLineForAllTasks_menuitem();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_19");

	Reporter.log("Step - 20- verify SetBaselineForProjectPlan popup");

	testReport.fillTableStep("Step 20", "verify SetBaselineForProjectPlan popup");

	//setbaselineforprojectplan_page_init.verify_Text("[Don't Care]");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_20");

	Reporter.log("Step - 21- Fill SetBaselineForProjectPlan form SetBaselineForProjectPlan popup");

	testReport.fillTableStep("Step 21", "Fill SetBaselineForProjectPlan form SetBaselineForProjectPlan popup");
	Thread.sleep(5000);
	setbaselineforprojectplan_page_init.select_AutomaticallyGenerateBudget_checkbox(Step_21_AutomaticallyGenerateBudget_checkbox_CHECKBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_21");

	Reporter.log("Step - 22- click OK button SetBaselineForProjectPlan popup");

	testReport.fillTableStep("Step 22", "click OK button SetBaselineForProjectPlan popup");
	Thread.sleep(5000);
	setbaselineforprojectplan_page_init.click_OK_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_22");

	Reporter.log("Step - 23- click WOK button SetBaselineForProjectPlan popup");

	testReport.fillTableStep("Step 23", "click WOK button SetBaselineForProjectPlan popup");
//	Thread.sleep(5000);
//	setbaselineforprojectplan_page_init.click_WOK_button();
//	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_23");

	Reporter.log("Step - 24- click COK button SetBaselineForProjectPlan popup");

	testReport.fillTableStep("Step 24", "click COK button SetBaselineForProjectPlan popup");
	Thread.sleep(5000);
	setbaselineforprojectplan_page_init.click_COK_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_24");

	Reporter.log("Step - 25- verify ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 25", "verify ManageFinProjectPlan screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_25");

	Reporter.log("Step - 26- click Progress hyperlink ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 26", "click Progress hyperlink ManageFinProjectPlan screen");
	Thread.sleep(5000);
	managefinprojectplan_page_init.click_Progress_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_26");

	Reporter.log("Step - 27- click PublishProgress button ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 27", "click PublishProgress button ManageFinProjectPlan screen");
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//div[contains(@id,'ProgPnl:commandButton3')]")).click();
	Thread.sleep(5000);
	//managefinprojectplan_page_init.click_PublishProgress_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_27");

	Reporter.log("Step - 28- verify PublishProgress popup");

	testReport.fillTableStep("Step 28", "verify PublishProgress popup");

	//publishprogress_page_init.verify_Text("[Don't Care]");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_28");

	Reporter.log("Step - 29- click OK button PublishProgress popup");

	testReport.fillTableStep("Step 29", "click OK button PublishProgress popup");
	Thread.sleep(5000);
	//publishprogress_page_init.click_OK_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_29");

	Reporter.log("Step - 30- click COK button PublishProgress popup");

	testReport.fillTableStep("Step 30", "click COK button PublishProgress popup");
	Thread.sleep(5000);
	//publishprogress_page_init.click_COK_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_30");

	Reporter.log("Step - 31- verify ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 31", "verify ManageFinProjectPlan screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_31");

	Reporter.log("Step - 32- click CaptureProgress button ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 32", "click CaptureProgress button ManageFinProjectPlan screen");
	Thread.sleep(5000);
	//managefinprojectplan_page_init.click_CaptureProgress_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_32");

	Reporter.log("Step - 33- verify CaptureProgress popup");

	testReport.fillTableStep("Step 33", "verify CaptureProgress popup");

	//captureprogress_page_init.verify_Text("[Don't Care]");
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_33");

	Reporter.log("Step - 34- Fill CaptureProgress form CaptureProgress popup");

	testReport.fillTableStep("Step 34", "Fill CaptureProgress form CaptureProgress popup");
	Thread.sleep(5000);
	//captureprogress_page_init.set_ProgressDate_textbox(Step_34_ProgressDate_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_34");

	Reporter.log("Step - 35- click SaveAndClose button CaptureProgress popup");

	testReport.fillTableStep("Step 35", "click SaveAndClose button CaptureProgress popup");
	Thread.sleep(5000);
	//captureprogress_page_init.click_SaveAndClose_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_35");

	Reporter.log("Step - 36- verify ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 36", "verify ManageFinProjectPlan screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_36");

	Reporter.log("Step - 37- click SaveAndClose button ManageFinProjectPlan screen");

	testReport.fillTableStep("Step 37", "click SaveAndClose button ManageFinProjectPlan screen");
	Thread.sleep(5000);
	//managefinprojectplan_page_init.click_SaveAndClose_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__CaptureAndPublishProjectProgress_","Step_37");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_25");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		//driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__CaptureAndPublishProjectProgress_");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
