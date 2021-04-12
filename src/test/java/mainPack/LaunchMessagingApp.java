package mainPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchMessagingApp {
	
	public static AndroidDriver<?> driver;

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName","emulator-5554");
		cap.setCapability("platformVersion","9");
		cap.setCapability("platformName","Android");
		cap.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");
		cap.setCapability("appPackage", "com.google.android.apps.messaging");
		cap.setCapability("autoLaunch", true);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 500);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElement(By.id("com.google.android.apps.messaging:id/start_new_conversation_button")).click();
		driver.quit();

	}

}
