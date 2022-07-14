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
public class CreateProjects_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'inputComboboxListOfValues2::content')]")
	public static WebElement SourceTemplate_textbox;

public void verify_SourceTemplate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(SourceTemplate_textbox.getAttribute("value"),data);
	}

}

public void verify_SourceTemplate_textbox_Status(String data){
		//Verifies the Status of the SourceTemplate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SourceTemplate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SourceTemplate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SourceTemplate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SourceTemplate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_SourceTemplate_textbox(String data){
		SourceTemplate_textbox.clear();
		SourceTemplate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'it1::content')]")
	public static WebElement ProjectName_textbox;

public void verify_ProjectName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ProjectName_textbox.getAttribute("value"),data);
	}

}

public void verify_ProjectName_textbox_Status(String data){
		//Verifies the Status of the ProjectName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ProjectName_textbox(String data){
		ProjectName_textbox.clear();
		ProjectName_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(text(),'Save and Continue')]")
	public static WebElement SaveContinue_button;

public void verify_SaveContinue_button_Status(String data){
		//Verifies the Status of the SaveContinue_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SaveContinue_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SaveContinue_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SaveContinue_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SaveContinue_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SaveContinue_button(){
		SaveContinue_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}