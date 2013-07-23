package com.silentest.webdriver;


import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
    @Test
    public void startWebDriver(){
      WebDriver driver = new FirefoxDriver();
      driver.navigate().to("");

        Assert.assertTrue("some",
                driver.getTitle().startsWith());
    }

}
