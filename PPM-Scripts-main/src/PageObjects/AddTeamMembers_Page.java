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
public class AddTeamMembers_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'PartyNameTM::content')]")
	public static WebElement Person_textbox;

public void verify_Person_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Person_textbox.getAttribute("value"),data);
	}

}

public void verify_Person_textbox_Status(String data){
		//Verifies the Status of the Person_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Person_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Person_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Person_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Person_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Person_textbox(String data){
		Person_textbox.clear();
		Person_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'P40:1:AT1:AT2:_ATp:table2:0:inputDate1::content')]")
	public static WebElement StartDate_textbox;

public void verify_StartDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(StartDate_textbox.getAttribute("value"),data);
	}

}

public void verify_StartDate_textbox_Status(String data){
		//Verifies the Status of the StartDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(StartDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(StartDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!StartDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!StartDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_StartDate_textbox(String data){
		StartDate_textbox.clear();
		StartDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'projectRoleNameId_csl:sis1:is1::content')]")
	public static WebElement ProjectRole_dropdown;

public void verify_ProjectRole_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ProjectRole_dropdown.getAttribute("value"),data);
	}

}

public void verify_ProjectRole_dropdown_Status(String data){
		//Verifies the Status of the ProjectRole_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectRole_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectRole_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectRole_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectRole_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_ProjectRole_dropdown(String data){
		Select dropdown= new Select(ProjectRole_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//button[@accesskey='S']")
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

@FindBy(how= How.ID, using = "SaveAndAddAnother_button")
	public static WebElement SaveAndAddAnother_button;

public void verify_SaveAndAddAnother_button_Status(String data){
		//Verifies the Status of the SaveAndAddAnother_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SaveAndAddAnother_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SaveAndAddAnother_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SaveAndAddAnother_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SaveAndAddAnother_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SaveAndAddAnother_button(){
		SaveAndAddAnother_button.click();
}

@FindBy(how= How.ID, using = "ProjectManager_button")
	public static WebElement ProjectManager_button;

public void verify_ProjectManager_button_Status(String data){
		//Verifies the Status of the ProjectManager_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectManager_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectManager_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectManager_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectManager_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ProjectManager_button(){
		ProjectManager_button.click();
}

@FindBy(how= How.ID, using = "AccountManager_button")
	public static WebElement AccountManager_button;

public void verify_AccountManager_button_Status(String data){
		//Verifies the Status of the AccountManager_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AccountManager_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AccountManager_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AccountManager_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AccountManager_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AccountManager_button(){
		AccountManager_button.click();
}

@FindBy(how= How.ID, using = "OnsiteDeveloper_button")
	public static WebElement OnsiteDeveloper_button;

public void verify_OnsiteDeveloper_button_Status(String data){
		//Verifies the Status of the OnsiteDeveloper_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OnsiteDeveloper_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OnsiteDeveloper_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OnsiteDeveloper_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OnsiteDeveloper_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OnsiteDeveloper_button(){
		OnsiteDeveloper_button.click();
}

@FindBy(how= How.ID, using = "OffshoreDeveloper_button")
	public static WebElement OffshoreDeveloper_button;

public void verify_OffshoreDeveloper_button_Status(String data){
		//Verifies the Status of the OffshoreDeveloper_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OffshoreDeveloper_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OffshoreDeveloper_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OffshoreDeveloper_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OffshoreDeveloper_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OffshoreDeveloper_button(){
		OffshoreDeveloper_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}