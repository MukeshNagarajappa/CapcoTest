package com.capco.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Baseclass {

	public static AppiumDriver driver;
	public static String DeviceType = "Android"; 
	
	{
		if(DeviceType.contains("Android"))
	{
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "32005a08c0c9c51b");
		caps.setCapability("platformversion", "10");
		caps.setCapability("app", "/Users/mukeshnagarajappa/Downloads/OI Shopping list_v2.2.0_apkfab.com.apk");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("noReset", "true");
		caps.setCapability("fullReset", "false");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("autoGrantPermissions", "true");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("appActvity", "org.openintents.shopping.ShoppingActivity");
		caps.setCapability("appPackage", "org.openintents.shopping");

		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
  }
}
