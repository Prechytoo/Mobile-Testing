package MobileTesting.MobileTesting;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;

public class chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AndroidDriver driver;
	

	}
	
	@BeforeSuite
	public void test1_launch_Package(){
		
		 String activity="com.android.browser.BrowserActivity";
	    	String package_name="com.android.browser";
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	    	
	    	  capabilities.setCapability("deviceName","Emulator-Facebook:5554");
	    	  capabilities.setCapability("platformName","Android");
	    	  capabilities.setCapability("CapabilityType.BROWSER_NAME", "Android");
	          capabilities.setCapability("appPackage", package_name);
	          capabilities.setCapability("appActivity", activity);
	    	  capabilities.setCapability("automationName","UiAutomator1");
	    	  
	    	 // driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  	//	driver.launchApp();
	  		System.out.println("app launched");
		
	}

}
