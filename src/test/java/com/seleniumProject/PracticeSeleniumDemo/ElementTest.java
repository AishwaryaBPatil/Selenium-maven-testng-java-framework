package com.seleniumProject.PracticeSeleniumDemo;

import java.util.List;

import org.testng.annotations.Test;

public class ElementTest extends BaseClass {
	
	@Test
	public void check_valid_text_box() throws InterruptedException
	{
		Element e=new Element(driver);
		e.validTextBox();
		
	}
	@Test
	public void check_valid_checkbox() throws InterruptedException
	{
		Element e=new Element(driver);
		
		e.validcheckBox();
	}
	
	@Test
	public void check_valid_frame() throws InterruptedException
	{
		Element e=new Element(driver);
		
		e.handleFrame();
	}
	
	@Test
	public void check_valid_webtable() throws InterruptedException
	{
		Element e=new Element(driver);
		
		e.handlewebtable();
//		List<String> data = e.getAllRows();
//
//        for (String row : data) {
//
//            System.out.println(row);
//
//        }
	}
	
	

}
