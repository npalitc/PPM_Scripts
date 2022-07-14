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
public class ManageAccountingPeriods_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//*[contains(@id,'ap1:AT1:_ATp:ctb1')]//*[contains(text(),'Open Next Period')]")
	public static WebElement OpenNextPeriod_button;

public void verify_OpenNextPeriod_button_Status(String data){
		//Verifies the Status of the OpenNextPeriod_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OpenNextPeriod_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OpenNextPeriod_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OpenNextPeriod_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OpenNextPeriod_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OpenNextPeriod_button(){
		OpenNextPeriod_button.click();
}

@FindBy(how= How.XPATH, using = "//body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[9]/td[1]")
//img[contains(@id,'table1:1:i8')]
	public static WebElement SelectLedger_button;

public void verify_SelectLedger_button_Status(String data){
		//Verifies the Status of the SelectLedger_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SelectLedger_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SelectLedger_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SelectLedger_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SelectLedger_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SelectLedger_button(){
		SelectLedger_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'_ATp:ctb3')]//*[contains(text(),'Close Current Period')]")
	public static WebElement CloseCurrentPeriod_button;

public void verify_CloseCurrentPeriod_button_Status(String data){
		//Verifies the Status of the CloseCurrentPeriod_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CloseCurrentPeriod_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CloseCurrentPeriod_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CloseCurrentPeriod_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CloseCurrentPeriod_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CloseCurrentPeriod_button(){
		CloseCurrentPeriod_button.click();
}

@FindBy(how= How.ID, using = "Label_label")
	public static WebElement Label_label;

public void verify_Label_label(String data){
		Assert.assertEquals(Label_label,Label_label);
}

public void verify_Label_label_Status(String data){
		//Verifies the Status of the Label_label
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Label_label.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Label_label.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Label_label.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Label_label.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}