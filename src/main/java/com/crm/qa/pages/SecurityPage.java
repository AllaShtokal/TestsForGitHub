package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SecurityPage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Download the guide')]")
    WebElement downloadBtn;

    public SecurityPage() {
        PageFactory.initElements(driver, this);
    }

    public ResourcePage clickOnDownloadBtn() {
        downloadBtn.click();
        return new ResourcePage();

    }
}
