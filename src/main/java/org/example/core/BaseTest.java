package org.example.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.business.pages.BaseReportPortalPage;
import org.example.business.pages.loginpage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    protected WebDriver webDriver;
    protected BaseReportPortalPage baseReportPortalPage;
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeMethod(alwaysRun = true)
    public void initWebDriver() throws IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", new File(ConfProperties.getProperty("chromedriver").replaceAll("//", File.separator)).getCanonicalPath());
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.get(ConfProperties.getProperty("reportportal"));
    }
    @BeforeMethod(alwaysRun = true, dependsOnMethods = "initWebDriver")
    public BaseReportPortalPage logIn() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.login(ConfProperties.getProperty("login"),ConfProperties.getProperty("password"));
        return new BaseReportPortalPage(webDriver);

    }

    @AfterClass(alwaysRun = true)
    public void killDriver() {
        webDriver.quit();
    }
}
