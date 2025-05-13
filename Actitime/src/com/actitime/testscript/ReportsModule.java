package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ReportsModule extends BaseClass{
	@Test
public void createReport() {
	driver.findElement(By.linkText("REPORTS")).click();
	Reporter.log("createReport",true);
}
}
