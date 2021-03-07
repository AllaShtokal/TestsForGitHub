package com.crm.qa.pages.logIn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

    @FindBy(xpath = "//header/div[7]")
    WebElement userIcon;

    @FindBy(linkText = "Settings")
    WebElement settingsMenuItem;


    // Initializing the Page Objects:
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickUserIconBtn() {
        userIcon.click();}

    public ProfilePage clickSettingsMenuItemBtn() {
        settingsMenuItem.click();

        return new ProfilePage();


    }

}
