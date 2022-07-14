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
public class EditContractsBilling_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'AT2:_ATp:table1:0:cl1')]")
	public static WebElement BillPlansT_M_BP_hyperlink;

public void verify_BillPlansT_M_BP_hyperlink_Status(String data){
		//Verifies the Status of the BillPlansT_M_BP_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(BillPlansT_M_BP_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(BillPlansT_M_BP_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!BillPlansT_M_BP_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!BillPlansT_M_BP_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_BillPlansT_M_BP_hyperlink(){
		BillPlansT_M_BP_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'0:it3::content')]")
	public static WebElement PONumber_textbox;

public void verify_PONumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PONumber_textbox.getAttribute("value"),data);
	}

}

public void verify_PONumber_textbox_Status(String data){
		//Verifies the Status of the PONumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PONumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PONumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PONumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PONumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PONumber_textbox(String data){
		PONumber_textbox.clear();
		PONumber_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'owningOrgNameId::content')]")
	public static WebElement ContractOraganisation_textbox;

public void verify_ContractOraganisation_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ContractOraganisation_textbox.getAttribute("value"),data);
	}

}

public void verify_ContractOraganisation_textbox_Status(String data){
		//Verifies the Status of the ContractOraganisation_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ContractOraganisation_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ContractOraganisation_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ContractOraganisation_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ContractOraganisation_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ContractOraganisation_textbox(String data){
		ContractOraganisation_textbox.clear();
		ContractOraganisation_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'soc1::content')]")
	public static WebElement TransactionType_textbox;

public void verify_TransactionType_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TransactionType_textbox.getAttribute("value"),data);
	}

}

public void verify_TransactionType_textbox_Status(String data){
		//Verifies the Status of the TransactionType_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TransactionType_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TransactionType_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TransactionType_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TransactionType_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TransactionType_textbox(String data){
		TransactionType_textbox.clear();
		TransactionType_textbox.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}