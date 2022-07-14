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
public class OpenProject_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Name_textbox")
	public static WebElement Name_textbox;

public void verify_Name_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Name_textbox.getAttribute("value"),data);
	}

}

public void verify_Name_textbox_Status(String data){
		//Verifies the Status of the Name_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Name_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Name_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Name_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Name_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Name_textbox(String data){
		Name_textbox.clear();
		Name_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "OK_button")
	public static WebElement OK_button;

public void verify_OK_button_Status(String data){
		//Verifies the Status of the OK_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OK_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OK_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OK_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OK_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OK_button(){
		OK_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}