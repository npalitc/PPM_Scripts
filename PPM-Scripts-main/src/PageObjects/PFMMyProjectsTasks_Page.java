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
public class PFMMyProjectsTasks_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'cl10')]")
	public static WebElement CreateProject_hyperlink;

public void verify_CreateProject_hyperlink_Status(String data){
		//Verifies the Status of the CreateProject_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CreateProject_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CreateProject_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CreateProject_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CreateProject_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CreateProject_hyperlink(){
		CreateProject_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}