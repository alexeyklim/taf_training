package org.example.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WaitUtils {
    private final WebDriver webDriver;

    public WaitUtils(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


    public Boolean isElementPresent(final WebElement element) {
        try {
            webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            return element.isDisplayed();
        } catch (final Exception e) {
            return false;
        }
    }
}
