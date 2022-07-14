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
public class CostsTasks_Page extends PageObjectBase{
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'RAtl23')]")
	public static WebElement ManageAccountingPeriods_hyperlink;

public void verify_ManageAccountingPeriods_hyperlink_Status(String data){
		//Verifies the Status of the ManageAccountingPeriods_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageAccountingPeriods_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageAccountingPeriods_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageAccountingPeriods_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageAccountingPeriods_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageAccountingPeriods_hyperlink(){
		ManageAccountingPeriods_hyperlink.click();
}

@FindBy(how= How.LINK_TEXT, using = "Import Costs")
	public static WebElement ImportCosts_hyperlink;

public void verify_ImportCosts_hyperlink_Status(String data){
		//Verifies the Status of the ImportCosts_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ImportCosts_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ImportCosts_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ImportCosts_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ImportCosts_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ImportCosts_hyperlink(){
		ImportCosts_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id, 'RAtl8')]")
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'RAtl13')]")
	public static WebElement CreateAccounting_hyperlink;

public void verify_CreateAccounting_hyperlink_Status(String data){
		//Verifies the Status of the CreateAccounting_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CreateAccounting_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CreateAccounting_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CreateAccounting_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CreateAccounting_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CreateAccounting_hyperlink(){
		CreateAccounting_hyperlink.click();
}

@FindBy(how= How.LINK_TEXT, using = "Capture Costs")
	public static WebElement CaptureCosts_hyperlink;

public void verify_CaptureCosts_hyperlink_Status(String data){
		//Verifies the Status of the CaptureCosts_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CaptureCosts_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CaptureCosts_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CaptureCosts_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CaptureCosts_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CaptureCosts_hyperlink(){
		CaptureCosts_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}