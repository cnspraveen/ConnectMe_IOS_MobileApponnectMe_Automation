package com.deloitte.ConnectMeLib;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baselib
{
	DesiredCapabilities capabilities = null;
	public static IOSDriver driver = null;
	static public String sCurDir = System.getProperty("user.dir");
	static public String PropFileNames = sCurDir +"/Config.properties";
	static public String ExcelFileNames = sCurDir +"/TestData.xlsx";
	static public String sScreenShotDir = sCurDir +"/screenshots";
	
	@BeforeMethod()
	public void appConnectMeLaunch() throws MalformedURLException
	{
		//capabilities = new 	DesiredCapabilities();
		/*capabilities.setCapability("automationName", GenericLib.readConfigPropFile(PropFileNames,"AUTOMATIONNAME"));
		capabilities.setCapability("platformName", GenericLib.readConfigPropFile(PropFileNames,"PLATFORMNAME"));
		capabilities.setCapability("platformVersion", GenericLib.readConfigPropFile(PropFileNames,"PLATFORMVERSION"));
		capabilities.setCapability("deviceName", GenericLib.readConfigPropFile(PropFileNames,"DEVICENAME"));
		capabilities.setCapability("App", GenericLib.readConfigPropFile(PropFileNames,"APP"));
		capabilities.setCapability("fullReset", GenericLib.readConfigPropFile(PropFileNames,"FullReset"));
		//capabilities.setCapability("bundleId", "com.ionicframework.connectme563508");*/
		capabilities = new 	DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, GenericLib.readConfigPropFile(PropFileNames,"AUTOMATIONNAME"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, GenericLib.readConfigPropFile(PropFileNames,"PLATFORMNAME"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, GenericLib.readConfigPropFile(PropFileNames,"PLATFORMVERSION"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, GenericLib.readConfigPropFile(PropFileNames,"DEVICENAME"));
		capabilities.setCapability(MobileCapabilityType.APP, GenericLib.readConfigPropFile(PropFileNames,"APP"));
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, GenericLib.readConfigPropFile(PropFileNames,"FullReset"));
		//capabilities.setCapability(MobileCapabilityType.b, GenericLib.readConfigPropFile(PropFileNames,"BundleId"));
		
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(111, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void appLogin() throws InterruptedException, MalformedURLException
	{
		System.out.println("User logging into ConnectMe IOS App");
		driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]")).sendKeys("hgopalakrishnan@deloitte.connectme.pdevusip");
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField[1]")).sendKeys("qwerty@123");
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")).click();
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")).click();
        System.out.println("Login Successful");
	
	    Thread.sleep(9000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(" //XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[8]/XCUIElementTypeButton[1]")).click();
        Thread.sleep(5000);
//driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
        driver.findElement(By.id("Knowledge Articles")).click();
        String ST = driver.findElement(By.id("No Articles Found")).getText();
        System.out.println("Text in search result is :" + ST);
        Thread.sleep(9000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();    //XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
        if(driver.findElement(By.name("No Search Results Found")).isDisplayed())
        {
          driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
          System.out.println("close the search field by clickng on X mark");
        }
        Thread.sleep(2000);
  //Click on Serach icon
        /*driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]")).click();
        Thread.sleep(3000);
        //Enter Comp string in Search field
        driver.findElement(By.xpath("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField[1]")).sendKeys("comp");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeLink[1]/XCUIElementTypeStaticText[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();

    /*    //driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[8]/XCUIElementTypeButton[1]")).click();
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[8]/XCUIElementTypeButton[1]")).click();
        WebElement RichText = driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));

        if(RichText.isEnabled() && RichText.getText().equals("rich text article"))

        {

        //Click on My Star/favourite icon    

        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]")).click();

        Thread.sleep(3000);

        //Click on My star/favouroite icon    

        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]")).click();

    //Click on back button    

        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));

    //Click on My favouroite button in More screen    

        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeOther[2]")).click();

        if(RichText.isDisplayed())
        {
        System.out.println("RichText is displayed");
        }
        else
        {
        System.out.println("RichText is not displayed");
        }
      } */
	
        
       //Support Actions: Ask a Question: 
      
  //click on Support tab :
      Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[13]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("Ask a Question")).click();
//searching for specfic KA    
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")).sendKeys("comp");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")).click();
//clicking on Specfic KA   
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[14]/XCUIElementTypeOther[1]/XCUIElementTypeLink[2]/XCUIElementTypeLink[1]/XCUIElementTypeStaticText[1]")).click();
 //click on Back button
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
 
 //click on Stiill need a help
        Thread.sleep(3000);
        driver.findElement(By.name("I Still Need Help")).click();
        
 // entering test in Message text field
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]")).sendKeys("Comp");
        Thread.sleep(3000);
// click on Submit Question
        driver.findElement(By.name("Submit Question")).click();
        Thread.sleep(3000);
       if(driver.findElement(By.name("You Have Successfully Asked A Question")).isDisplayed())
       {
    	   Thread.sleep(3000);
    	   if(driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).isDisplayed())
    			   {
    		   Thread.sleep(3000);
    		         String AskAQuestionId = driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeLink[1]/XCUIElementTypeStaticText[1]")).getText();
    			     System.out.println("Ask a question Request id is :" + AskAQuestionId);
    			     Thread.sleep(3000);
    			     driver.findElement(By.name("Done")).click();
    			   }
       }
        
       Thread.sleep(2000);
  //click on Request a Call Back
       Thread.sleep(3000);
       driver.findElement(By.name("Request a Call Back")).click();
  //Enter data in My Request form
       Thread.sleep(1000);
       driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")).sendKeys("9632358379");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]")).sendKeys("Test SF");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[6]/XCUIElementTypeButton[1]")).click();
 
       if(driver.findElement(By.name("You Have Successfully Submitted A Callback")).isDisplayed() && driver.findElement(By.name("Please expect a call back within a few business days")).isDisplayed())
       {
    	   Thread.sleep(3000);
    		         String RequestCallBackid = driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeLink[1]/XCUIElementTypeStaticText[1]")).getText();
    			     System.out.println("Ask a question Request id is :" + RequestCallBackid);
    	   Thread.sleep(3000);
    			     driver.findElement(By.name("Done")).click();
       }
        
       Thread.sleep(2000);
       
       driver.findElement(By.name("Call HR")).isEnabled();
       Thread.sleep(3000);
       driver.findElement(By.name("Call HR")).click();
       
       
       //Click on More button
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[14]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")).click();
        Thread.sleep(3000);
        //SoftAssert softassert = new SoftAssert();
        //softassert.assertEquals("User find article in predective search", "User have not find article in global search");
        //Assert.assertEquals("Ice is Nice", "Nice is Ice");
        //driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[15]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeStaticText[1]")).click();
        //driver.findElement(By.id("{{'Mobile_Logout' |translate}}")).click();
        driver.tap(1, 195, 120, 2);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")).click(); 
	}

	@AfterMethod()
	public void AppClose() throws InterruptedException
	{
		System.out.println("Closing");
		Thread.sleep(2000);
		driver.closeApp();
		//driver.quit();
	}
	}
