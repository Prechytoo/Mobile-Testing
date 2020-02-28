package MobileTesting.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileFramework {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("deviceName", "prechy");
		capabilities.setCapability("platformName", "Android");
		// package name of the app from apk inf app/
		capabilities.setCapability("appPackage", "com.facebook.lite");
		// this is launcher activity of the app from apk info app
		 capabilities.setCapability("appActivity", "com.facebook.lite.MainActivity");
		 capabilities.setCapability("automationName","UiAutomator2");
		 AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
		 return driver;
		
		 
		 
	

	}

}
