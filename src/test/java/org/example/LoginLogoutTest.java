package org.example;

import org.example.business.enums.Messages;
import org.example.business.pages.loginpage.LoginPage;
import org.example.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class LoginLogoutTest extends BaseTest {

    @Test(groups = "debug")
    public void method() {
        Assert.assertTrue(baseReportPortalPage.messageIsPresent(Messages.LOGGED_IN));
        LoginPage loginPage = baseReportPortalPage.clickOnUserIcon().clickLogout();
        Assert.assertTrue(loginPage.messageIsPresent(Messages.LOGGED_OUT));
    }
}
