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
public class Contracts_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[contains(@id,'value10::content')]")
	public static WebElement Number_textbox;

public void verify_Number_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Number_textbox.getAttribute("value"),data);
	}

}

public void verify_Number_textbox_Status(String data){
		//Verifies the Status of the Number_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Number_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Number_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Number_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Number_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Number_textbox(String data){
		Number_textbox.clear();
		Number_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'pt_r1:0:inputDate2::content')]")
public static WebElement EndDate_textbox;

public void verify_EndDate_textbox(String data){
	if(!data.contentEquals("Dont care")){
	Assert.assertEquals(EndDate_textbox.getAttribute("value"),data);
}

}

public void verify_EndDate_textbox_Status(String data){
	//Verifies the Status of the Number_textbox
	if(!data.contentEquals("Dont care")){
		switch(data){
		case "ENABLED":
			Assert.assertTrue(EndDate_textbox.isEnabled());
			break;
		case "VISIBLE":
			Assert.assertTrue(EndDate_textbox.isDisplayed());
			break;
		case "HIDDEN":
			Assert.assertFalse(!EndDate_textbox.isDisplayed());
			break;
		case "DISABLED":
			Assert.assertFalse(!EndDate_textbox.isEnabled());
			break;
		default:
			break;
		}
	}
}
public void set_EndDate_textbox(String data){
	EndDate_textbox.clear();
	EndDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//img[contains(@id,'ContractsDefault::icon')]")
	public static WebElement TasksContract_button;

public void verify_TasksContract_button_Status(String data){
		//Verifies the Status of the TasksContract_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TasksContract_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TasksContract_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TasksContract_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TasksContract_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TasksContract_button(){
		TasksContract_button.click();
}

@FindBy(how= How.XPATH, using = "//button[contains(text(),'Search')]")
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

@FindBy(how= How.XPATH, using = "//tr[@class='xep p_AFSelected']//td[@class='x12z']")
	public static WebElement SelectRowSearchResults_button;

public void verify_SelectRowSearchResults_button_Status(String data){
		//Verifies the Status of the SelectRowSearchResults_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectRowSearchResults_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectRowSearchResults_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectRowSearchResults_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectRowSearchResults_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SelectRowSearchResults_button(){
		SelectRowSearchResults_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'0:outputText1a')]")
	public static WebElement SearchResultsNumberLink_hyperlink;

public void verify_SearchResultsNumberLink_hyperlink_Status(String data){
		//Verifies the Status of the SearchResultsNumberLink_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SearchResultsNumberLink_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SearchResultsNumberLink_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SearchResultsNumberLink_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SearchResultsNumberLink_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SearchResultsNumberLink_hyperlink(){
		SearchResultsNumberLink_hyperlink.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}