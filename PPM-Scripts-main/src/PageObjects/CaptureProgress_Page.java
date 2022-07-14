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
public class CaptureProgress_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[contains(@id,'ProgPnl:cpAsOfDate')]")
	public static WebElement ProgressDate_textbox;

public void verify_ProgressDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ProgressDate_textbox.getAttribute("value"),data);
	}

}

public void verify_ProgressDate_textbox_Status(String data){
		//Verifies the Status of the ProgressDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProgressDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProgressDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProgressDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProgressDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ProgressDate_textbox(String data){
		ProgressDate_textbox.clear();
		ProgressDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//span[contains(text(),'ave and Close')]")
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