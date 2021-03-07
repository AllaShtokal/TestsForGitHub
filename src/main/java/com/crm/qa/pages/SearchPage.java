package com.crm.qa.pages;
import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends TestBase {

    @FindBy(tagName = "em")
    List<WebElement> saveBtn;


    @FindBy(xpath = "//body/div[4]/main[1]/div[1]/div[3]/div[1]/div[2]/details[1]/summary[1]")
    WebElement selectedOption;

    @FindBy(xpath = "//body/div[4]/main[1]/div[1]/div[3]/div[1]/div[2]/details[1]/details-menu[1]")
    WebElement listMenu;


    //Initializing the Page Objects:
    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean checkIfResultsContainKeyword() {
        return saveBtn.size() > 10;
    }

    public void clickOnDropDownMenu()
    {
        while (!listMenu.isDisplayed()){
        if(selectedOption.isEnabled())
        selectedOption.click();}

    }

    public String clickOnSortOption(String sortOption) {

        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + sortOption + "')]"));
        if(element.isDisplayed()) element.click();
        return selectedOption.getText();
    }

    public Boolean clickOnFilterOption(String filterOption) {

        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'" + filterOption + "')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        element.click();
        return driver.getCurrentUrl().contains(filterOption);

    }
}
