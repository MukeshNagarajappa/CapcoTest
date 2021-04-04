package com.capco.stepDefs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class Test {
	
	public static AppiumDriver driver; 
	private static Logger Log = LogManager.getLogger(Test.class);

	@Given("^open the shopping list app in mobile device$")
	public void open_the_shopping_list_app_in_mobile_device() throws Throwable {
	    
		DesiredCapabilities caps = new DesiredCapabilities();
  
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","32005a08c0c9c51b");
        caps.setCapability("platformversion","10");
        caps.setCapability("app","/Users/mukeshnagarajappa/Downloads/OI Shopping list_v2.2.0_apkfab.com.apk");
        caps.setCapability("deviceOrientation","portrait");
        caps.setCapability("noReset", "true");
        caps.setCapability("fullReset", "false");
        caps.setCapability("skipUnlock", "true");
        caps.setCapability("autoGrantPermissions","true");
        caps.setCapability("automationName","uiautomator2");
        caps.setCapability("appActvity","org.openintents.shopping.ShoppingActivity"); 
        caps.setCapability("appPackage","org.openintents.shopping"); 
        
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	

	@Then("^click on hamburger icon$")
	public void click_on_hamburger_icon() throws Throwable {
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
		System.out.println("Clicked on Hamburger Menu");
	}

	@And("^Enter name of new shopping list$")
	public void Enter_name_of_new_shopping_list() throws Throwable {
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/"
				+ "android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.TextView[@index=1]")).click();
		Log.info("Clicked on New List tab");
		
	    driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
	    		+ "android.widget.LinearLayout/android.widget.EditText[@index=0]")).sendKeys("Groceries");
	    Log.info("Entered name for shopping list");
	}

	@Then("^click on OK button$")
	public void click_on_OK_button() throws Throwable {
		
		driver.findElement(By.id("android:id/button1")).click();
		Log.info("Clicked on Ok button");
		
	}

	@And("^Add new item to shopping List$")
	public void Add_new_item_to_shopping_Lists() throws Throwable {
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Ghee & Oils");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Toor Dal");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Milk Products");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
	    
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/"
				+ "android.view.ViewGroup/android.widget.ImageButton[@index=0]")).click();

		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/"
				+ "android.support.v4.widget.DrawerLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.TextView")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
	    		+ "android.widget.LinearLayout/android.widget.EditText")).sendKeys("Baby Care");
		
		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Himalaya");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Johnsons");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
		
	}

	@Then("^Delete item from the list$")
	public void delete_item_from_the_list() throws Throwable {
		
		driver.findElement(By.xpath("//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[1]//"
				+ "android.view.ViewGroup//android.widget.ImageButton[@index=0]")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout"
				+ "/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.TextView[@index=0]")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout"
				+ "/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]"
				+ "/android.widget.RelativeLayout[1]/android.widget.CheckBox[@index=0]")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup"
				+ "/android.support.v7.widget.LinearLayoutCompat/android.widget.ImageView[@index=1]")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView"
				+ "/android.widget.LinearLayout[4]")).click();

		driver.findElement(By.id("android:id/button1")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.view.ViewGroup//android.widget.FrameLayout[1]//"
				+ "android.view.ViewGroup//android.widget.ImageButton[@index=0]")).click();
	}
	
	@Then("^create new shopping list and sort the list items$")
	public void create_new_shopping_list_and_sort_the_list_items() throws Throwable {
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.ListView"
				+ "/android.widget.FrameLayout[2][@index=4]")).click();
		Log.info("Clicked on New List tab");
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Myntra");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Flipkart");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("Amazon");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
		
		driver.findElement(By.id("org.openintents.shopping:id/autocomplete_add_item")).sendKeys("PayTM");
		driver.findElement(By.id("org.openintents.shopping:id/button_add_item")).click();
	}
		
	@Then("^sort the items in the shopping list$")
	public void sort_the_items_in_the_shopping_list() throws Throwable {	
		
	    driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']")).click();
	    
	    driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView"
	    		+ "/android.widget.LinearLayout[2][@index=1]")).click();
	    
	    driver.findElement(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView"
	    		+ "/android.widget.LinearLayout[2][@index=2]")).click();
	    
	    driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"
	    		+ "/android.widget.ListView/android.widget.CheckedTextView[2]")).click();

	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']")).click();
		System.out.println("Clicked on Hamburger Menu");
		
		driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout"
				+ "/android.widget.ListView/android.widget.FrameLayout[2]/android.widget.TextView[@index=0]")).click();
	   
	    
	}
}
