package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcePage extends TestBase {

    @FindBy(xpath = "//input[@id='field0']")
    WebElement fullNameInput;

    @FindBy(xpath = "//input[@id='field1']")
    WebElement emailAddressInput;

    @FindBy(xpath = "//input[@id='field2']")
    WebElement jobTitleInput;

    @FindBy(xpath = "//input[@id='field3']")
    WebElement companyNameInput;

    @FindBy(xpath = "//button[contains(text(),'Download')]")
    WebElement downloadBtn;

    public ResourcePage(){
        PageFactory.initElements(driver, this);

    }

    public void fillForm() {
        fullNameInput.sendKeys("Alla Shtokal");
        emailAddressInput.sendKeys("test@test.com");
        jobTitleInput.sendKeys("Programmer");
        companyNameInput.sendKeys("MyCompany");

    }

    public DownloadGuidePage clickOnDownloadBtn() {
        downloadBtn.click();
        while(driver.findElements(By.xpath("//input[@id='field0']")).size() > 0)
        {
            driver.navigate().refresh();
            fillForm();
            downloadBtn.click();

        }
        return new DownloadGuidePage();

    }





}
