package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class UserModule extends BaseClass{
	@Test
public void addUser() {
	Reporter.log("addUser",true);
	
}
}
