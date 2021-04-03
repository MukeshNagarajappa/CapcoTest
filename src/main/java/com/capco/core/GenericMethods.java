package com.capco.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericMethods extends Baseclass{

	public static String DeviceType = "Android";
	
	public static String sendkeys(WebElement element,String data) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 8);
		try{	
			if(DeviceType.contains("Android"))
			{	
				element.clear();
				element.sendKeys(data);
				Thread.sleep(1000);
				try{
					//driver.hideKeyboard();
					//System.out.println("keyboard present");
				}
				catch(Exception e){
					//System.out.println("keyboard not present");
				}	
			}
			else
			{
				//System.out.println("ios send keys");
				element.clear();
				element.sendKeys(data);
				Thread.sleep(2000);
			//	driver.hideKeyboard();
				//driver.findElement(By.id("Done")).click();	
			}	
			return Constants.KEYWORD_PASS;
		}
		catch(Exception e)
		{
			System.out.println("Unable to find element: "+ element);
		}
		return Constants.KEYWORD_FAIL;
	}

	
	public static String sendkeysalert(WebElement element,String data) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOf(element)); 
		try{	
			if(DeviceType.contains("Android"))
			{	
				element.clear();
				element.sendKeys(data);
				driver.hideKeyboard();
			}
			else
			{
				System.out.println("ios send keys");
				element.clear();
				element.sendKeys(data);
				driver.hideKeyboard();
				Thread.sleep(200);
			}	
			System.out.println(element+":"+data);
			return Constants.KEYWORD_PASS;
		}
		catch(Exception e)
		{
			System.out.println("Unable to find element: "+ element);
		}
		return Constants.KEYWORD_FAIL;
	}
	
	
	public static String click(WebElement element){

		try{
			WebDriverWait wait = new WebDriverWait(driver, 8);
			wait.until(ExpectedConditions.visibilityOf(element)); 
			element.click();
			return Constants.KEYWORD_PASS;
		}
		catch(Exception e){
			System.out.println("Unable to find element: " +element);	
			
		}
		return Constants.KEYWORD_FAIL;
	}
	
	/*public static void scrollandroid(String scroll)    {

		try{
		
			driver.scrollTo(scroll);
			//return KEYWORD_PASS;
		}
		catch(Exception e){
			System.out.println("Unable to find text: " +scroll);
		}
		//return KEYWORD_FAIL;
	}*/
	
	
	public static String getstring(String value) {

		Properties prop = new Properties();
		InputStream input = null;
		String Value = null;

		try {
			input = new FileInputStream(Constants.capabalities);

			// load a properties file
			prop.load(input);

			Value = prop.getProperty(value);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Value;
	}
	
	
	public static void scrollios(String move){
		//down,up,left,right
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    HashMap<String, String> scrollObject = new HashMap<String, String>();
	    scrollObject.put("direction", move);
	    js.executeScript("mobile: scroll", scrollObject);	
	}
	
	/*public static void swipeHorizontal(AppiumDriver driver, int startPercentage, int finalPercentage, int anchorPercentage) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        new TouchAction(driver).press(startPoint, anchor).moveTo(endPoint, anchor).release().perform();
    }*/
	
	
}
