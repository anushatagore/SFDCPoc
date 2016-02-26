package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome {
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
  public void testChrome() throws Exception {
    driver.get("https://login.salesforce.com/");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_6f5c5d11-38c1-4afb-ba19-dd0f581a7ba1|4| | ]]
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("anushatagore@gmail.com");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_6f5c5d11-38c1-4afb-ba19-dd0f581a7ba1|4| | ]]
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("Vikas@123");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_6f5c5d11-38c1-4afb-ba19-dd0f581a7ba1|4| | ]]
    driver.findElement(By.id("Login")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_6f5c5d11-38c1-4afb-ba19-dd0f581a7ba1|4| | ]]
    driver.findElement(By.linkText("Hotels")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_6f5c5d11-38c1-4afb-ba19-dd0f581a7ba1|4| | ]]
    driver.findElement(By.xpath("//td[2]/input")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_2d371f43-51f2-4dbc-840d-28711a88b237|4| | ]]
    driver.findElement(By.id("Name")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_2d371f43-51f2-4dbc-840d-28711a88b237|4| | ]]
    driver.findElement(By.id("Name")).clear();
    driver.findElement(By.id("Name")).sendKeys("Novotel");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_2d371f43-51f2-4dbc-840d-28711a88b237|4| | ]]
    driver.findElement(By.xpath("//td[2]/input")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_2d371f43-51f2-4dbc-840d-28711a88b237|4| | ]]
    driver.findElement(By.id("setupLink")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_2d371f43-51f2-4dbc-840d-28711a88b237|4| | ]]
    driver.findElement(By.id("userNavLabel")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=umps|AP2$00D28000000WbCF_00528000000OItC_02_2d371f43-51f2-4dbc-840d-28711a88b237|4| | ]]
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
