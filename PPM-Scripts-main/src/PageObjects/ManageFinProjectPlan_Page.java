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
public class ManageFinProjectPlan_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "SelectSubTaskRow_button")
	public static WebElement SelectSubTaskRow_button;

public void verify_SelectSubTaskRow_button_Status(String data){
		//Verifies the Status of the SelectSubTaskRow_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectSubTaskRow_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectSubTaskRow_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectSubTaskRow_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectSubTaskRow_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SelectSubTaskRow_button(){
		SelectSubTaskRow_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'pt1:ap1:pc2:insTB::popEl')]")
	public static WebElement AddDD_dropdown;

public void verify_AddDD_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AddDD_dropdown.getAttribute("value"),data);
	}

}

public void verify_AddDD_dropdown_Status(String data){
		//Verifies the Status of the AddDD_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddDD_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddDD_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddDD_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddDD_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_AddDD_dropdown(String data){
		Select dropdown= new Select(AddDD_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'tName')]")
	public static WebElement TaskName_textbox;

public void verify_TaskName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TaskName_textbox.getAttribute("value"),data);
	}

}

public void verify_TaskName_textbox_Status(String data){
		//Verifies the Status of the TaskName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TaskName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TaskName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TaskName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TaskName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TaskName_textbox(String data){
		TaskName_textbox.clear();
		TaskName_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//select[contains(@id,'soc5')]")
	public static WebElement ServiceType_dropdown;

public void verify_ServiceType_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ServiceType_dropdown.getAttribute("value"),data);
	}

}

public void verify_ServiceType_dropdown_Status(String data){
		//Verifies the Status of the ServiceType_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ServiceType_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ServiceType_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ServiceType_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ServiceType_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_ServiceType_dropdown(String data){
		Select dropdown= new Select(ServiceType_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Task_menuitem")
	public static WebElement Task_menuitem;

public void click_Task_menuitem(){
		Task_menuitem.click();
}

public void onHover_Task_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Task_menuitem).perform();
}

@FindBy(how= How.ID, using = "Actions_menuitem")
	public static WebElement Actions_menuitem;

public void click_Actions_menuitem(){
		Actions_menuitem.click();
}

public void onHover_Actions_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Actions_menuitem).perform();
}

@FindBy(how= How.XPATH, using = "//*[@class='xnv'][contains(text(),'Set Baseline')]")
	public static WebElement SetBaseline_menuitem;

public void click_SetBaseline_menuitem(){
		SetBaseline_menuitem.click();
}

public void onHover_SetBaseline_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(SetBaseline_menuitem).perform();
}

@FindBy(how= How.XPATH, using = "//td[contains(text(),'Set Baseline for All Tasks')]")
	public static WebElement SetBaseLineForAllTasks_menuitem;

public void click_SetBaseLineForAllTasks_menuitem(){
		SetBaseLineForAllTasks_menuitem.click();
}

public void onHover_SetBaseLineForAllTasks_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(SetBaseLineForAllTasks_menuitem).perform();
}

@FindBy(how= How.ID, using = "View_menuitem")
	public static WebElement View_menuitem;

public void click_View_menuitem(){
		View_menuitem.click();
}

public void onHover_View_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(View_menuitem).perform();
}

@FindBy(how= How.XPATH, using = "//tr[contains(@id,'pt1:ap1:pc2:_clmns')]")
	public static WebElement Columns_menuitem;

public void click_Columns_menuitem(){
		Columns_menuitem.click();
}

public void onHover_Columns_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Columns_menuitem).perform();
}

@FindBy(how= How.XPATH, using = "//tr[contains(@id,'pt1:ap1:pc2:_xpdAll')]")
	public static WebElement ExpandAll_menuitem;

public void click_ExpandAll_menuitem(){
		ExpandAll_menuitem.click();
}

public void onHover_ExpandAll_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(ExpandAll_menuitem).perform();
}

@FindBy(how= How.XPATH, using = "//tr[contains(@id,'pt1:ap1:pc2:_shwAll')]")
	public static WebElement Show_All_menuitem;

public void click_Show_All_menuitem(){
		Show_All_menuitem.click();
}

public void onHover_Show_All_menuitem(){
		Actions actions = new Actions(driver);
		actions.moveToElement(Show_All_menuitem).perform();
}

@FindBy(how= How.XPATH, using = "//img[contains(@id,'pt1:ap1:pc2:tt1:8:dffIL1')]")
	public static WebElement AdditionalInformationBtn_button;

public void verify_AdditionalInformationBtn_button_Status(String data){
		//Verifies the Status of the AdditionalInformationBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AdditionalInformationBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AdditionalInformationBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AdditionalInformationBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AdditionalInformationBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AdditionalInformationBtn_button(){
		AdditionalInformationBtn_button.click();
}

@FindBy(how= How.ID, using = "DetailsBtn_button")
	public static WebElement DetailsBtn_button;

public void verify_DetailsBtn_button_Status(String data){
		//Verifies the Status of the DetailsBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(DetailsBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(DetailsBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!DetailsBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!DetailsBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_DetailsBtn_button(){
		DetailsBtn_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'1:rsrcGrp::icon')]")
	public static WebElement ResourcesBtn_button;

public void verify_ResourcesBtn_button_Status(String data){
		//Verifies the Status of the ResourcesBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ResourcesBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ResourcesBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ResourcesBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ResourcesBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ResourcesBtn_button(){
		ResourcesBtn_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'pt1:ap1:APscl2')]")  ////button[@accesskey='S']
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

@FindBy(how= How.ID, using = "SelectMainTask_button")
	public static WebElement SelectMainTask_button;

public void verify_SelectMainTask_button_Status(String data){
		//Verifies the Status of the SelectMainTask_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectMainTask_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectMainTask_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectMainTask_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectMainTask_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SelectMainTask_button(){
		SelectMainTask_button.click();
}

@FindBy(how= How.XPATH, using = "//div[contains(@id,'ProgPnl:btnCaptureProgress')]")
	public static WebElement CaptureProgress_button;

public void verify_CaptureProgress_button_Status(String data){
		//Verifies the Status of the CaptureProgress_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CaptureProgress_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CaptureProgress_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CaptureProgress_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CaptureProgress_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CaptureProgress_button(){
		CaptureProgress_button.click();
}

@FindBy(how= How.XPATH, using = "//a[contains(@id,'prgTab')]")
	public static WebElement Progress_hyperlink;

public void verify_Progress_hyperlink_Status(String data){
		//Verifies the Status of the Progress_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Progress_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Progress_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Progress_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Progress_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Progress_hyperlink(){
		Progress_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//button[contains(@id,'btnPublishProgress')]")
	public static WebElement PublishProgress_button;

public void verify_PublishProgress_button_Status(String data){
		//Verifies the Status of the PublishProgress_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PublishProgress_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PublishProgress_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PublishProgress_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PublishProgress_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_PublishProgress_button(){
		PublishProgress_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}