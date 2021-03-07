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

public class SortTest extends TestBase {

    MainPage mainPage;
    SearchPage searchPage;

    String sortTestData = "sortTestData";

    public SortTest() {
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
    public Object[][] sortTestData() {
        Object data[][] = TestUtil.getTestData(sortTestData);
        return data;
    }

    @Test(priority = 1, description = "sort Test", dataProvider = "sortTestData")
    public void searchByKeywordTest(String sortType) {
        searchPage.clickOnDropDownMenu();
        String s = searchPage.clickOnSortOption(sortType);
        Assert.assertEquals(s, "Sort: "+ sortType);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
