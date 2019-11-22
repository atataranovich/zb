package com.solvd.carina.demo.utils;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.utils.StringGenerator;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;

public class DriverUtils implements IDriverPool {
	
	public WebDriver createDriver() {
		
		return createDriver(StringGenerator.generateNumeric(4), new DesiredCapabilities("chrome", "78", Platform.getCurrent()), "https://moon.zebrunner.com:4444/wd/hub");
	}


}
