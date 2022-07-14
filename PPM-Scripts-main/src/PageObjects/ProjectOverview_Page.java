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
public class ProjectOverview_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'sdi2::icon')]")
                              
	public static WebElement Tasks_button;

public void verify_Tasks_button_Status(String data){
		//Verifies the Status of the Tasks_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tasks_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tasks_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tasks_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tasks_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tasks_button(){
		Tasks_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}