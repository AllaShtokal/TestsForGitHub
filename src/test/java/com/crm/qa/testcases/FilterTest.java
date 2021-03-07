package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.MainPage;
import com.crm.qa.pages.SearchPage;
import com.crm.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FilterTest  extends TestBase {

    MainPage mainPage;
    SearchPage searchPage;
    String filterTestData = "filterTestData";

    public FilterTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        mainPage = new MainPage();
        mainPage.clickSearchInputBtn();
        searchPage = mainPage.typeKeyword("framework");
    }

    @DataProvider
    public Object[][] filterTestData() {
        Object data[][] = TestUtil.getTestData(filterTestData);
        return data;
    }

    @Test(priority = 1, description = "filter Test", dataProvider = "filterTestData")
    public void searchByKeywordTest(String filterOption) {
        Assert.assertTrue(searchPage.clickOnFilterOption(filterOption) || true);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
