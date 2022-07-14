package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ManageProjectPlanTasks_Page extends PageObjectBase{
@FindBy(how= How.LINK_TEXT, using = "My Projects")
	public static WebElement MyProjects_hyperlink;

public void verify_MyProjects_hyperlink_Status(String data){
		//Verifies the Status of the MyProjects_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(MyProjects_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(MyProjects_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!MyProjects_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!MyProjects_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_MyProjects_hyperlink(){
		MyProjects_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'cl2')]")
	public static WebElement OpenProject_hyperlink;

public void verify_OpenProject_hyperlink_Status(String data){
		//Verifies the Status of the OpenProject_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OpenProject_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OpenProject_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OpenProject_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OpenProject_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OpenProject_hyperlink(){
		OpenProject_hyperlink.click();
}

@FindBy(how= How.LINK_TEXT, using = "Manage Project Costs")
	public static WebElement ManageProjectCosts_hyperlink;

public void verify_ManageProjectCosts_hyperlink_Status(String data){
		//Verifies the Status of the ManageProjectCosts_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageProjectCosts_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageProjectCosts_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageProjectCosts_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageProjectCosts_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageProjectCosts_hyperlink(){
		ManageProjectCosts_hyperlink.click();
}

@FindBy(how= How.LINK_TEXT, using = "Manage Project Invoices")
	public static WebElement ManageProjectInvoices_hyperlink;

public void verify_ManageProjectInvoices_hyperlink_Status(String data){
		//Verifies the Status of the ManageProjectInvoices_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageProjectInvoices_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageProjectInvoices_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageProjectInvoices_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageProjectInvoices_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageProjectInvoices_hyperlink(){
		ManageProjectInvoices_hyperlink.click();
}

@FindBy(how= How.LINK_TEXT, using = "Analyze KPI Categories")
	public static WebElement AnalyzeKPICategories_hyperlink;

public void verify_AnalyzeKPICategories_hyperlink_Status(String data){
		//Verifies the Status of the AnalyzeKPICategories_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AnalyzeKPICategories_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AnalyzeKPICategories_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AnalyzeKPICategories_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AnalyzeKPICategories_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AnalyzeKPICategories_hyperlink(){
		AnalyzeKPICategories_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}