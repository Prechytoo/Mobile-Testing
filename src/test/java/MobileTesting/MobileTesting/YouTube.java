package MobileTesting.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class YouTube {
	
	// WebDriver driver;

		AndroidDriver driver;

		@Before
		public void setUp() throws MalformedURLException, InterruptedException {

			// Set up desired capabilities and pass the andriod app-activity and app package
			// to appium
			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("BROWSER_NAME", "Android");
			capabilities.setCapability("platformVersion", "9");
			capabilities.setCapability("deviceName", "prechy");
			capabilities.setCapability("platformName", "Android");
			// package name of the app from apk inf app/
			capabilities.setCapability("appPackage", "com.google.android.youtube");
			// this is launcher activity of the app from apk info app
			 capabilities.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");
			 capabilities.setCapability("automationName","UiAutomator2");
			

			//File file = new File("C:\\Users\\nokuthula tenene\\eclipse-workspaceNew\\MobileTesting\\APK\\Facebook Lite_v165.0.0.5.120_apkpure.com.apk");
					
			//capabilities.setCapability("app", file.getAbsolutePath());
			//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			Thread.sleep(2000);

			// Create RemoteWebDriver instance and connect to the Appium server
			// It will launch the App in Android Device using the configurations specified
			// in Desired Capabilities
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.launchApp();
			System.out.println("app launched");
			Thread.sleep(2000);
		}
		
		
		@Test
		public void navigate () throws InterruptedException  {
			
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Search");
			el1.click();
			System.out.println("search licked");
			//Thread.sleep(2000);
			MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.youtube:id/search_edit_text");
			el2.sendKeys("CPUT");
			System.out.println("CPUT typed");
			//Thread.sleep(2000);
			MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");
			el3.click();
			System.out.println("Search Button Clicked");
			Thread.sleep(2000);
			MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el4.click();
			Thread.sleep(2000);
			MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Video");
			el5.click();
			Thread.sleep(2000);
			MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.youtube:id/permission_request_button");
			el6.click();
			Thread.sleep(2000);
			MobileElement el7 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
			el7.click();
			Thread.sleep(2000);
			MobileElement el8 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
			el8.click();
			Thread.sleep(20000);
			MobileElement el9 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
			el9.click();
			Thread.sleep(2000);
			MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el10.click();
			Thread.sleep(20000);
			MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup[3]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[2]");
			el11.click();
			Thread.sleep(20000);
			MobileElement el12 = (MobileElement) driver.findElementById("com.google.android.youtube:id/thumbnail");
			el12.click();
			Thread.sleep(20000);



		}
		
		
		@Test
		public void open_youtube () {
			driver.quit();
			
		}
		
	

		@AfterTest
		
		public void quit( ) {
			
		}
		
		
}
	
