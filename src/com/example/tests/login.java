package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.esteru.selenium.factory.WebDriverFactory;

public class login {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\AutomationTesting\\chromedriver_win32\\chromedriver.exe");
    driver = WebDriverFactory.getDriver(DesiredCapabilities.chrome());
    baseUrl = "http://vm-elender:63215/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled2() throws Exception {
    driver.get(baseUrl + "/Account/Login");
    driver.findElement(By.id("UserName")).clear();
    driver.findElement(By.id("UserName")).sendKeys("alex");
    driver.findElement(By.id("Password")).clear();
    driver.findElement(By.id("Password")).sendKeys("123456");
    driver.findElement(By.cssSelector("input.btn.btn-default")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
 
}
