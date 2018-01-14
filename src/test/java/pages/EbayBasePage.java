package pages;

import org.openqa.selenium.WebDriver;

public abstract class EbayBasePage {
    protected static WebDriver driver;
    public  EbayBasePage(WebDriver driver) {

        EbayBasePage.driver = driver;
    }
}