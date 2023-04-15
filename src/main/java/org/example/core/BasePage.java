package org.example.core;

import org.example.business.enums.Messages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    @FindBy(xpath = "//div[contains(@class, 'notificationItem__message-container')]")
    private List<WebElement> messages;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }

    public List<String> getMessages() {
        List<String> infoMessages = new ArrayList<>();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElements(messages));
        for(WebElement webElement :messages) {
            infoMessages.add(webElement.getText());
        }
        return infoMessages;
    }

    public Boolean messageIsPresent(Messages message) {
        for(String msg: getMessages()) {
            msg.contains(message.getMessage());
            return true;
        }
        return false;
    }
}
