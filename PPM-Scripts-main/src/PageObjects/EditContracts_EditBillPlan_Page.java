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
public class EditContracts_EditBillPlan_Page extends PageObjectBase{
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

@FindBy(how= How.XPATH, using = "//*[contains(@id,'ap1:pd_showDetailItem3::disAcr')]")
	public static WebElement SchedulesandOverrides_hyperlink;

public void verify_SchedulesandOverrides_hyperlink_Status(String data){
		//Verifies the Status of the SchedulesandOverrides_hyperlink
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(SchedulesandOverrides_hyperlink.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(SchedulesandOverrides_hyperlink.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!SchedulesandOverrides_hyperlink.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!SchedulesandOverrides_hyperlink.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_SchedulesandOverrides_hyperlink(){
		SchedulesandOverrides_hyperlink.click();
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputComboboxListOfValues5')]")
	public static WebElement PRPerson_textbox;

public void verify_PRPerson_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PRPerson_textbox.getAttribute("value"),data);
	}

}

public void verify_PRPerson_textbox_Status(String data){
		//Verifies the Status of the PRPerson_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PRPerson_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PRPerson_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PRPerson_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PRPerson_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PRPerson_textbox(String data){
		PRPerson_textbox.clear();
		PRPerson_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'prRateCurrencyCodeId')]")
	public static WebElement PRCurrency_textbox;

public void verify_PRCurrency_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PRCurrency_textbox.getAttribute("value"),data);
	}

}

public void verify_PRCurrency_textbox_Status(String data){
		//Verifies the Status of the PRCurrency_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PRCurrency_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PRCurrency_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PRCurrency_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PRCurrency_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PRCurrency_textbox(String data){
		PRCurrency_textbox.clear();
		PRCurrency_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputText72')]")
	public static WebElement PRRate_textbox;

public void verify_PRRate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PRRate_textbox.getAttribute("value"),data);
	}

}

public void verify_PRRate_textbox_Status(String data){
		//Verifies the Status of the PRRate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PRRate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PRRate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PRRate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PRRate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PRRate_textbox(String data){
		PRRate_textbox.clear();
		PRRate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputDate17')]")
	public static WebElement PRStartDate_textbox;

public void verify_PRStartDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PRStartDate_textbox.getAttribute("value"),data);
	}

}

public void verify_PRStartDate_textbox_Status(String data){
		//Verifies the Status of the PRStartDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PRStartDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PRStartDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PRStartDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PRStartDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PRStartDate_textbox(String data){
		PRStartDate_textbox.clear();
		PRStartDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputDate18')]")
	public static WebElement PREndDate_textbox;

public void verify_PREndDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PREndDate_textbox.getAttribute("value"),data);
	}

}

public void verify_PREndDate_textbox_Status(String data){
		//Verifies the Status of the PREndDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PREndDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PREndDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PREndDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PREndDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PREndDate_textbox(String data){
		PREndDate_textbox.clear();
		PREndDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//a[contains(@id,'sdh9')]")
	public static WebElement ExpandPersonRateTable_button;

public void verify_ExpandPersonRateTable_button_Status(String data){
		//Verifies the Status of the ExpandPersonRateTable_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ExpandPersonRateTable_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ExpandPersonRateTable_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ExpandPersonRateTable_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ExpandPersonRateTable_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ExpandPersonRateTable_button(){
		ExpandPersonRateTable_button.click();
}

@FindBy(how= How.XPATH, using = "//img[contains(@id,'AT8:_ATp:create::icon')]")
	public static WebElement PRAddBtn_button;

public void verify_PRAddBtn_button_Status(String data){
		//Verifies the Status of the PRAddBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PRAddBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PRAddBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PRAddBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PRAddBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_PRAddBtn_button(){
		PRAddBtn_button.click();
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'ap1:AT6:_ATp:JAO:0:inputComboboxListOfValues2')]")
	public static WebElement JobNameOverride_textbox;

public void verify_JobNameOverride_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(JobNameOverride_textbox.getAttribute("value"),data);
	}

}

public void verify_JobNameOverride_textbox_Status(String data){
		//Verifies the Status of the JobNameOverride_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JobNameOverride_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JobNameOverride_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JobNameOverride_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JobNameOverride_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_JobNameOverride_textbox(String data){
		JobNameOverride_textbox.clear();
		JobNameOverride_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'ap1:sdh12::_afrDscl')]")
	public static WebElement ExpandJobAssignmentOverrides__button;

