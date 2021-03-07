package com.crm.qa.pages.logIn;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Emails')]")
    WebElement emailsMenuItem;

    @FindBy(tagName = "h4")
    WebElement email;

    // Initializing the Page Objects:
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickEmailsMenuItem() {
        emailsMenuItem.click();
    }

    public String getEmail() {

        return email.getText();
    }

}
