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
public class EditTaskDetails_Page extends PageObjectBase{
@FindBy(how= How.LINK_TEXT, using = "Setup")
	public static WebElement Setup_hyperlink;

public void verify_Setup_hyperlink_Status(String data){
		//Verifies the Status of the Setup_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Setup_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Setup_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Setup_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Setup_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Setup_hyperlink(){
		Setup_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'BillableFlag::Label0')]")
	public static WebElement Billable_checkbox;

public void verify_Billable_checkbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Billable_checkbox.getAttribute("value"),data);
	}

}

public void verify_Billable_checkbox_Status(String data){
		//Verifies the Status of the Billable_checkbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Billable_checkbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Billable_checkbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Billable_checkbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Billable_checkbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Billable_checkbox(String data){
		if(Billable_checkbox.isSelected());
			Billable_checkbox.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'WorkTypeId::content')]")
	public static WebElement WorkType_dropdown;

public void verify_WorkType_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(WorkType_dropdown.getAttribute("value"),data);
	}

}

public void verify_WorkType_dropdown_Status(String data){
		//Verifies the Status of the WorkType_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(WorkType_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(WorkType_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!WorkType_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!WorkType_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_WorkType_dropdown(String data){
		Select dropdown= new Select(WorkType_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'ServiceTypeCode::content')]")
	public static WebElement ServiceType_dropdown;

public void verify_ServiceType_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ServiceType_dropdown.getAttribute("value"),data);
	}

}

public void verify_ServiceType_dropdown_Status(String data){
		//Verifies the Status of the ServiceType_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ServiceType_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ServiceType_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ServiceType_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ServiceType_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_ServiceType_dropdown(String data){
		Select dropdown= new Select(ServiceType_dropdown);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'pt1:ap1:APscl2')]")
	public static WebElement SaveAndClose_button;

public void verify_SaveAndClose_button_Status(String data){
		//Verifies the Status of the SaveAndClose_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SaveAndClose_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SaveAndClose_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SaveAndClose_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SaveAndClose_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SaveAndClose_button(){
		SaveAndClose_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'inputText2::content')]")
	public static WebElement TaskName_textbox;

public void verify_TaskName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TaskName_textbox.getAttribute("value"),data);
	}

}

public void verify_TaskName_textbox_Status(String data){
		//Verifies the Status of the TaskName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TaskName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TaskName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TaskName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TaskName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TaskName_textbox(String data){
		TaskName_textbox.clear();
		TaskName_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'inputText1::content')]")
	public static WebElement TaskNumber_textbox;

public void verify_TaskNumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TaskNumber_textbox.getAttribute("value"),data);
	}

}

public void verify_TaskNumber_textbox_Status(String data){
		//Verifies the Status of the TaskNumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TaskNumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TaskNumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TaskNumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TaskNumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_TaskNumber_textbox(String data){
		TaskNumber_textbox.clear();
		TaskNumber_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'TDtlFl1:0:name1Id::content')]")
	public static WebElement Organization_textbox;

public void verify_Organization_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Organization_textbox.getAttribute("value"),data);
	}

}

public void verify_Organization_textbox_Status(String data){
		//Verifies the Status of the Organization_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Organization_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Organization_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Organization_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Organization_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Organization_textbox(String data){
		Organization_textbox.clear();
		Organization_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'ap1:PPd::content')]")
	public static WebElement Description_textbox;

public void verify_Description_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Description_textbox.getAttribute("value"),data);
	}

}

public void verify_Description_textbox_Status(String data){
		//Verifies the Status of the Description_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Description_textbox(String data){
		Description_textbox.clear();
		Description_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'TDtlFl1:0:id1::content')]")
	public static WebElement StartDate_textbox;

public void verify_StartDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(StartDate_textbox.getAttribute("value"),data);
	}

}

public void verify_StartDate_textbox_Status(String data){
		//Verifies the Status of the StartDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(StartDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(StartDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!StartDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!StartDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_StartDate_textbox(String data){
		StartDate_textbox.clear();
		StartDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'TDtlFl1:0:id2::content')]")
	public static WebElement EndDate_textbox;

public void verify_EndDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(EndDate_textbox.getAttribute("value"),data);
	}

}

public void verify_EndDate_textbox_Status(String data){
		//Verifies the Status of the EndDate_textbox
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'pt1:ap1:cb5')]")
	public static WebElement Save_button;

public void verify_Save_button_Status(String data){
		//Verifies the Status of the Save_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Save_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Save_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Save_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Save_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Save_button(){
		Save_button.click();
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'pt1:ap1:soc3::content')]")
	public static WebElement TaskNum_dropdown;

public void verify_TaskNum_dropdown(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TaskNum_dropdown.getAttribute("value"),data);
	}

}

public void verify_TaskNum_dropdown_Status(String data){
		//Verifies the Status of the TaskNum_dropdown
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TaskNum_dropdown.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TaskNum_dropdown.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TaskNum_dropdown.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TaskNum_dropdown.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_TaskNum_dropdown(String data){
		Select dropdown= new Select(TaskNum_dropdown);
		 dropdown.selectByVisibleText(data);
}

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}