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
public class EditBudget_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//div[contains(@id,'ctb1')]")
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