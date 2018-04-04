package utility;

import io.appium.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.*;
import java.net.URL;

public abstract class AppiumDriverBuilder<SELF, DRIVER extends AppiumDriver> {



	public static class AndroidDriverBuilder extends AppiumDriverBuilder<AndroidDriverBuilder, AndroidDriver> {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		public AndroidDriver build() {

			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("platformName", "android");
			capabilities.setCapability("app", "/Users/elderhuffman/Documents/gospel-living-alpha-20180330-1930.apk");
			capabilities.setCapability("deviceName", "98895432524f315a44");
			capabilities.setCapability("appActivity", "org.lds.gliv.ui.main.SplashActivity");
			capabilities.setCapability("appPackage", "org.lds.gliv.dev");


			return new AndroidDriver(capabilities);
		}
	}

	public abstract DRIVER build();

	public static AndroidDriverBuilder forAndroid() {
		return new AndroidDriverBuilder();
	}

}
