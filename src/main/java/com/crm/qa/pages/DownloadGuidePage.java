package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadGuidePage extends TestBase {

    @FindBy(xpath = "//a[contains(text(),'Download whitepaper')]")
    WebElement downloadBtn;

    //Initializing the Page Objects:
    public DownloadGuidePage(){
        PageFactory.initElements(driver, this);
    }


    public String clickDownloadBtn() {

        downloadBtn.click();
        Actions action= new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
        return downloadBtn.getAttribute("href");
    }
}