public void verify_ExpandJobAssignmentOverrides__button_Status(String data){
		//Verifies the Status of the ExpandJobAssignmentOverrides__button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ExpandJobAssignmentOverrides__button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ExpandJobAssignmentOverrides__button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ExpandJobAssignmentOverrides__button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ExpandJobAssignmentOverrides__button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ExpandJobAssignmentOverrides__button(){
		ExpandJobAssignmentOverrides__button.click();
}

@FindBy(how= How.XPATH, using = "//img[contains(@id,'ap1:AT6:_ATp:create::icon')]")
	public static WebElement JAAddBtn_button;

public void verify_JAAddBtn_button_Status(String data){
		//Verifies the Status of the JAAddBtn_button
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JAAddBtn_button.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JAAddBtn_button.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JAAddBtn_button.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JAAddBtn_button.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_JAAddBtn_button(){
		JAAddBtn_button.click();
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'ap1:AT6:_ATp:JAO:0:personNameId')]")
	public static WebElement JASearchName_textbox;

public void verify_JASearchName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(JASearchName_textbox.getAttribute("value"),data);
	}

}

public void verify_JASearchName_textbox_Status(String data){
		//Verifies the Status of the JASearchName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JASearchName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JASearchName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JASearchName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JASearchName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_JASearchName_textbox(String data){
		JASearchName_textbox.clear();
		JASearchName_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'jobNameId')]")
	public static WebElement JAJobName_textbox;

public void verify_JAJobName_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(JAJobName_textbox.getAttribute("value"),data);
	}

}

public void verify_JAJobName_textbox_Status(String data){
		//Verifies the Status of the JAJobName_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JAJobName_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JAJobName_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JAJobName_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JAJobName_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_JAJobName_textbox(String data){
		JAJobName_textbox.clear();
		JAJobName_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputText63')]")
	public static WebElement JABillingTitle_textbox;

public void verify_JABillingTitle_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(JABillingTitle_textbox.getAttribute("value"),data);
	}

}

public void verify_JABillingTitle_textbox_Status(String data){
		//Verifies the Status of the JABillingTitle_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JABillingTitle_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JABillingTitle_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JABillingTitle_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JABillingTitle_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_JABillingTitle_textbox(String data){
		JABillingTitle_textbox.clear();
		JABillingTitle_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputDate13')]")
	public static WebElement JAStartDate_textbox;

public void verify_JAStartDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(JAStartDate_textbox.getAttribute("value"),data);
	}

}

public void verify_JAStartDate_textbox_Status(String data){
		//Verifies the Status of the JAStartDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JAStartDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JAStartDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JAStartDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JAStartDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_JAStartDate_textbox(String data){
		JAStartDate_textbox.clear();
		JAStartDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'inputDate14')]")
	public static WebElement JAEndDate_textbox;

public void verify_JAEndDate_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(JAEndDate_textbox.getAttribute("value"),data);
	}

}

public void verify_JAEndDate_textbox_Status(String data){
		//Verifies the Status of the JAEndDate_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JAEndDate_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JAEndDate_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JAEndDate_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JAEndDate_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_JAEndDate_textbox(String data){
		JAEndDate_textbox.clear();
		JAEndDate_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'AT8:_ATp:PRO:0:inputComboboxListOfValues5')]")
	public static WebElement PRContractLineNumber_textbox;

public void verify_PRContractLineNumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PRContractLineNumber_textbox.getAttribute("value"),data);
	}

}

public void verify_PRContractLineNumber_textbox_Status(String data){
		//Verifies the Status of the PRContractLineNumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PRContractLineNumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PRContractLineNumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PRContractLineNumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PRContractLineNumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_PRContractLineNumber_textbox(String data){
		PRContractLineNumber_textbox.clear();
		PRContractLineNumber_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[contains(@id,'ap1:AT6:_ATp:JAO:0:inputComboboxListOfValues6')]")
	public static WebElement JAContractLineNumber_textbox;

public void verify_JAContractLineNumber_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(JAContractLineNumber_textbox.getAttribute("value"),data);
	}

}

public void verify_JAContractLineNumber_textbox_Status(String data){
		//Verifies the Status of the JAContractLineNumber_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(JAContractLineNumber_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(JAContractLineNumber_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!JAContractLineNumber_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!JAContractLineNumber_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_JAContractLineNumber_textbox(String data){
		JAContractLineNumber_textbox.clear();
		JAContractLineNumber_textbox.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//*[contains(@id,'APsv2')]")
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

public static void verify_Text(String data){
	Assert.assertTrue(driver.getPageSource().contains(data));
}
}