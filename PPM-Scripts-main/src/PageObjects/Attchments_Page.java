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
public class Attchments_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'P100:0:cb5')]")
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'applicationsTable:_ATp:create::icon')]")
	public static WebElement Add_button;

public void verify_Add_button_Status(String data){
		//Verifies the Status of the Add_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_button(){
		Add_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'attachmentTable:0:desktopFile::content')]")
	public static WebElement ChooseFile_button;

public void verify_ChooseFile_button_Status(String data){
		//Verifies the Status of the ChooseFile_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ChooseFile_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ChooseFile_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ChooseFile_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ChooseFile_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ChooseFile_button(){
		ChooseFile_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}