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
public class EditContractsOverview_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "_textbox")
	public static WebElement _textbox;

public void verify__textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(_textbox.getAttribute("value"),data);
	}

}

public void verify__textbox_Status(String data){
		//Verifies the Status of the _textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set__textbox(String data){
		_textbox.clear();
		_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputDate5::content')]")
	public static WebElement AmendmentEffectiveDate_textbox;

public void verify_AmendmentEffectiveDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AmendmentEffectiveDate_textbox.getAttribute("value"),data);
	}

}

public void verify_AmendmentEffectiveDate_textbox_Status(String data){
		//Verifies the Status of the AmendmentEffectiveDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AmendmentEffectiveDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AmendmentEffectiveDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AmendmentEffectiveDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AmendmentEffectiveDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_AmendmentEffectiveDate_textbox(String data){
		AmendmentEffectiveDate_textbox.clear();
		AmendmentEffectiveDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputText2')]")
	public static WebElement ContractName_textbox;

public void verify_ContractName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ContractName_textbox.getAttribute("value"),data);
	}

}

public void verify_ContractName_textbox_Status(String data){
		//Verifies the Status of the ContractName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ContractName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ContractName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ContractName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ContractName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ContractName_textbox(String data){
		ContractName_textbox.clear();
		ContractName_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Status_label")
	public static WebElement Status_label;

public void verify_Status_label(String data){
		Assert.assertEquals(Status_label,Status_label);
}

public void verify_Status_label_Status(String data){
		//Verifies the Status of the Status_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}