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
public class TransferExpenditureItem_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'AP1:SPsb2')]")
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'projectNumberId::content')]")
	public static WebElement ProjectNum_textbox;

public void verify_ProjectNum_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ProjectNum_textbox.getAttribute("value"),data);
	}

}

public void verify_ProjectNum_textbox_Status(String data){
		//Verifies the Status of the ProjectNum_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectNum_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectNum_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectNum_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectNum_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ProjectNum_textbox(String data){
		ProjectNum_textbox.clear();
		ProjectNum_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'taskNumberId::content')]")
	public static WebElement TaskNum_textbox;

public void verify_TaskNum_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TaskNum_textbox.getAttribute("value"),data);
	}

}

public void verify_TaskNum_textbox_Status(String data){
		//Verifies the Status of the TaskNum_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TaskNum_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TaskNum_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TaskNum_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TaskNum_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TaskNum_textbox(String data){
		TaskNum_textbox.clear();
		TaskNum_textbox.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}