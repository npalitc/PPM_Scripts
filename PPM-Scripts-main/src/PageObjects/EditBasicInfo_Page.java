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
public class EditBasicInfo_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'selectOneChoice4::content')]")
	public static WebElement ServiceType_dropdown;

public void verify_ServiceType_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ServiceType_dropdown.getAttribute("value"),data);
	}

}

public void verify_ServiceType_dropdown_Status(String data){
		//Verifies the Status of the ServiceType_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ServiceType_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ServiceType_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ServiceType_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ServiceType_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_ServiceType_dropdown(String data){
		Select dropdown= new Select(ServiceType_dropdown);
		 dropdown.selectByVisibleText(data);
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