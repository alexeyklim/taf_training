package org.example.business.pages;

import org.example.business.enums.Messages;
import org.example.business.pages.filterpage.FiltersPage;
import org.example.business.pages.loginpage.LoginPage;
import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseReportPortalPage extends BasePage {


    @FindBy(xpath = "//ap[contains(@href, 'filters')]")
    private WebElement filterIconButton;

    @FindBy(xpath = "//img[contains(@class, 'userBlock__avatar')]")
    private UserBlockMenu userMenu;

    public BaseReportPortalPage(WebDriver driver) {
        super(driver);
    }

    public FiltersPage clickOnFilterIcon() {
        filterIconButton.click();
        return new FiltersPage(driver);
    }



    public UserBlockMenu clickOnUserIcon() {
        userMenu.click();
        return new UserBlockMenu(driver);
    }
}

