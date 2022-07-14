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
public class ExpenditureItem_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Costing_tab")
	public static WebElement Costing_tab;

public void verify_Costing_tab(String data){
		Assert.assertEquals(Costing_tab,Costing_tab);
}

public void verify_Costing_tab_Status(String data){
		//Verifies the Status of the Costing_tab
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Costing_tab.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Costing_tab.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Costing_tab.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Costing_tab.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Costing_tab(){
		Costing_tab.click();
}

public void onHover_Costing_tab(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Costing_tab).perform();
}

@FindBy(how= How.XPATH, using = "//button[contains(text(),'View Accounting')]")
	public static WebElement ViewAccounting_button;

public void verify_ViewAccounting_button_Status(String data){
		//Verifies the Status of the ViewAccounting_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ViewAccounting_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ViewAccounting_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ViewAccounting_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ViewAccounting_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ViewAccounting_button(){
		ViewAccounting_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'eidet_panel1:menu1')]//a[@class='xh9'][contains(text(),'Actions')]")
	public static WebElement Actions_dropdown;

public void verify_Actions_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Actions_dropdown.getAttribute("value"),data);
	}

}

public void verify_Actions_dropdown_Status(String data){
		//Verifies the Status of the Actions_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Actions_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Actions_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Actions_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Actions_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Actions_dropdown(String data){
		Select dropdown= new Select(Actions_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//td[contains(text(),'Costing')]")
	public static WebElement Costing_dropdown;

public void verify_Costing_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Costing_dropdown.getAttribute("value"),data);
	}

}

public void verify_Costing_dropdown_Status(String data){
		//Verifies the Status of the Costing_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Costing_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Costing_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Costing_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Costing_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Costing_dropdown(String data){
		Select dropdown= new Select(Costing_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//tr[contains(@id,'eidet_panel1:menu3')]//td[@class='xnw'][contains(text(),'Billing')]")
	public static WebElement Billing_dropdown;

public void verify_Billing_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Billing_dropdown.getAttribute("value"),data);
	}

}

public void verify_Billing_dropdown_Status(String data){
		//Verifies the Status of the Billing_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Billing_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Billing_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Billing_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Billing_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Billing_dropdown(String data){
		Select dropdown= new Select(Billing_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'eidet_panel1:SPb')]")
	public static WebElement ExpItemDone_button;

public void verify_ExpItemDone_button_Status(String data){
		//Verifies the Status of the ExpItemDone_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ExpItemDone_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ExpItemDone_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ExpItemDone_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ExpItemDone_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ExpItemDone_button(){
		ExpItemDone_button.click();
}

@FindBy(how= How.ID, using = "ViewAccounting_menuitem")
	public static WebElement ViewAccounting_menuitem;

public void click_ViewAccounting_menuitem(){
		ViewAccounting_menuitem.click();
}

public void onHover_ViewAccounting_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(ViewAccounting_menuitem).perform();
}

@FindBy(how= How.ID, using = "Accounts_menuitem")
	public static WebElement Accounts_menuitem;

public void click_Accounts_menuitem(){
		Accounts_menuitem.click();
}

public void onHover_Accounts_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Accounts_menuitem).perform();
}

@FindBy(how= How.XPATH, using = "//tr[contains(@id,'1:j_id528')]//td[@class='xz0 xk8']")
	public static WebElement Account1_mouseover;

public void onHover_Account1_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Account1_mouseover).perform();
}

@FindBy(how= How.ID, using = "SetToNonbillable_mouseover")
	public static WebElement SetToNonbillable_mouseover;

public void onHover_SetToNonbillable_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(SetToNonbillable_mouseover).perform();
}

@FindBy(how= How.ID, using = "HoldInvoiceUntilReleased_mouseover")
	public static WebElement HoldInvoiceUntilReleased_mouseover;

public void onHover_HoldInvoiceUntilReleased_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(HoldInvoiceUntilReleased_mouseover).perform();
}

@FindBy(how= How.ID, using = "HoldInvoiceOnce_mouseover")
	public static WebElement HoldInvoiceOnce_mouseover;

public void onHover_HoldInvoiceOnce_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(HoldInvoiceOnce_mouseover).perform();
}

@FindBy(how= How.ID, using = "RecalculateRawCostAmt_mouseover")
	public static WebElement RecalculateRawCostAmt_mouseover;

public void onHover_RecalculateRawCostAmt_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(RecalculateRawCostAmt_mouseover).perform();
}

@FindBy(how= How.ID, using = "SplitAndTransfer_mouseover")
	public static WebElement SplitAndTransfer_mouseover;

public void onHover_SplitAndTransfer_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(SplitAndTransfer_mouseover).perform();
}

@FindBy(how= How.ID, using = "ChangeWorkType_mouseover")
	public static WebElement ChangeWorkType_mouseover;

public void onHover_ChangeWorkType_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(ChangeWorkType_mouseover).perform();
}

@FindBy(how= How.ID, using = "RecalculateConvertedCostAmt_mouseover")
	public static WebElement RecalculateConvertedCostAmt_mouseover;

public void onHover_RecalculateConvertedCostAmt_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(RecalculateConvertedCostAmt_mouseover).perform();
}

@FindBy(how= How.ID, using = "RecalculateBurdenedCostAmt_mouseover")
	public static WebElement RecalculateBurdenedCostAmt_mouseover;

public void onHover_RecalculateBurdenedCostAmt_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(RecalculateBurdenedCostAmt_mouseover).perform();
}

@FindBy(how= How.ID, using = "SetToCapitalizable_mouseover")
	public static WebElement SetToCapitalizable_mouseover;

public void onHover_SetToCapitalizable_mouseover(){
		Actions actions = new Actions(driver);
		actions.moveToElement(SetToCapitalizable_mouseover).perform();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}