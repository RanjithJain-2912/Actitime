package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("testCreateCustomer",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTasksTab();
//		FileLib f=new FileLib();
//		String name = f.getExcelData("CreateCustomer", 1, 2);
//		String desc = f.getExcelData("CreateCustomer", 1, 3);
//		TaskListPage t=new TaskListPage(driver);
//		t.getAddNewBtn().click();
//		t.getCreateNewCustomerBtn().click();
//		t.getCustomerNameTbx().sendKeys(name);
//		t.getCustomerDescTbx().sendKeys(desc);
//		t.getCompanyDropdown().click();
//		t.getOurCompanyOption().click();
//		t.getCreateCustButton().click();
//		String actualText =t.getDisplayText().getText();
//		boolean res = actualText.contains(name);
//		Assert.assertTrue(res);
//		String exp="Customer '"+name+"' has been created";
//		Assert.assertEquals(actualText, exp);
	}
}
