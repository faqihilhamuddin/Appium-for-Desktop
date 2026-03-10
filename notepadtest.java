package com.test;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class notepadtest {
    public static void main(String[] args) throws Exception {
    DesiredCapabilities cap = new DesiredCapabilities();
    cap.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
    cap.setCapability("platformName", "Windows");
    cap.setCapability("deviceName", "WindowsPC");


    URL url = new URL("http://127.0.0.1:4723");
    
    
    org.openqa.selenium.remote.HttpCommandExecutor executor = 
        new org.openqa.selenium.remote.HttpCommandExecutor(new java.util.HashMap<>(), url);
    
    RemoteWebDriver driver = new RemoteWebDriver(executor, cap);

    System.out.println("notepad");
    Thread.sleep(5000);
    driver.quit();
}
}
