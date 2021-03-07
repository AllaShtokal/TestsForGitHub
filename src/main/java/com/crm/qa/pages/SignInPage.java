package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.logIn.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {

    //locators
    @FindBy(xpath = "//input[@id='login_field']")
    WebElement usernameInput;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//body/div[3]/main[1]/div[1]/div[4]/form[1]/input[14]")
    WebElement signInBtn;
    @FindBy(xpath = "//body/div[3]/main[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement warningMessage;

    //Initializing the Page Objects:
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    //methods
    public HomePage fillCredentialsAndClickBtn(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInBtn.click();
        return new HomePage();
    }

    public Boolean checkIfWarningMessageIsDisplayed() {
        return warningMessage.isDisplayed();
    }


}
