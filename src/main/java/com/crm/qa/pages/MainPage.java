package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends TestBase {

    @FindBy(tagName="input")
    WebElement searchInput;

    //MenuItems:WhyGithub
    @FindBy(xpath = "//header/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/summary[1]")
    WebElement whyGitHubMenuItem;

    @FindBy(xpath="//header/div[1]/div[2]/nav[1]/ul[1]/li[1]/details[1]/div[1]")
    WebElement whyGitHubBlock;

    //MenuItems:Explore
    @FindBy(xpath = "//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/details[1]/summary[1]")
    WebElement exploreMenuItem;
    @FindBy(xpath="//header/div[1]/div[2]/nav[1]/ul[1]/li[4]/details[1]/div[1]")
    WebElement exploreBlock;

    //MenuItems:Pricing
    @FindBy(xpath = "//header/div[1]/div[2]/nav[1]/ul[1]/li[6]/details[1]/summary[1]")
    WebElement pricingMenuItem;

    @FindBy(xpath="//header/div[1]/div[2]/nav[1]/ul[1]/li[6]/details[1]/div[1]")
    WebElement pricingBlock;

    //careers
    @FindBy(xpath="//a[contains(text(),'Careers')]")
    WebElement careersBtn;

    //signin
    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    WebElement signInBtn;

    //Initializing the Page Objects:
    public MainPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickWhyGitHubMenuItem() {
        whyGitHubMenuItem.click();
    }

    public boolean checkWhyGitHubBlockIsDisplayed() {
        return whyGitHubBlock.isDisplayed();
    }

    public void clickExploreMenuItem() {
        exploreMenuItem.click();
    }

    public boolean checkExploreBlockIsDisplayed() {
        return exploreBlock.isDisplayed();
    }

    public void clickPricingMenuItem() {
        pricingMenuItem.click();
    }

    public boolean checkPricingBlockIsDisplayed() {
       return pricingBlock.isDisplayed();
    }

    public CareersPage clickCareersBtn() {

        careersBtn.click();
        return new CareersPage();
    }

    public SignInPage clickSignInBtn() {

        signInBtn.click();
        return new SignInPage();
    }

    public DownloadGuidePage navigateToDownloadPage() {

        driver.navigate().to("https://resources.github.com/whitepapers/Application-security-guide-thankyou/");

        return new DownloadGuidePage();
    }

    public void clickSearchInputBtn() {
        searchInput.click();
    }

    public SearchPage typeKeyword(String keyWord) {

        searchInput.sendKeys(keyWord);
        searchInput.sendKeys(Keys.RETURN);
        return new SearchPage();

    }







}
