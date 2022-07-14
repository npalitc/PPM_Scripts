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
public class EditTransaction_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//a[contains(@id,'MAt1:2:AP1:ctb1::popEl')]")
	public static WebElement Save_dropdown;

public void verify_Save_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Save_dropdown.getAttribute("value"),data);
	}

}

public void verify_Save_dropdown_Status(String data){
		//Verifies the Status of the Save_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Save_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Save_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Save_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Save_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Save_dropdown(String data){
		Select dropdown= new Select(Save_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "TransactionCurrency_textbox")
	public static WebElement TransactionCurrency_textbox;

public void verify_TransactionCurrency_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TransactionCurrency_textbox.getAttribute("value"),data);
	}

}

public void verify_TransactionCurrency_textbox_Status(String data){
		//Verifies the Status of the TransactionCurrency_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TransactionCurrency_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TransactionCurrency_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TransactionCurrency_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TransactionCurrency_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TransactionCurrency_textbox(String data){
		TransactionCurrency_textbox.clear();
		TransactionCurrency_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "RawCost_textbox")
	public static WebElement RawCost_textbox;

public void verify_RawCost_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(RawCost_textbox.getAttribute("value"),data);
	}

}

public void verify_RawCost_textbox_Status(String data){
		//Verifies the Status of the RawCost_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(RawCost_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(RawCost_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!RawCost_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!RawCost_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_RawCost_textbox(String data){
		RawCost_textbox.clear();
		RawCost_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "BurdenedCost_textbox")
	public static WebElement BurdenedCost_textbox;

public void verify_BurdenedCost_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(BurdenedCost_textbox.getAttribute("value"),data);
	}

}

public void verify_BurdenedCost_textbox_Status(String data){
		//Verifies the Status of the BurdenedCost_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(BurdenedCost_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(BurdenedCost_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!BurdenedCost_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!BurdenedCost_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_BurdenedCost_textbox(String data){
		BurdenedCost_textbox.clear();
		BurdenedCost_textbox.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}