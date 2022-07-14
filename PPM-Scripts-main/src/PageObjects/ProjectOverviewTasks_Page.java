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
public class ProjectOverviewTasks_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "_hyperlink")
	public static WebElement _hyperlink;

public void verify__hyperlink_Status(String data){
		//Verifies the Status of the _hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click__hyperlink(){
		_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'cl3')]")
										//*[contains(@id,'cl3')]
	public static WebElement ManageFinProjectSettings_hyperlink;

public void verify_ManageFinProjectSettings_hyperlink_Status(String data){
		//Verifies the Status of the ManageFinProjectSettings_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageFinProjectSettings_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageFinProjectSettings_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageFinProjectSettings_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageFinProjectSettings_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageFinProjectSettings_hyperlink(){
		ManageFinProjectSettings_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(text(),'Manage Financial Project Plan')]")
	public static WebElement ManageFinProjectPlan_hyperlink;

public void verify_ManageFinProjectPlan_hyperlink_Status(String data){
		//Verifies the Status of the ManageFinProjectPlan_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageFinProjectPlan_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageFinProjectPlan_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageFinProjectPlan_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageFinProjectPlan_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageFinProjectPlan_hyperlink(){
		ManageFinProjectPlan_hyperlink.click();
}

@FindBy(how= How.LINK_TEXT, using = "Track Financial Project Progress")
	public static WebElement TrackFinProjectProgress_hyperlink;

public void verify_TrackFinProjectProgress_hyperlink_Status(String data){
		//Verifies the Status of the TrackFinProjectProgress_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TrackFinProjectProgress_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TrackFinProjectProgress_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TrackFinProjectProgress_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TrackFinProjectProgress_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TrackFinProjectProgress_hyperlink(){
		TrackFinProjectProgress_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'cl7')]")
	public static WebElement ManageProjectBudget_hyperlink;

public void verify_ManageProjectBudget_hyperlink_Status(String data){
		//Verifies the Status of the ManageProjectBudget_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ManageProjectBudget_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ManageProjectBudget_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ManageProjectBudget_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ManageProjectBudget_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ManageProjectBudget_hyperlink(){
		ManageProjectBudget_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}