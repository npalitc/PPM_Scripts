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
public class ImportCosts_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'paramDynForm_ATTRIBUTE12::content')]")
	public static WebElement Businessunit_textbox;

public void verify_Businessunit_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Businessunit_textbox.getAttribute("value"),data);
	}

}

public void verify_Businessunit_textbox_Status(String data){
		//Verifies the Status of the Businessunit_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Businessunit_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Businessunit_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Businessunit_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Businessunit_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Businessunit_textbox(String data){
		Businessunit_textbox.clear();
		Businessunit_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'paramDynForm_ATTRIBUTE6_ATTRIBUTE6::content')]")
	public static WebElement TransactionSource_dropdown;

public void verify_TransactionSource_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TransactionSource_dropdown.getAttribute("value"),data);
	}

}

public void verify_TransactionSource_dropdown_Status(String data){
		//Verifies the Status of the TransactionSource_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TransactionSource_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TransactionSource_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TransactionSource_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TransactionSource_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_TransactionSource_dropdown(String data){
		Select dropdown= new Select(TransactionSource_dropdown);
		if(data.equalsIgnoreCase("LaborCosts")) {
			dropdown.selectByVisibleText("Labor Cost");
		}else {
			dropdown.selectByVisibleText(data);
		}
		 
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'submitButton')]")
	public static WebElement ImportCostsSubmitBtn_button;

public void verify_ImportCostsSubmitBtn_button_Status(String data){
		//Verifies the Status of the ImportCostsSubmitBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ImportCostsSubmitBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ImportCostsSubmitBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ImportCostsSubmitBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ImportCostsSubmitBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ImportCostsSubmitBtn_button(){
		ImportCostsSubmitBtn_button.click();
}

@FindBy(how= How.ID, using = "OracleFusionPayables_button")
	public static WebElement OracleFusionPayables_button;

public void verify_OracleFusionPayables_button_Status(String data){
		//Verifies the Status of the OracleFusionPayables_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OracleFusionPayables_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OracleFusionPayables_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OracleFusionPayables_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OracleFusionPayables_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OracleFusionPayables_button(){
		OracleFusionPayables_button.click();
}

@FindBy(how= How.ID, using = "OracleFusionPurchasing_button")
	public static WebElement OracleFusionPurchasing_button;

public void verify_OracleFusionPurchasing_button_Status(String data){
		//Verifies the Status of the OracleFusionPurchasing_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OracleFusionPurchasing_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OracleFusionPurchasing_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OracleFusionPurchasing_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OracleFusionPurchasing_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OracleFusionPurchasing_button(){
		OracleFusionPurchasing_button.click();
}

@FindBy(how= How.ID, using = "OracleFusionCostManagment_button")
	public static WebElement OracleFusionCostManagment_button;

public void verify_OracleFusionCostManagment_button_Status(String data){
		//Verifies the Status of the OracleFusionCostManagment_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OracleFusionCostManagment_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OracleFusionCostManagment_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OracleFusionCostManagment_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OracleFusionCostManagment_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OracleFusionCostManagment_button(){
		OracleFusionCostManagment_button.click();
}

@FindBy(how= How.ID, using = "OracleFusionTimeAndLabor_button")
	public static WebElement OracleFusionTimeAndLabor_button;

public void verify_OracleFusionTimeAndLabor_button_Status(String data){
		//Verifies the Status of the OracleFusionTimeAndLabor_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OracleFusionTimeAndLabor_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OracleFusionTimeAndLabor_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OracleFusionTimeAndLabor_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OracleFusionTimeAndLabor_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OracleFusionTimeAndLabor_button(){
		OracleFusionTimeAndLabor_button.click();
}

@FindBy(how= How.ID, using = "OracleFusionProjects_button")
	public static WebElement OracleFusionProjects_button;

public void verify_OracleFusionProjects_button_Status(String data){
		//Verifies the Status of the OracleFusionProjects_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OracleFusionProjects_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OracleFusionProjects_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OracleFusionProjects_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OracleFusionProjects_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OracleFusionProjects_button(){
		OracleFusionProjects_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}