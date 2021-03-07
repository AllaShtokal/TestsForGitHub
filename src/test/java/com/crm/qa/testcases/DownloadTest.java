package com.crm.qa.testcases;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class DownloadTest extends TestBase {

    MainPage mainPage;
    DownloadGuidePage downloadGuidePage;

    public DownloadTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        mainPage = new MainPage();
    }

    @Test(priority = 1, description = "Download guide test")
        public void downloadGuideTest() throws IOException {
        downloadGuidePage = mainPage.navigateToDownloadPage();
        takeScreenshot("downloadGuideTest");
        Assert.assertEquals(downloadGuidePage.clickDownloadBtn(),
                "https://resources.github.com/downloads/GitHubAdvanced%20SecurityEbook.pdf");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
