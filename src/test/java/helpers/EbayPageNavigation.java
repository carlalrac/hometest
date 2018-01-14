package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.EbayBasePage;

import static org.junit.Assert.assertEquals;

public class EbayPageNavigation extends EbayBasePage {
    public EbayPageNavigation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how=How.ID, using="gh-topl")
    private static WebElement userBanner;
    @FindBy(how=How.CLASS_NAME, using="gh-ug-guest")
    private static WebElement guestUser;
    @FindBy(how=How.TAG_NAME, using="head")
    private static WebElement header;

    // Get the title of the page
    public String getPageHeadertitle() {
        return driver.getTitle();
    }

    // assert page title
    public void AssertPageTitle(String expectedTitle) {
        assertEquals(expectedTitle, driver.getTitle());
    }

}