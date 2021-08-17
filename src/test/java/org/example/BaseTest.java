package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage{
    BrowserSelector browserSelector=new BrowserSelector();

    @BeforeMethod
    public void openBrowser(){
     browserSelector.openBrowser();
     driver.get("https://www.sainsburys.co.uk/");
    }
    @AfterMethod
    public void closerBrowser(){
        driver.quit();
    }
}
