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
public class SubmitContract_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'AP1:it1::content')]")
	public static WebElement NoteForApprover_textbox;

public void verify_NoteForApprover_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(NoteForApprover_textbox.getAttribute("value"),data);
	}

}

public void verify_NoteForApprover_textbox_Status(String data){
		//Verifies the Status of the NoteForApprover_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(NoteForApprover_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(NoteForApprover_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!NoteForApprover_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!NoteForApprover_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_NoteForApprover_textbox(String data){
		NoteForApprover_textbox.clear();
		NoteForApprover_textbox.sendKeys(data);
}

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

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}