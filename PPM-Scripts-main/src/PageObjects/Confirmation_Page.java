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
public class Confirmation_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//button[contains(@id,'yes')]")
	public static WebElement MangeAccPeriodYesBtn_button;

public void verify_MangeAccPeriodYesBtn_button_Status(String data){
		//Verifies the Status of the MangeAccPeriodYesBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(MangeAccPeriodYesBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(MangeAccPeriodYesBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!MangeAccPeriodYesBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!MangeAccPeriodYesBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_MangeAccPeriodYesBtn_button(){
		MangeAccPeriodYesBtn_button.click();
}

@FindBy(how= How.XPATH, using = "//button[contains(@id,'confirmSubmitDialog::ok')]")
	public static WebElement ImportCostsOkBtn_button;

public void verify_ImportCostsOkBtn_button_Status(String data){
		//Verifies the Status of the ImportCostsOkBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ImportCostsOkBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ImportCostsOkBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ImportCostsOkBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ImportCostsOkBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ImportCostsOkBtn_button(){
		ImportCostsOkBtn_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}