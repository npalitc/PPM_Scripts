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
public class SetBaselineForProjectPlan_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "SetBaselineForProjectPlan_button")
	public static WebElement SetBaselineForProjectPlan_button;

public void verify_SetBaselineForProjectPlan_button_Status(String data){
		//Verifies the Status of the SetBaselineForProjectPlan_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SetBaselineForProjectPlan_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SetBaselineForProjectPlan_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SetBaselineForProjectPlan_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SetBaselineForProjectPlan_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SetBaselineForProjectPlan_button(){
		SetBaselineForProjectPlan_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'pt1:ap1:autobud::Label0')]")
	public static WebElement AutomaticallyGenerateBudget_checkbox;

public void verify_AutomaticallyGenerateBudget_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AutomaticallyGenerateBudget_checkbox.getAttribute("value"),data);
	}

}

public void verify_AutomaticallyGenerateBudget_checkbox_Status(String data){
		//Verifies the Status of the AutomaticallyGenerateBudget_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AutomaticallyGenerateBudget_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AutomaticallyGenerateBudget_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AutomaticallyGenerateBudget_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AutomaticallyGenerateBudget_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_AutomaticallyGenerateBudget_checkbox(String data){
		if(AutomaticallyGenerateBudget_checkbox.isSelected());
			AutomaticallyGenerateBudget_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//button[@accesskey='m']")
	public static WebElement Submit_button;

public void verify_Submit_button_Status(String data){
		//Verifies the Status of the Submit_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submit_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submit_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submit_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submit_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Submit_button(){
		Submit_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'bslnOkB')]")
	public static WebElement OK_button;

public void verify_OK_button_Status(String data){
		//Verifies the Status of the OK_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OK_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OK_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OK_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OK_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OK_button(){
		OK_button.click();
}

@FindBy(how= How.ID, using = "WOK_button")
	public static WebElement WOK_button;

public void verify_WOK_button_Status(String data){
		//Verifies the Status of the WOK_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(WOK_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(WOK_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!WOK_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!WOK_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_WOK_button(){
		WOK_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'msgD::ok')]")
	public static WebElement COK_button;

public void verify_COK_button_Status(String data){
		//Verifies the Status of the COK_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(COK_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(COK_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!COK_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!COK_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_COK_button(){
		COK_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}