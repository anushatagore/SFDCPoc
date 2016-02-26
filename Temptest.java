package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Temptest{
		
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "https://login.salesforce.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testTemptest() throws Exception {
	    driver.get("https://login.salesforce.com/");
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("anushatagore@gmail.com");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Vikas@123");
	    driver.findElement(By.id("Login")).click();
	    driver.findElement(By.linkText("Hotels")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_d6cd6e33-64a3-401f-9c6c-0719ffab775b|0| | ]]
	    driver.findElement(By.xpath("//input[@name='new']")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_ae950e8c-752d-4dd4-80ad-41dd71f8e7e5|0| | ]]
	    driver.findElement(By.id("Name")).clear();
	    driver.findElement(By.id("Name")).sendKeys("Sheraton");
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_ae950e8c-752d-4dd4-80ad-41dd71f8e7e5|0| | ]]
	    driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_ae950e8c-752d-4dd4-80ad-41dd71f8e7e5|0| | ]]
	    driver.findElement(By.id("setupLink")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_ae950e8c-752d-4dd4-80ad-41dd71f8e7e5|0| | ]]
	    driver.findElement(By.id("userNavButton")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_ae950e8c-752d-4dd4-80ad-41dd71f8e7e5|0| | ]]
	    driver.findElement(By.linkText("Logout")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}
