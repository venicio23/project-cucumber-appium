package com.test;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    private static AppiumDriver<?> driver;

    public static AppiumDriver<?> validateDriver() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        File app = new File("apps/app-debug.apk");
        cap.setCapability("app", app.getAbsolutePath());
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Android Emulator");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;

    }

    public static AppiumDriver<?> getDriver(){
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
        }
    }

    @Before
    public void startProject() throws MalformedURLException {
        if(getDriver() != null){
            getDriver().launchApp();
        }else {
            validateDriver();
        }

    }
}
