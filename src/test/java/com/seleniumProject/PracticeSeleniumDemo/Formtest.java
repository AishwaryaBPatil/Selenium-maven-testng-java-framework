package com.seleniumProject.PracticeSeleniumDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Formtest extends BaseClass {
	@Test
	public void validsubmitform()
	{
		Form f=new Form(driver);
		f.clickarrow();
		f.formfill();
		Assert.assertEquals(f.getFirstNameValue(),"aishwarya");
		Reporter.log("FirstName Textbox working fine",true);
		Assert.assertEquals(f.getLastNameValue(), "patil");
		Reporter.log("lastName textbox working fine",true);
		}
	
	@Test
	public void invalidsubmitform()
	{
		Form fo=new Form(driver);
		fo.clickarrow();
		fo.invalidinput(""," ","123");
		fo.submitbutton();
		 String msg = fo.getFirstValidationmessage();
		// String lastmsg=fo.getLastValidationmessage();
		// String emailmsg=fo.getemailvalidationmessage();

		    
		    Assert.assertTrue(msg.contains("fill out"));
		  //  Assert.assertTrue(lastmsg.contains("fill out"));
		  //  Assert.assertTrue(emailmsg.contains(" Please include an '@' in the email address. '123' is missing an '@'."));
		
	}

}
