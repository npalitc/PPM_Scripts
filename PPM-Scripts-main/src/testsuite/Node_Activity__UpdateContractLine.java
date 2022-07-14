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
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Node_Activity__UpdateContractLine
*/
public class Node_Activity__UpdateContractLine extends PageObjectBase
{

	public Node_Activity__UpdateContractLine()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD, final String Step_3_UserId_textbox_TEXTBOX, final String Step_3_Password_textbox_TEXTBOX, final String Step_9_Number_textbox_TEXTBOX, final String Step_17_AmendmentEffectiveDate_textbox_TEXTBOX, final String Step_20_NoteForApprover_textbox_TEXTBOX, final String Step_12_Number_textbox_TEXTBOX, final String Step_19_AmendmentEffectiveDate_textbox_TEXTBOX, final String Step_24_PRPerson_textbox_TEXTBOX, final String Step_24_PRCurrency_textbox_TEXTBOX, final String Step_24_PRRate_textbox_TEXTBOX, final String Step_24_PRStartDate_textbox_TEXTBOX, final String Step_24_PRContractLineNumber_textbox_TEXTBOX, final String Step_24_JASearchName_textbox_TEXTBOX, final String Step_24_JAContractLineNumber_textbox_TEXTBOX, final String Step_20_LineAmount_textbox_TEXTBOX, final String Step_20_AddInfoContextValue_dropdown_DROPDOWN, final String Step_22_BillPlan_textbox_TEXTBOX, final String Step_22_RevenuePlan_textbox_TEXTBOX, final String Step_24_FundedAmount_textbox_TEXTBOX) throws Exception

	{
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

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

	testReport.generateGeneralInfo(overallTestData, "Node_Activity__UpdateContractLine", "TC_Node_Activity__Activity_Node_1___2_", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform LaunchURL Action");

	testReport.fillTableStep("Step 1", "Perform LaunchURL Action");

	launchurl_page_init.enter_URL_field(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify SignInPage screen");

	testReport.fillTableStep("Step 2", "verify SignInPage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_2");

	Reporter.log("Step - 3- Fill SigninPage form SignInPage screen");

	testReport.fillTableStep("Step 3", "Fill SigninPage form SignInPage screen");

	signinpage_page_init.set_UserId_textbox(Step_3_UserId_textbox_TEXTBOX);
	signinpage_page_init.set_Password_textbox(Step_3_Password_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_3");

	Reporter.log("Step - 4- click SignIn button SignInPage screen");

	testReport.fillTableStep("Step 4", "click SignIn button SignInPage screen");

	signinpage_page_init.click_SignIn_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_4");

	Reporter.log("Step - 5- verify HomePage screen");

	testReport.fillTableStep("Step 5", "verify HomePage screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_5");

	Reporter.log("Step - 6- click Navigator hyperlink HomePage screen");

	testReport.fillTableStep("Step 6", "click Navigator hyperlink HomePage screen");
	Thread.sleep(5000);
	homepage_page_init.click_Navigator_hyperlink();
	Thread.sleep(5000);
	homepage_page_init.click_Show_More_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_6");

	Reporter.log("Step - 7- click Contracts hyperlink HomePage screen");

	testReport.fillTableStep("Step 7", "click Contracts hyperlink HomePage screen");
	Thread.sleep(5000);
	homepage_page_init.click_Contracts_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_7");

	Reporter.log("Step - 8- verify Contracts screen");

	testReport.fillTableStep("Step 8", "verify Contracts screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_8");

	Reporter.log("Step - 9- click TasksContract button Contracts screen");

	testReport.fillTableStep("Step 9", "click TasksContract button Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.click_TasksContract_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_9");

	Reporter.log("Step - 10- click  ManageContracts hyperlink TasksContracts popup");

	testReport.fillTableStep("Step 10", "click  ManageContracts hyperlink TasksContracts popup");
	Thread.sleep(5000);
	taskscontracts_page_init.click_ManageContracts_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_10");

	Reporter.log("Step - 11- verify Contracts screen");

	testReport.fillTableStep("Step 11", "verify Contracts screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_11");

	Reporter.log("Step - 12- Fill AdvancedSearch form Contracts screen");

	testReport.fillTableStep("Step 12", "Fill AdvancedSearch form Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.set_Number_textbox(Step_12_Number_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_12");

	Reporter.log("Step - 13- click Search button Contracts screen");

	testReport.fillTableStep("Step 13", "click Search button Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.click_Search_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_13");

	Reporter.log("Step - 14- click SelectRowSearchResults button Contracts screen");

	testReport.fillTableStep("Step 14", "click SelectRowSearchResults button Contracts screen");
	//Thread.sleep(5000);
	//contracts_page_init.click_SelectRowSearchResults_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_14");

	Reporter.log("Step - 15- click SearchResultsNumberLink hyperlink Contracts screen");

	testReport.fillTableStep("Step 15", "click SearchResultsNumberLink hyperlink Contracts screen");
	Thread.sleep(5000);
	contracts_page_init.click_SearchResultsNumberLink_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_15");

	Reporter.log("Step - 16- verify EditContract xxxSelected screen");

	testReport.fillTableStep("Step 16", "verify EditContract xxxSelected screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_16");

	Reporter.log("Step - 17- click Lines hyperlink EditContract xxxSelected screen");

	testReport.fillTableStep("Step 17", "click Lines hyperlink EditContract xxxSelected screen");
	Thread.sleep(5000);
	editcontract_xxxselected_page_init.click_Lines_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_17");

	Reporter.log("Step - 18- verify EditContractsLines screen");

	testReport.fillTableStep("Step 18", "verify EditContractsLines screen");

	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_18");

	Reporter.log("Step - 19- click editcontractslinesdetailsOverview hyperlink EditContractsLines screen");

	testReport.fillTableStep("Step 19", "click editcontractslinesdetailsOverview hyperlink EditContractsLines screen");
	Thread.sleep(5000);
	editcontractslines_page_init.click_editcontractslinesdetailsOverview_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_19");

	Reporter.log("Step - 20- Fill Overview form editcontractslinesDetails screen");

	testReport.fillTableStep("Step 20", "Fill Overview form editcontractslinesDetails screen");
	Thread.sleep(5000);
	//editcontractslinesdetails_page_init.set_LineAmount_textbox(Step_20_LineAmount_textbox_TEXTBOX);
	//editcontractslinesdetails_page_init.select_AddInfoContextValue_dropdown(Step_20_AddInfoContextValue_dropdown_DROPDOWN);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_20");

	Reporter.log("Step - 21- click editcontractslinesdetailsBilling hyperlink EditContractsLines screen");

	testReport.fillTableStep("Step 21", "click editcontractslinesdetailsBilling hyperlink EditContractsLines screen");
	Thread.sleep(5000);
	editcontractslines_page_init.click_editcontractslinesdetailsBilling_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_21");

	Reporter.log("Step - 22- Fill Billing form editcontractslinesDetails screen");

	testReport.fillTableStep("Step 22", "Fill Billing form editcontractslinesDetails screen");
	Thread.sleep(5000);
	//editcontractslinesdetails_page_init.set_BillPlan_textbox(Step_22_BillPlan_textbox_TEXTBOX);
	//editcontractslinesdetails_page_init.set_RevenuePlan_textbox(Step_22_RevenuePlan_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_22");

	Reporter.log("Step - 23- click editcontractslinesdetailsAssociatedProjects hyperlink EditContractsLines screen");

	testReport.fillTableStep("Step 23", "click editcontractslinesdetailsAssociatedProjects hyperlink EditContractsLines screen");
	Thread.sleep(5000);
	editcontractslines_page_init.click_editcontractslinesdetailsAssociatedProjects_hyperlink();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_23");

	Reporter.log("Step - 24- Fill AssociatedProjects form editcontractslinesDetails screen");

	testReport.fillTableStep("Step 24", "Fill AssociatedProjects form editcontractslinesDetails screen");
	Thread.sleep(5000);
	//editcontractslinesdetails_page_init.set_FundedAmount_textbox(Step_24_FundedAmount_textbox_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_24");

	Reporter.log("Step - 25- click Save button EditContracts EditBillPlan screen");

	testReport.fillTableStep("Step 25", "click Save button EditContracts EditBillPlan screen");
	Thread.sleep(5000);
	editcontracts_editbillplan_page_init.click_Save_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_25");

	Reporter.log("Step - 26- click ActionsDrpDwn button EditContract xxxSelected screen");

	testReport.fillTableStep("Step 26", "click ActionsDrpDwn button EditContract xxxSelected screen");
	Thread.sleep(5000);
	editcontract_xxxselected_page_init.click_ActionsDrpDwn_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_26");

	Reporter.log("Step - 27- click Validate button EditContract xxxSelected screen");

	testReport.fillTableStep("Step 27", "click Validate button EditContract xxxSelected screen");
	Thread.sleep(5000);
	editcontract_xxxselected_page_init.click_Validate_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_27");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:1:AP1:SPb']")).click();
	Reporter.log("Step - 28- click Submit button EditContract xxxSelected screen");

	testReport.fillTableStep("Step 28", "click Submit button EditContract xxxSelected screen");
	Thread.sleep(5000);
	//editcontract_xxxselected_page_init.click_Submit_button();
	getScreenshot(driver,Configurations.screenshotLocation , "Node_Activity__UpdateContractLine","Step_28");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_13");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		//driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Node_Activity__UpdateContractLine");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
