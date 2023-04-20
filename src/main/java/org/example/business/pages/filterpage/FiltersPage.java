package org.example.business.pages.filterpage;

import org.example.business.pages.ConfirmationModalWindow;
import org.example.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FiltersPage extends BasePage {

    @FindBy(xpath = ".//input[contains(@class, 'inputSearch')]")
    private WebElement searchTextField;

    @FindBy(xpath = ".//button[contains(@class, 'ghostButton')]")
    private WebElement addFilter;

    @FindBy(xpath = ".//div[contains(@class, 'gridRow__grid-row--')]")
    private List<FilterRow> table;

    public FiltersPage(WebDriver driver) {
        super(driver);
    }

    public void clickFilterButton() {
        addFilter.click();
    }

    public List<FilterRow> getTable() {
        return table;
    }

    public FiltersPage deleteFilterByName(String name) throws InterruptedException {

        for(FilterRow filterRow: table) {
            if (filterRow.getFilterName().equals(name)) {
                filterRow.deleteFilter();
                ConfirmationModalWindow confirmationModalWindow = new ConfirmationModalWindow(driver);
                confirmationModalWindow.clickDelete();
            }
        }
        return this;
    }
}
