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
public class ManageResources_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id, 'rnL::content')]")
	public static WebElement Resource_textbox;

public void verify_Resource_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Resource_textbox.getAttribute("value"),data);
	}

}

public void verify_Resource_textbox_Status(String data){
		//Verifies the Status of the Resource_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resource_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resource_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resource_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resource_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Resource_textbox(String data){
		Resource_textbox.clear();
		Resource_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id, 'pq::content')]")
	public static WebElement PlannedBudgetAmt_textbox;

public void verify_PlannedBudgetAmt_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PlannedBudgetAmt_textbox.getAttribute("value"),data);
	}

}

public void verify_PlannedBudgetAmt_textbox_Status(String data){
		//Verifies the Status of the PlannedBudgetAmt_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PlannedBudgetAmt_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PlannedBudgetAmt_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PlannedBudgetAmt_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PlannedBudgetAmt_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PlannedBudgetAmt_textbox(String data){
		PlannedBudgetAmt_textbox.clear();
		PlannedBudgetAmt_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//button[@accesskey='S']")
	public static WebElement SaveAndClose_button;

public void verify_SaveAndClose_button_Status(String data){
		//Verifies the Status of the SaveAndClose_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SaveAndClose_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SaveAndClose_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SaveAndClose_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SaveAndClose_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SaveAndClose_button(){
		SaveAndClose_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}