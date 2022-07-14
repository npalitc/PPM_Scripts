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
public class ManageProjectCosts_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'value10::content')]")
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'value20::content')]")
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'value90::content')]")
	public static WebElement ExpenditureOrg_textbox;

public void verify_ExpenditureOrg_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ExpenditureOrg_textbox.getAttribute("value"),data);
	}

}

public void verify_ExpenditureOrg_textbox_Status(String data){
		//Verifies the Status of the ExpenditureOrg_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ExpenditureOrg_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ExpenditureOrg_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ExpenditureOrg_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ExpenditureOrg_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ExpenditureOrg_textbox(String data){
		ExpenditureOrg_textbox.clear();
		ExpenditureOrg_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'qPanel::search')]")
	public static WebElement SearchBtn_button;

public void verify_SearchBtn_button_Status(String data){
		//Verifies the Status of the SearchBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SearchBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SearchBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SearchBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SearchBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SearchBtn_button(){
		SearchBtn_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'AT1:_ATp:table1:0:mylink')]")
	public static WebElement TransactionNum_hyperlink;

public void verify_TransactionNum_hyperlink_Status(String data){
		//Verifies the Status of the TransactionNum_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TransactionNum_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TransactionNum_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TransactionNum_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TransactionNum_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TransactionNum_hyperlink(){
		TransactionNum_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}