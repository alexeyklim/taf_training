package org.example.business.pages.loginpage;

import org.example.business.pages.BaseReportPortalPage;
import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[contains(@name, 'login')]")
    private WebElement login;
    @FindBy(xpath = "//input[contains(@name, 'password')]")
    private WebElement pass;

    @FindBy(xpath = "//button[contains(@class, 'button')]")
    private WebElement buttonLogin;

    @FindBy(xpath = "//div[contains(@class, 'notificationItem__message-container')]")
    private List<WebElement> messages;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public BaseReportPortalPage login(String login, String password) {
        this.login.clear();
        this.login.sendKeys(login);
        this.pass.clear();
        this.pass.sendKeys(password);
        buttonLogin.click();
        return new BaseReportPortalPage(driver);
    }
}
