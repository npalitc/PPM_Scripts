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
public class PFMMyProjects_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'_FOTsr1:0:sdi2::icon')]")
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AP1:q1::search')]")
	public static WebElement Search_button;

public void verify_Search_button_Status(String data){
		//Verifies the Status of the Search_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Search_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Search_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Search_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Search_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Search_button(){
		Search_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AP1:q1:value00::content')]")
	public static WebElement ProjectName_textbox;

public void verify_ProjectName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ProjectName_textbox.getAttribute("value"),data);
	}

}

public void verify_ProjectName_textbox_Status(String data){
		//Verifies the Status of the ProjectName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ProjectName_textbox(String data){
		ProjectName_textbox.clear();
		ProjectName_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AP1:q1:value10::content')]")
	public static WebElement ProjectNumber_textbox;

public void verify_ProjectNumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ProjectNumber_textbox.getAttribute("value"),data);
	}

}

public void verify_ProjectNumber_textbox_Status(String data){
		//Verifies the Status of the ProjectNumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectNumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectNumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectNumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectNumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ProjectNumber_textbox(String data){
		ProjectNumber_textbox.clear();
		ProjectNumber_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AP1:q1:value30::content')]")
	public static WebElement TeamMember_textbox;

public void verify_TeamMember_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TeamMember_textbox.getAttribute("value"),data);
	}

}

public void verify_TeamMember_textbox_Status(String data){
		//Verifies the Status of the TeamMember_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TeamMember_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TeamMember_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TeamMember_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TeamMember_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TeamMember_textbox(String data){
		TeamMember_textbox.clear();
		TeamMember_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AP1:q1::_afrDscl')]")
	public static WebElement SearchExpand_button;

public void verify_SearchExpand_button_Status(String data){
		//Verifies the Status of the SearchExpand_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SearchExpand_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SearchExpand_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SearchExpand_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SearchExpand_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SearchExpand_button(){
		SearchExpand_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AT1:_ATp:table1:0:commandLink1')]")
	public static WebElement ProjectNameLink_hyperlink;

public void verify_ProjectNameLink_hyperlink_Status(String data){
		//Verifies the Status of the ProjectNameLink_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ProjectNameLink_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ProjectNameLink_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ProjectNameLink_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ProjectNameLink_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ProjectNameLink_hyperlink(){
		ProjectNameLink_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}