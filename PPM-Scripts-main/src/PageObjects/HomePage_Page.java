package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class HomePage_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "_hyperlink")
	public static WebElement _hyperlink;

public void verify__hyperlink_Status(String data){
		//Verifies the Status of the _hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click__hyperlink(){
		_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//span[contains(text(),'Project Financial Management')]")
	public static WebElement ProjectFinancialManagement_hyperlink;

public void verify_ProjectFinancialManagement_hyperlink_Status(String data){
		//Verifies the Status of the ProjectFinancialManagement_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectFinancialManagement_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectFinancialManagement_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectFinancialManagement_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectFinancialManagement_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ProjectFinancialManagement_hyperlink(){
		ProjectFinancialManagement_hyperlink.click();
}

//@FindBy(how= How.LINK_TEXT, using = "Costs")
@FindBy(how= How.XPATH, using = "//*[contains(@id, 'nv_itemNode_projects_costs')]")
	public static WebElement Costs_hyperlink;

public void verify_Costs_hyperlink_Status(String data){
		//Verifies the Status of the Costs_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Costs_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Costs_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Costs_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Costs_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Costs_hyperlink(){
		Costs_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//span[contains(text(),'Contracts')]")
	public static WebElement Contracts_hyperlink;

public void verify_Contracts_hyperlink_Status(String data){
		//Verifies the Status of the Contracts_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Contracts_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Contracts_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Contracts_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Contracts_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Contracts_hyperlink(){
		Contracts_hyperlink.click();
}

@FindBy(how= How.ID, using = "Invoices_hyperlink")
	public static WebElement Invoices_hyperlink;

public void verify_Invoices_hyperlink_Status(String data){
		//Verifies the Status of the Invoices_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Invoices_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Invoices_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Invoices_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Invoices_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Invoices_hyperlink(){
		Invoices_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[@id='pt1:_UISmmLink']")
	public static WebElement Navigator_hyperlink;

public void verify_Navigator_hyperlink_Status(String data){
		//Verifies the Status of the Navigator_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Navigator_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Navigator_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Navigator_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Navigator_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Navigator_hyperlink(){
		Navigator_hyperlink.click();
}
@FindBy(how= How.XPATH, using = "//a[@id='pt1:_UISnvr:0:nvcl1']")
public static WebElement Show_More_hyperlink;

public void verify_Show_More_hyperlink_Status(String data){
	//Verifies the Status of the Show_More_hyperlink
	if(!data.contentEquals("Dont care")){
		switch(data){
		case "ENABLED":
			Assert.assertTrue(Show_More_hyperlink.isEnabled());
			break;
		case "VISIBLE":
			Assert.assertTrue(Show_More_hyperlink.isDisplayed());
			break;
		case "HIDDEN":
			Assert.assertFalse(!Show_More_hyperlink.isDisplayed());
			break;
		case "DISABLED":
			Assert.assertFalse(!Show_More_hyperlink.isEnabled());
			break;
		default:
			break;
		}
	}
}
public void click_Show_More_hyperlink(){
	
	Show_More_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'nv_itemNode_projects_pjt_project_management')]")
	public static WebElement ProjectManagement_hyperlink;

public void verify_ProjectManagement_hyperlink_Status(String data){
		//Verifies the Status of the ProjectManagement_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectManagement_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectManagement_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectManagement_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectManagement_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ProjectManagement_hyperlink(){
		ProjectManagement_hyperlink.click();
}
@FindBy(how= How.XPATH, using = "//a[@id='pt1:_UISatr:0:cil1']")
	public static WebElement Notifications_button;

public void verify_Notifications_button_Status(String data){
		//Verifies the Status of the Notifications_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Notifications_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Notifications_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Notifications_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Notifications_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Notifications_button(){
		Notifications_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}