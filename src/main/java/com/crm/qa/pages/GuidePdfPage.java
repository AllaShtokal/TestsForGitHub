package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class GuidePdfPage extends TestBase {

    // Initializing the Page Objects:
    public GuidePdfPage() {
        PageFactory.initElements(driver, this);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
