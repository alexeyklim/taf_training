package org.example.business.pages;

import org.example.business.pages.loginpage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class UserBlockMenu extends HtmlElement {

    @FindBy(xpath = "//button[text() ='Logout']")
    private WebElement logOut;

    @FindBy(xpath = "//button[text() ='API']")
    private WebElement api;

    WebDriver driver;
    UserBlockMenu(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPage clickLogout() {
        logOut.click();
        return new LoginPage(driver);
    }
}
