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
public class PublishProgress_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//button[contains(@id,'ProgPnl:pubCmdOkButton')]")
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

@FindBy(how= How.XPATH, using = "//div[conatins(@id,'ProgPnl:commandButton3')]")
	public static WebElement COK_button;

public void verify_COK_button_Status(String data){
		//Verifies the Status of the COK_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(COK_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(COK_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!COK_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!COK_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_COK_button(){
		COK_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}