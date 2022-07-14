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
public class editcontractslinesDetails_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[contains(@id,'LineValueId')]")
	public static WebElement LineAmount_textbox;

public void verify_LineAmount_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(LineAmount_textbox.getAttribute("value"),data);
	}

}

public void verify_LineAmount_textbox_Status(String data){
		//Verifies the Status of the LineAmount_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LineAmount_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LineAmount_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LineAmount_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LineAmount_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_LineAmount_textbox(String data){
		LineAmount_textbox.clear();
		LineAmount_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "AddInfoContextValue_dropdown")
	public static WebElement AddInfoContextValue_dropdown;

public void verify_AddInfoContextValue_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AddInfoContextValue_dropdown.getAttribute("value"),data);
	}

}

public void verify_AddInfoContextValue_dropdown_Status(String data){
		//Verifies the Status of the AddInfoContextValue_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddInfoContextValue_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddInfoContextValue_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddInfoContextValue_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddInfoContextValue_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_AddInfoContextValue_dropdown(String data){
		Select dropdown= new Select(AddInfoContextValue_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'billPlanId')]")
	public static WebElement BillPlan_textbox;

public void verify_BillPlan_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(BillPlan_textbox.getAttribute("value"),data);
	}

}

public void verify_BillPlan_textbox_Status(String data){
		//Verifies the Status of the BillPlan_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(BillPlan_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(BillPlan_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!BillPlan_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!BillPlan_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_BillPlan_textbox(String data){
		BillPlan_textbox.clear();
		BillPlan_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'revenuePlanId')]")
	public static WebElement RevenuePlan_textbox;

public void verify_RevenuePlan_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(RevenuePlan_textbox.getAttribute("value"),data);
	}

}

public void verify_RevenuePlan_textbox_Status(String data){
		//Verifies the Status of the RevenuePlan_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(RevenuePlan_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(RevenuePlan_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!RevenuePlan_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!RevenuePlan_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_RevenuePlan_textbox(String data){
		RevenuePlan_textbox.clear();
		RevenuePlan_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputText9')]")
	public static WebElement FundedAmount_textbox;

public void verify_FundedAmount_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(FundedAmount_textbox.getAttribute("value"),data);
	}

}

public void verify_FundedAmount_textbox_Status(String data){
		//Verifies the Status of the FundedAmount_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(FundedAmount_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(FundedAmount_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!FundedAmount_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!FundedAmount_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_FundedAmount_textbox(String data){
		FundedAmount_textbox.clear();
		FundedAmount_textbox.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}