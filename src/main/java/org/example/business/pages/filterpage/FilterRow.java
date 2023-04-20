package org.example.business.pages.filterpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class FilterRow extends HtmlElement {

    private WebDriver driver;

    @FindBy(xpath = ".//span[contains(@class, 'filterName__link')]")
    public WebElement filterName;

    @FindBy(xpath = ".//p[contains(@class, 'filterOptions')]")
    public WebElement options;

    @FindBy(xpath = ".//div[contains(@class,'filterGrid__owner-col')]")
    public WebElement owner;

    @FindBy(xpath = ".//div[contains(@class,'shareFilter__shared')]")
    public WebElement shared;

    @FindBy(xpath = ".//span[contains(@class,'inputSwitcher__children')]")
    public WebElement displayOnLaunches;

    @FindBy(xpath = ".//div[contains(@class,'deleteFilterButton')]")
    public WebElement delete;

    public String getFilterName() {
        return filterName.getText();
    }

    public String getOptions() {return options.getText(); }

    public void deleteFilter() throws InterruptedException {
        delete.click();
        Thread.sleep(1000);
    }



}
