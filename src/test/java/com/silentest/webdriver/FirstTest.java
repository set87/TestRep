package com.silentest.webdriver;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {


	@Test
	public void startWebDriver() {
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.poppin.com/");
		Assert.assertTrue("http://www.poppin.com/",
                driver.getTitle().startsWith("dasdasdasd"));
		driver.close();
	}
}