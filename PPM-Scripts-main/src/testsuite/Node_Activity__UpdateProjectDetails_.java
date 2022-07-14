package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	Node_Activity__UpdateProjectDetails_
 */
public class Node_Activity__UpdateProjectDetails_ extends PageObjectBase
{

	public Node_Activity__UpdateProjectDetails_()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_3_UserId_textbox_TEXTBOX, final String Step_3_Password_textbox_TEXTBOX, final String Step_13_SourceTemplate_textbox_TEXTBOX, final String Step_13_ProjectName_textbox_TEXTBOX, final String Step_13_Ledger_textbox_TEXTBOX, final String Step_13_TransferToGeneralLedger_dropdown_DROPDOWN, final String Step_13_PostInGeneralLedger_dropdown_DROPDOWN, final String Step_10_ProjectNumber_textbox_TEXTBOX, final String Step_10_TeamMember_textbox_TEXTBOX, final String Step_13_Actions_dropdown_DROPDOWN, final String Step_15_Save_dropdown_DROPDOWN, final String Step_15_TransactionCurrency_textbox_TEXTBOX, final String Step_15_RawCost_textbox_TEXTBOX, final String Step_15_BurdenedCost_textbox_TEXTBOX, final String Step_13_ProjectNumber_textbox_TEXTBOX, final String Step_13_ExpenditureOrg_textbox_TEXTBOX, final String Step_17_Actions_dropdown_DROPDOWN, final String Step_17_Costing_dropdown_DROPDOWN, final String Step_17_Billing_dropdown_DROPDOWN, final String Step_13_FileName_textbox_TEXTBOX, final String Step_13_Businessunit_textbox_TEXTBOX, final String Step_13_TransactionSource_dropdown_DROPDOWN, final String Step_19_ProjectNum_textbox_TEXTBOX, final String Step_19_TaskNum_textbox_TEXTBOX, final String Step_20_ClassCode_textbox_TEXTBOX, final String Step_20_To_dropdown_DROPDOWN, final String Step_21_AutomaticallyGenerateBudget_checkbox_CHECKBOX, final String Step_21_Person_textbox_TEXTBOX, final String Step_21_StartDate_textbox_TEXTBOX, final String Step_21_ProjectRole_dropdown_DROPDOWN, final String Step_25_Resource_textbox_TEXTBOX, final String Step_25_PlannedBudgetAmt_textbox_TEXTBOX, final String Step_25_Description_textbox_TEXTBOX, final String Step_27_Billable_checkbox_CHECKBOX, final String Step_27_WorkType_dropdown_DROPDOWN, final String Step_27_ServiceType_dropdown_DROPDOWN, final String Step_23_AddDD_dropdown_DROPDOWN, final String Step_23_TaskName_textbox_TEXTBOX, final String Step_23_ServiceType_dropdown_DROPDOWN, final String Step_30_Billable_checkbox_CHECKBOX, final String Step_26_TaskNum_dropdown_DROPDOWN, final String Step_28_TaskNum_dropdown_DROPDOWN, final String Step_29_ServiceType_dropdown_DROPDOWN, final String Step_30_TaskNum_dropdown_DROPDOWN, final String Step_31_ServiceType_dropdown_DROPDOWN, final String Step_32_TaskNum_dropdown_DROPDOWN, final String Step_33_ServiceType_dropdown_DROPDOWN, final String Step_20_ServiceType_dropdown_DROPDOWN, final String Step_27_FileName_textbox_TEXTBOX, final String Step_33_Person_textbox_TEXTBOX, final String Step_33_StartDate_textbox_TEXTBOX, final String Step_33_ProjectRole_dropdown_DROPDOWN) throws Exception

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

		testReport.generateGeneralInfo(overallTestData, "Node_Activity__UpdateProjectDetails_", "TC_Node_Activity__UpdateProjectDetails_", "",ne);

		testReport.createStepHeader();

		//External Circumstances


		Reporter.log("Step - 1- Perform LaunchURL Action");

		testReport.fillTableStep("Step 1", "Perform LaunchURL Action");

		launchurl_page_init.enter_URL_field(Step_1_URL_FIELD);


		Reporter.log("Step - 2- verify SignInPage screen");

		testReport.fillTableStep("Step 2", "verify SignInPage screen");

		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_2");

		Reporter.log("Step - 3- Fill SigninPage form SignInPage screen");

		testReport.fillTableStep("Step 3", "Fill SigninPage form SignInPage screen");

		signinpage_page_init.set_UserId_textbox(Step_3_UserId_textbox_TEXTBOX);
		signinpage_page_init.set_Password_textbox(Step_3_Password_textbox_TEXTBOX);
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_3");

		Reporter.log("Step - 4- click SignIn button SignInPage screen");

		testReport.fillTableStep("Step 4", "click SignIn button SignInPage screen");

		signinpage_page_init.click_SignIn_button();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_4");

		Reporter.log("Step - 5- verify HomePage screen");

		testReport.fillTableStep("Step 5", "verify HomePage screen");

		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_5");

		Reporter.log("Step - 6- click Navigator hyperlink HomePage screen");

		testReport.fillTableStep("Step 6", "click Navigator hyperlink HomePage screen");

		homepage_page_init.click_Navigator_hyperlink();
		Thread.sleep(5000);
		homepage_page_init.click_Show_More_hyperlink();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_6");

		Reporter.log("Step - 7- click ProjectFinancialManagement hyperlink HomePage screen");

		testReport.fillTableStep("Step 7", "click ProjectFinancialManagement hyperlink HomePage screen");
		Thread.sleep(5000);
		homepage_page_init.click_ProjectFinancialManagement_hyperlink();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_7");

		Reporter.log("Step - 8- verify PFMMyProjects screen");

		testReport.fillTableStep("Step 8", "verify PFMMyProjects screen");

		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_8");

		Reporter.log("Step - 9- click SearchExpand button PFMMyProjects screen");

		testReport.fillTableStep("Step 9", "click SearchExpand button PFMMyProjects screen");
		Thread.sleep(5000);
		pfmmyprojects_page_init.click_SearchExpand_button();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_9");

		Reporter.log("Step - 10- Fill Search form PFMMyProjects screen");

		testReport.fillTableStep("Step 10", "Fill Search form PFMMyProjects screen");
		Thread.sleep(5000);
		//pfmmyprojects_page_init.set_ProjectNumber_textbox(Step_10_ProjectNumber_textbox_TEXTBOX);
		pfmmyprojects_page_init.set_TeamMember_textbox(Step_10_TeamMember_textbox_TEXTBOX);
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_10");

		Reporter.log("Step - 11- click Search button PFMMyProjects screen");

		testReport.fillTableStep("Step 11", "click Search button PFMMyProjects screen");

		pfmmyprojects_page_init.click_Search_button();
		Thread.sleep(10000);
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_11");

		Reporter.log("Step - 12- click ProjectNameLink hyperlink PFMMyProjects screen");

		testReport.fillTableStep("Step 12", "click ProjectNameLink hyperlink PFMMyProjects screen");

		pfmmyprojects_page_init.click_ProjectNameLink_hyperlink();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_12");

		Reporter.log("Step - 13- verify ProjectOverview screen");

		testReport.fillTableStep("Step 13", "verify ProjectOverview screen");

		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_13");

		Reporter.log("Step - 14- click Tasks button ProjectOverview screen");

		testReport.fillTableStep("Step 14", "click Tasks button ProjectOverview screen");
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector(".x1mm")).click();
		//projectoverview_page_init.click_Tasks_button();
		driver.findElement(By.xpath("//*[contains(@id,'sdi2::icon')]")).click(); //Tasks
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_14");

		Reporter.log("Step - 15- verify ProjectOverviewTasks popup");

		testReport.fillTableStep("Step 15", "verify ProjectOverviewTasks popup");

		//projectoverviewtasks_page_init.verify_Text("[Don't Care]");
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_15");

		Reporter.log("Step - 16- click ManageFinProjectSettings hyperlink ProjectOverviewTasks popup");

		testReport.fillTableStep("Step 16", "click ManageFinProjectSettings hyperlink ProjectOverviewTasks popup");
		Thread.sleep(5000);
		projectoverviewtasks_page_init.click_ManageFinProjectSettings_hyperlink();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_16");

		Reporter.log("Step - 17- verify ManageFinProjectSettings screen");

		testReport.fillTableStep("Step 17", "verify ManageFinProjectSettings screen");

		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_17");

		Reporter.log("Step - 18- click BasicInfoEdit button ManageFinProjectSettings screen");

		testReport.fillTableStep("Step 18", "click BasicInfoEdit button ManageFinProjectSettings screen");
		Thread.sleep(5000);
		managefinprojectsettings_page_init.click_BasicInfoEdit_button();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_18");

		Reporter.log("Step - 19- verify EditBasicInfo popup");

		testReport.fillTableStep("Step 19", "verify EditBasicInfo popup");

		//editbasicinfo_page_init.verify_Text("[Don't Care]");
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_19");

		Reporter.log("Step - 20- Fill EditBasicInfo form EditBasicInfo popup");

		testReport.fillTableStep("Step 20", "Fill EditBasicInfo form EditBasicInfo popup");
		Thread.sleep(5000);
		editbasicinfo_page_init.select_ServiceType_dropdown(Step_20_ServiceType_dropdown_DROPDOWN);
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_20");

		Reporter.log("Step - 21- click SaveAndClose button EditBasicInfo popup");

		testReport.fillTableStep("Step 21", "click SaveAndClose button EditBasicInfo popup");

		editbasicinfo_page_init.click_SaveAndClose_button();
		Thread.sleep(10000);
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_21");

		Reporter.log("Step - 22- click AttachmentEdit button ManageFinProjectSettings screen");

		testReport.fillTableStep("Step 22", "click AttachmentEdit button ManageFinProjectSettings screen");
		Thread.sleep(5000);
		managefinprojectsettings_page_init.click_AttachmentEdit_button();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_22");

		Reporter.log("Step - 23- verify Attchments popup");

		testReport.fillTableStep("Step 23", "verify Attchments popup");

		//attchments_page_init.verify_Text("[Don't Care]");
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_23");

		Reporter.log("Step - 24- click Add button Attchments popup");

		testReport.fillTableStep("Step 24", "click Add button Attchments popup");
		Thread.sleep(5000);
		attchments_page_init.click_Add_button();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_24");

		Reporter.log("Step - 25- click ChooseFile button Attchments popup");

		testReport.fillTableStep("Step 25", "click ChooseFile button Attchments popup");
		Thread.sleep(5000);
		//attchments_page_init.click_ChooseFile_button();
		WebElement ele = driver.findElement(By.xpath("//*[contains(@id,'attachmentTable:0:desktopFile::content')]"));
		ele.sendKeys("D:\\Test.pdf");
		System.out.println("File is Uploaded Successfully");
		/*
		 * getScreenshot(driver,Configurations.screenshotLocation ,
		 * "Node_Activity__UpdateProjectDetails_","Step_25");
		 * 
		 * Reporter.log("Step - 26- verify Open popup");
		 * 
		 * testReport.fillTableStep("Step 26", "verify Open popup");
		 * 
		 * //open_page_init.verify_Text("[Don't Care]");
		 * getScreenshot(driver,Configurations.screenshotLocation ,
		 * "Node_Activity__UpdateProjectDetails_","Step_26");
		 * 
		 * Reporter.log("Step - 27- Fill OpenFile form Open popup");
		 * 
		 * testReport.fillTableStep("Step 27", "Fill OpenFile form Open popup");
		 * Thread.sleep(5000);
		 * open_page_init.set_FileName_textbox(Step_27_FileName_textbox_TEXTBOX);
		 * getScreenshot(driver,Configurations.screenshotLocation ,
		 * "Node_Activity__UpdateProjectDetails_","Step_27");
		 * 
		 * Reporter.log("Step - 28- click Open button Open popup");
		 * 
		 * testReport.fillTableStep("Step 28", "click Open button Open popup");
		 * Thread.sleep(5000); open_page_init.click_Open_button();
		 * getScreenshot(driver,Configurations.screenshotLocation ,
		 * "Node_Activity__UpdateProjectDetails_","Step_28");
		 */
		Reporter.log("Step - 29- click SaveAndClose button Attchments popup");

		testReport.fillTableStep("Step 29", "click SaveAndClose button Attchments popup");
		Thread.sleep(5000);
		attchments_page_init.click_SaveAndClose_button();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_29");

		Reporter.log("Step - 30- click Parties hyperlink ManageFinProjectSettings screen");

		testReport.fillTableStep("Step 30", "click Parties hyperlink ManageFinProjectSettings screen");
		Thread.sleep(10000);
		managefinprojectsettings_page_init.click_Parties_hyperlink();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_30");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@id,'P40:1:AT1:_ATp:edit::icon')]")).click();
		Reporter.log("Step - 31- click AddTeamMember button ManageFinProjectSettings screen");
		Thread.sleep(5000);
		testReport.fillTableStep("Step 31", "click AddTeamMember button ManageFinProjectSettings screen");
		Thread.sleep(5000);
		//managefinprojectsettings_page_init.click_AddTeamMember_button();
		Thread.sleep(5000);
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_31");

		Reporter.log("Step - 32- verify AddTeamMembers popup");

		testReport.fillTableStep("Step 32", "verify AddTeamMembers popup");

		//addteammembers_page_init.verify_Text("[Don't Care]");
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_32");


		Reporter.log("Step - 33- Fill AddTeamMembers form AddTeamMembers popup");

		testReport.fillTableStep("Step 33","Fill AddTeamMembers form AddTeamMembers popup"); 
		Thread.sleep(5000);
		//addteammembers_page_init.set_Person_textbox(Step_33_Person_textbox_TEXTBOX);
		//Thread.sleep(5000); clickElement(By.xpath("//*[contains(@id,'projectRoleNameId_csl:sis1:is1::btn')]")); //Click drop down 
		Thread.sleep(5000); 
		//setElementText(By.xpath("//*[contains(@id,'projectRoleNameId_csl:sis1:is1::btn')]"), Step_33_ProjectRole_dropdown_DROPDOWN);
		//addteammembers_page_init.set_StartDate_textbox(Step_33_StartDate_textbox_TEXTBOX); Thread.sleep(5000);
		//addteammembers_page_init.select_ProjectRole_dropdown(Step_33_ProjectRole_dropdown_DROPDOWN);

		Thread.sleep(5000);

		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_33");

		Reporter.log("Step - 34- click SaveAndClose button AddTeamMembers popup");

		testReport.fillTableStep("Step 34", "click SaveAndClose button AddTeamMembers popup");

		addteammembers_page_init.click_SaveAndClose_button();
		Thread.sleep(10000);
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_34");

		Reporter.log("Step - 35- click Done button ManageFinProjectSettings screen");

		testReport.fillTableStep("Step 35", "click Done button ManageFinProjectSettings screen");
		Thread.sleep(5000);
		managefinprojectsettings_page_init.click_Done_button();
		getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateProjectDetails_","Step_35");
	}

	private void SetElement(By xpath) {
		// TODO Auto-generated method stub

	}
	private void clickElement(By xpath) {
		// TODO Auto-generated method stub

	}
	private void setElementText(By xpath, String step_33_ProjectRole_dropdown_DROPDOWN) {
		// TODO Auto-generated method stub

	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
		return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_24");
	}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		//driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__UpdateProjectDetails_");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
