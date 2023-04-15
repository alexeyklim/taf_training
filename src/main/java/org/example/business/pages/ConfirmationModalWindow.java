package org.example.business.pages;

import org.example.business.pages.filterpage.FiltersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class ConfirmationModalWindow extends HtmlElement {
    WebDriver driver;
    @FindBy(xpath = "//button[text() ='Delete']")
    private Button delete;

    @FindBy(xpath = "//button[text() ='Cancel']")
    private Button cancel;

    @FindBy(xpath = "//span[contains(@class, 'modal-title')]")
    private WebElement label;

    @FindBy(xpath = "//p[contains(@class, 'filterDeleteModal__message')]")
    private WebElement message;

    @FindBy(xpath = "//div[contains(@class, 'close-modal')]")
    private WebElement closeIcon;
    public ConfirmationModalWindow(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
    }
    public FiltersPage clickDelete() {
        delete.click();
        return new FiltersPage(driver);
    }






}
