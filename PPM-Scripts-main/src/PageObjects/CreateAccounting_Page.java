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
public class CreateAccounting_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'paramDynForm_Attribute27_ATTRIBUTE27::content')]")
	public static WebElement Ledger_textbox;

public void verify_Ledger_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Ledger_textbox.getAttribute("value"),data);
	}

}

public void verify_Ledger_textbox_Status(String data){
		//Verifies the Status of the Ledger_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Ledger_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Ledger_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Ledger_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Ledger_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Ledger_textbox(String data){
		Ledger_textbox.clear();
		Ledger_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'paramDynForm_Attribute7_ATTRIBUTE7::content')]")
	public static WebElement EndDate_textbox;

public void verify_EndDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(EndDate_textbox.getAttribute("value"),data);
	}

}

public void verify_EndDate_textbox_Status(String data){
		//Verifies the Status of the EndDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(EndDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(EndDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!EndDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!EndDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_EndDate_textbox(String data){
		EndDate_textbox.clear();
		EndDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'paramDynForm_Attribute12_ATTRIBUTE12::content')]")
	public static WebElement TransferToGeneralLedger_dropdown;

public void verify_TransferToGeneralLedger_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TransferToGeneralLedger_dropdown.getAttribute("value"),data);
	}

}

public void verify_TransferToGeneralLedger_dropdown_Status(String data){
		//Verifies the Status of the TransferToGeneralLedger_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TransferToGeneralLedger_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TransferToGeneralLedger_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TransferToGeneralLedger_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TransferToGeneralLedger_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_TransferToGeneralLedger_dropdown(String data){
		Select dropdown= new Select(TransferToGeneralLedger_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'paramDynForm_Attribute13_ATTRIBUTE13::content')]")
	public static WebElement PostInGeneralLedger_dropdown;

public void verify_PostInGeneralLedger_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PostInGeneralLedger_dropdown.getAttribute("value"),data);
	}

}

public void verify_PostInGeneralLedger_dropdown_Status(String data){
		//Verifies the Status of the PostInGeneralLedger_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PostInGeneralLedger_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PostInGeneralLedger_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PostInGeneralLedger_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PostInGeneralLedger_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_PostInGeneralLedger_dropdown(String data){
		Select dropdown= new Select(PostInGeneralLedger_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'requestBtns:submitButton')]")
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

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}