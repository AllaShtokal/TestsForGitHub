package com.crm.qa.pages.logIn;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage extends TestBase {


    @FindBy(xpath = "//a[contains(text(),'Download whitepaper')]")
    WebElement downloadBtn;


    public SettingsPage() {
        PageFactory.initElements(driver, this);
    }





}
