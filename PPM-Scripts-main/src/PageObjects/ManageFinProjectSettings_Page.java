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
public class ManageFinProjectSettings_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'P20:0:commandButton1')]")
	public static WebElement BasicInfoEdit_button;

public void verify_BasicInfoEdit_button_Status(String data){
		//Verifies the Status of the BasicInfoEdit_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(BasicInfoEdit_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(BasicInfoEdit_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!BasicInfoEdit_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!BasicInfoEdit_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_BasicInfoEdit_button(){
		BasicInfoEdit_button.click();
}

@FindBy(how= How.LINK_TEXT, using = "Parties")
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'P100:0:ctb1')]")
	public static WebElement AttachmentEdit_button;

public void verify_AttachmentEdit_button_Status(String data){
		//Verifies the Status of the AttachmentEdit_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AttachmentEdit_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AttachmentEdit_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AttachmentEdit_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AttachmentEdit_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AttachmentEdit_button(){
		AttachmentEdit_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'P40:1:AT1:_ATp:create::icon')]")
	public static WebElement AddTeamMember_button;

public void verify_AddTeamMember_button_Status(String data){
		//Verifies the Status of the AddTeamMember_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddTeamMember_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddTeamMember_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddTeamMember_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddTeamMember_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_AddTeamMember_button(){
		AddTeamMember_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'cb_done')]")
	public static WebElement Done_button;

public void verify_Done_button_Status(String data){
		//Verifies the Status of the Done_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Done_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Done_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Done_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Done_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Done_button(){
		Done_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'P30:0:commandButton1')]")
	public static WebElement ProjectClassificationEdit_button;

public void verify_ProjectClassificationEdit_button_Status(String data){
		//Verifies the Status of the ProjectClassificationEdit_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectClassificationEdit_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectClassificationEdit_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectClassificationEdit_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectClassificationEdit_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ProjectClassificationEdit_button(){
		ProjectClassificationEdit_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(text(),'Change Status')]")
	public static WebElement ChangeStatus_button;

public void verify_ChangeStatus_button_Status(String data){
		//Verifies the Status of the ChangeStatus_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ChangeStatus_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ChangeStatus_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ChangeStatus_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ChangeStatus_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ChangeStatus_button(){
		ChangeStatus_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}