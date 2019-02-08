package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeTest
	public void beforeTest()
	{
		DOMConfigurator.configure("log4j.xml");
	}
	@BeforeMethod
	public void before()
	{
		Logger log=Logger.getLogger(BaseTest.class);
		log.fatal("fatal");
		log.error("error");
		log.warn("warn");
		log.info("info");
		log.debug("debug");
		log.trace("trace");
	}
	
	
	

}
