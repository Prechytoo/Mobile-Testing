package MobileTesting.MobileTesting;


import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FacebookTest {

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
		capabilities.setCapability("appPackage", "com.facebook.lite");
		// this is launcher activity of the app from apk info app
		 capabilities.setCapability("appActivity", "com.facebook.lite.MainActivity");
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

		// Open url
		//driver.get("http://www.facebook.com");

	}

	@Test
	public void login() throws InterruptedException {
		
	
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[1]");
		el1.sendKeys("0715515326");
		System.out.println("username accepted");
		//Thread.sleep(2000);
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.MultiAutoCompleteTextView[2]");
		el2.sendKeys("tshabalalaprecious");
		System.out.println("password accepted");
		//Thread.sleep(2000);
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]");
		el3.click();
		System.out.println("login button clicked");
		 Thread.sleep(2000);
		 
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]");
		el4.click();
		System.out.println("not now button clicked ");
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]");
		el5.click();
		System.out.println("skip option button clicked");
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/X.0FD/android.view.ViewGroup[17]/android.view.ViewGroup[2]");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]");
		el8.click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void afterClass() throws InterruptedException {
		//Thread.sleep(5000);
		driver.quit();
	}

}
