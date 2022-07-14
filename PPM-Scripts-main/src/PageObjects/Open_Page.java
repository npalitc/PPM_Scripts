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
public class Open_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[contains(@id,'_FOTsr1:0:nameId')]")
	public static WebElement FileName_textbox;

public void verify_FileName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(FileName_textbox.getAttribute("value"),data);
	}

}

public void verify_FileName_textbox_Status(String data){
		//Verifies the Status of the FileName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(FileName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(FileName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!FileName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!FileName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_FileName_textbox(String data){
		FileName_textbox.clear();
		FileName_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//button[contains(@id,'_FOTsr1:0:d1::ok')]")
	public static WebElement Open_button;

public void verify_Open_button_Status(String data){
		//Verifies the Status of the Open_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Open_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Open_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Open_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Open_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Open_button(){
		Open_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}