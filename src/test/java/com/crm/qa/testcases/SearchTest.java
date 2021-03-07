package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.MainPage;
import com.crm.qa.pages.SearchPage;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    MainPage mainPage;
    SearchPage searchPage;

    String searchTestData = "SearchTestData";

    public SearchTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        mainPage = new MainPage();
    }

    @DataProvider
    public Object[][] searchTestData() {
        Object data[][] = TestUtil.getTestData(searchTestData);
        return data;
    }

    @Test(priority = 1, description = "searchTest", dataProvider = "searchTestData")
    public void searchByKeywordTest(String keyword) {
        mainPage.clickSearchInputBtn();
        searchPage = mainPage.typeKeyword(keyword);
        Assert.assertTrue(this.searchPage.checkIfResultsContainKeyword());

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
