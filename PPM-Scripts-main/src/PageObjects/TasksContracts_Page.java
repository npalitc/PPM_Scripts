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
public class TasksContracts_Page extends PageObjectBase{
@FindBy(how= How.LINK_TEXT, using = "Manage Contracts")
	public static WebElement ManageContracts_hyperlink;

public void verify_ManageContracts_hyperlink_Status(String data){
		//Verifies the Status of the ManageContracts_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageContracts_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageContracts_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageContracts_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageContracts_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageContracts_hyperlink(){
		ManageContracts_hyperlink.click();
}

@FindBy(how= How.LINK_TEXT, using = "Manage Contract Templates")
	public static WebElement ManageContractTemplates_hyperlink;

public void verify_ManageContractTemplates_hyperlink_Status(String data){
		//Verifies the Status of the ManageContractTemplates_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageContractTemplates_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageContractTemplates_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageContractTemplates_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageContractTemplates_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageContractTemplates_hyperlink(){
		ManageContractTemplates_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}