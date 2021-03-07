package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.logIn.HomePage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.pages.SignInPage;
import com.crm.qa.pages.logIn.ProfilePage;
import com.crm.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {

    MainPage mainPage;
    SignInPage signInPage;
    ProfilePage profilePage;
    HomePage homePage;
    String validCredentialsSheet = "signInWithValidCredentials";
    String inValidCredentialsSheet = "signInWithInvalidCredentials";
    public SignInTest() {super();}
    @BeforeMethod
    public void setUp(){
        initialization();
        mainPage = new MainPage();
    }
    @DataProvider
    public Object[][] signInWithValidCredentialsData(){
        Object data[][] = TestUtil.getTestData(validCredentialsSheet);
        return data;
    }
    @DataProvider
    public Object[][] signInWithInValidCredentialsData(){
        Object data[][] = TestUtil.getTestData(inValidCredentialsSheet);
        return data;
    }
    @Test(priority=1, description = "signin valid credentials Test", dataProvider="signInWithValidCredentialsData")
    public void signInTestWithValidCredentials(String username, String password) {
        signInPage = mainPage.clickSignInBtn();
        homePage = signInPage.fillCredentialsAndClickBtn(username, password);
        homePage.clickUserIconBtn();
        profilePage = homePage.clickSettingsMenuItemBtn();
        profilePage.clickEmailsMenuItem();
        Assert.assertEquals(profilePage.getEmail(), username);
    }
    @Test(priority=1, description = "signin invalid credentials Test", dataProvider="signInWithInValidCredentialsData")
    public void signInTestWithInValidCredentials(String username, String password) {
        signInPage = mainPage.clickSignInBtn();
        signInPage.fillCredentialsAndClickBtn(username, password);
        Assert.assertTrue(signInPage.checkIfWarningMessageIsDisplayed());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
