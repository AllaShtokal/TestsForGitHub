package com.crm.qa.testcases;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CareersPage;
import com.crm.qa.pages.MainPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoadDataTest extends TestBase {

    MainPage mainPage;
    CareersPage careersPage;

    public LoadDataTest() {super();}

    @BeforeMethod
    public void setUp(){
        initialization();
        mainPage = new MainPage();
    }

    @Test(priority=1, description = "load open career positions test")
    public void loadAllOpenPositions()
    {
        careersPage = mainPage.clickCareersBtn();
        careersPage.writeIntoFile(careersPage.showAllPositions());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
