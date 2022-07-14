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
public class EditContract_xxxSelected_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'SPsb2')]")
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

@FindBy(how= How.ID, using = "pt1:_FOr1:1:_FOSritemNode_contract_management_contracts:0:MAnt2:2:pt1:pt_r1:0:HomeApplicationPanel:sdi1::disAcr")
	public static WebElement Overview_hyperlink;

public void verify_Overview_hyperlink_Status(String data){
		//Verifies the Status of the Overview_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Overview_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Overview_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Overview_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Overview_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Overview_hyperlink(){
		Overview_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:HomeApplicationPanel:sdi6::disAcr\"]")

	public static WebElement Billing_hyperlink;

public void verify_Billing_hyperlink_Status(String data){
		//Verifies the Status of the Billing_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Billing_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Billing_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Billing_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Billing_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Billing_hyperlink(){
		Billing_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//span[contains(text(),'Actions')]")
	public static WebElement ActionsDrpDwn_button;

public void verify_ActionsDrpDwn_button_Status(String data){
		//Verifies the Status of the ActionsDrpDwn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ActionsDrpDwn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ActionsDrpDwn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ActionsDrpDwn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ActionsDrpDwn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ActionsDrpDwn_button(){
		ActionsDrpDwn_button.click();
}

@FindBy(how= How.XPATH, using = "//td[contains(text(),'Amend')]")
	public static WebElement Amend_button;

public void verify_Amend_button_Status(String data){
		//Verifies the Status of the Amend_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Amend_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Amend_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Amend_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Amend_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Amend_button(){
		Amend_button.click();
}

@FindBy(how= How.XPATH, using = "//button[contains(@id,'HomeApplicationPanel:cb8')]")
	public static WebElement AmendContractOK_button;

public void verify_AmendContractOK_button_Status(String data){
		//Verifies the Status of the AmendContractOK_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AmendContractOK_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AmendContractOK_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AmendContractOK_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AmendContractOK_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AmendContractOK_button(){
		AmendContractOK_button.click();
}

@FindBy(how= How.XPATH, using = "//body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
	public static WebElement Save_button;

public void verify_Save_button_Status(String data){
		//Verifies the Status of the Save_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Save_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Save_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Save_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Save_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Save_button(){
		Save_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'HomeApplicationPanel:commandMenuItem19')]")
	public static WebElement Validate_button;

public void verify_Validate_button_Status(String data){
		//Verifies the Status of the Validate_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Validate_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Validate_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Validate_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Validate_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Validate_button(){
		Validate_button.click();
}

@FindBy(how= How.XPATH, using = "//td[contains(text(),'Submit for Approval')]")
	public static WebElement SubmitforApproval_button;

public void verify_SubmitforApproval_button_Status(String data){
		//Verifies the Status of the SubmitforApproval_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SubmitforApproval_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SubmitforApproval_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SubmitforApproval_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SubmitforApproval_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SubmitforApproval_button(){
		SubmitforApproval_button.click();
}

@FindBy(how= How.XPATH, using = "//*[@id=\"_FOpt1:_FOr1:0:_FONSr2:0:MAnt2:2:pt1:pt_r1:0:HomeApplicationPanel:LinesTab::disAcr\"]")
	public static WebElement Lines_hyperlink;

public void verify_Lines_hyperlink_Status(String data){
		//Verifies the Status of the Lines_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Lines_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Lines_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Lines_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Lines_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Lines_hyperlink(){
		Lines_hyperlink.click();
}

@FindBy(how= How.ID, using = "CreateContractFromTemplate_button")
	public static WebElement CreateContractFromTemplate_button;

public void verify_CreateContractFromTemplate_button_Status(String data){
		//Verifies the Status of the CreateContractFromTemplate_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CreateContractFromTemplate_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CreateContractFromTemplate_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CreateContractFromTemplate_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CreateContractFromTemplate_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CreateContractFromTemplate_button(){
		CreateContractFromTemplate_button.click();
}

@FindBy(how= How.ID, using = "pt1:_FOr1:1:_FOSritemNode_contract_management_contracts:0:MAnt2:2:pt1:pt_r1:0:HomeApplicationPanel:sdi2::disAcr")
	public static WebElement Parties_hyperlink;

public void verify_Parties_hyperlink_Status(String data){
		//Verifies the Status of the Parties_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Parties_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Parties_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Parties_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Parties_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Parties_hyperlink(){
		Parties_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}