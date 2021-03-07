package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.MainPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class MouseHoverTest extends TestBase {
    MainPage mainPage;

    public MouseHoverTest() {super();}

    @BeforeMethod
    public void setUp(){
        initialization();
        mainPage = new MainPage();
    }

    @Test(priority=1, description = "1. Why GitHub Menu Item:")
    public void hoverWhyGitHubMenuItemTest() throws IOException {
        mainPage.clickWhyGitHubMenuItem();
        takeScreenshot("hoverWhyGitHubMenuItemTest");
        Assert.assertTrue (mainPage.checkWhyGitHubBlockIsDisplayed() || false);

    }

    @Test(priority=1, description = "2. Explore Menu Item:")
    public void hoverExploreMenuItemTest() throws IOException {
        mainPage.clickExploreMenuItem();
        takeScreenshot("hoverExploreMenuItemTest");
        Assert.assertTrue (mainPage.checkExploreBlockIsDisplayed()|| false);

    }

    @Test(priority=1, description = "3. Pricing Menu Item:")
    public void hoverPricingMenuItemTest() throws IOException {
        mainPage.clickPricingMenuItem();
        takeScreenshot("hoverPricingMenuItemTest");
        Assert.assertTrue (mainPage.checkPricingBlockIsDisplayed()|| false);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
