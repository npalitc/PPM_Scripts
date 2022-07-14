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
public class ManageContractTemplates_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[contains(@id,'value10::content')]")
	public static WebElement TemplateNumber_textbox;

public void verify_TemplateNumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TemplateNumber_textbox.getAttribute("value"),data);
	}
}

public void verify_TemplateNumber_textbox_Status(String data){
		//Verifies the Status of the TemplateNumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TemplateNumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TemplateNumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TemplateNumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TemplateNumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TemplateNumber_textbox(String data){
		TemplateNumber_textbox.clear();
		TemplateNumber_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'value20::content')]")
	public static WebElement TemplateName_textbox;

public void verify_TemplateName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TemplateName_textbox.getAttribute("value"),data);
	}

}

public void verify_TemplateName_textbox_Status(String data){
		//Verifies the Status of the TemplateName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TemplateName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TemplateName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TemplateName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TemplateName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TemplateName_textbox(String data){
		TemplateName_textbox.clear();
		TemplateName_textbox.sendKeys(data);
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

@FindBy(how= How.XPATH, using = "//div[contains(@id,'tsap1:SPb')]")
	public static WebElement Done_button;

public void verify_Done_button_Status(String data){
		//Verifies the Status of the Done_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Done_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Done_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Done_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Done_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Done_button(){
		Done_button.click();
}

@FindBy(how= How.XPATH, using = "//a[contains(@id,'0:tsclconnum')]")
	public static WebElement TemplateNumberLink_hyperlink;

public void verify_TemplateNumberLink_hyperlink_Status(String data){
		//Verifies the Status of the TemplateNumberLink_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TemplateNumberLink_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TemplateNumberLink_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TemplateNumberLink_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TemplateNumberLink_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TemplateNumberLink_hyperlink(){
		TemplateNumberLink_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//a[contains(@id,'HomeApplicationPanel:ctb1::popEl')]")
	public static WebElement ActionsDrpDwn_button;

public void verify_ActionsDrpDwn_button_Status(String data){
		//Verifies the Status of the ActionsDrpDwn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ActionsDrpDwn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ActionsDrpDwn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ActionsDrpDwn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ActionsDrpDwn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ActionsDrpDwn_button(){
		ActionsDrpDwn_button.click();
}

@FindBy(how= How.XPATH, using = "//td[contains(text(),'Create Contract from Template')]")
	public static WebElement CreateContractFromTemplate_button;

public void verify_CreateContractFromTemplate_button_Status(String data){
		//Verifies the Status of the CreateContractFromTemplate_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CreateContractFromTemplate_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CreateContractFromTemplate_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CreateContractFromTemplate_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CreateContractFromTemplate_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CreateContractFromTemplate_button(){
		CreateContractFromTemplate_button.click();
}

@FindBy(how= How.ID, using = "DummyText_textbox")
	public static WebElement DummyText_textbox;

public void verify_DummyText_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(DummyText_textbox.getAttribute("value"),data);
	}

}

public void verify_DummyText_textbox_Status(String data){
		//Verifies the Status of the DummyText_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(DummyText_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(DummyText_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!DummyText_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!DummyText_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_DummyText_textbox(String data){
		DummyText_textbox.clear();
		DummyText_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//tr[@class='xep p_AFSelected']//td[@class='x12z']")
	public static WebElement SelectRowFromTable_button;

public void verify_SelectRowFromTable_button_Status(String data){
		//Verifies the Status of the SelectRowFromTable_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectRowFromTable_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectRowFromTable_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectRowFromTable_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectRowFromTable_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SelectRowFromTable_button(){
		SelectRowFromTable_button.click();
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}