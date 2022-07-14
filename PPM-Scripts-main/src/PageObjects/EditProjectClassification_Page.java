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
public class EditProjectClassification_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "EditProjectClassification_button")
	public static WebElement EditProjectClassification_button;

public void verify_EditProjectClassification_button_Status(String data){
		//Verifies the Status of the EditProjectClassification_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(EditProjectClassification_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(EditProjectClassification_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!EditProjectClassification_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!EditProjectClassification_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_EditProjectClassification_button(){
		EditProjectClassification_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AT1:_ATp:table2:0:iclov1_csl:sis1:is1::content')]")
	public static WebElement ClassCode_textbox;

public void verify_ClassCode_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ClassCode_textbox.getAttribute("value"),data);
	}

}

public void verify_ClassCode_textbox_Status(String data){
		//Verifies the Status of the ClassCode_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ClassCode_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ClassCode_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ClassCode_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ClassCode_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ClassCode_textbox(String data){
		ClassCode_textbox.clear();
		ClassCode_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'saveACBtn1')]")
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

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}