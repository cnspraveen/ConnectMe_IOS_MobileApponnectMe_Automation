package com.ConnectMe.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;


public class ConnectMeLaunch 
{
	DesiredCapabilities capabilities =null;
	IOSDriver driver = null;
	
	
	
	@BeforeMethod()
	public void sConnectMeAppLaunch() throws MalformedURLException
	{
		capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.2"); //10.2
		capabilities.setCapability("deviceName","iPhone 6s Plus");
		capabilities.setCapability(MobileCapabilityType.APP,"/Users/joker/Library/Developer/Xcode/DerivedData/ConnectMe-fydgaptdfhphpsbongegczahdiym/Build/Products/Debug-iphonesimulator/ConnectMe.app");
		//Old Instance
		//capabilities.setCapability(MobileCapabilityType.APP,"/Users/joker/Library/Developer/Xcode/DerivedData/ConnectMe_Mobile-dbgfjgmudpquvhcocptonzmldhxd/Build/Products/Debug-iphonesimulator/ConnectMe Mobile.app");
		
	//New Instance(Not Working)
		//capabilities.setCapability(MobileCapabilityType.APP,"/Users/joker/Library/Developer/Xcode/DerivedData/ConnectMe-fydgaptdfhphpsbongegczahdiym/Build/Products/Debug-iphoneos/ConnectMe.app");	
	//Device Configuration
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.2.1(14D27)"); //10.2
		//capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 7 ConnectMe");
		//capabilities.setCapability(MobileCapabilityType.APP,"/Users/joker/Library/Developer/Xcode/DerivedData/ConnectMe_Mobile-dbgfjgmudpquvhcocptonzmldhxd/Build/Products/Debug-iphonesimulator/ConnectMe Mobile.app");
		
	    driver=new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);  //127.0.0.1
		driver.manage().timeouts().implicitlyWait(66,TimeUnit.SECONDS);
	}
	
	
	@Test()
		public void test() throws MalformedURLException, InterruptedException 
		{
		    Thread.sleep(11000);
	        System.out.println("User logging into ConnectMe app");
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")).sendKeys("hgopalakrishnan@deloitte.connectme.pdevusip");
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]")).sendKeys("qwerty@123");
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")).click();
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")).click();
	        System.out.println("Login Successful");
	        Thread.sleep(11000);
	        
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
	                                     //

	        Thread.sleep(3000);
	        driver.findElement(By.xpath(" //XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[8]/XCUIElementTypeButton[1]")).click();
	        Thread.sleep(5000);
	        //driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
	        driver.findElement(By.id("Knowledge Articles")).click();
	        String ST = driver.findElement(By.id("No Articles Found")).getText();
	        System.out.println("Text in search result is :" + ST);
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
	        Thread.sleep(3000);
	        driver.tap(1, 326, 32, 2);
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField[1]")).sendKeys("comp");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeLink[1]/XCUIElementTypeStaticText[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
	        Thread.sleep(3000);
	        //Click on More button
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
	        Thread.sleep(3000);
	        //driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")).click();
	        //driver.findElement(By.id("{{'Mobile_Logout' |translate}}")).click();
	        driver.tap(1, 195, 120, 2);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")).click();
			//driver.quit();
	        //Assert.assertEquals(ST, "No Articles Foun");
	}		
}
