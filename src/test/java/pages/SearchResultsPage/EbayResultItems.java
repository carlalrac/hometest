package pages.SearchResultsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.EbayBasePage;

public class EbayResultItems extends EbayBasePage {
    public EbayResultItems(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(how=How.ID, using="ResultSetItems")
    private static WebElement results;

    public WebElement ResultItem(String itemNumber) {
       return driver.findElement(By.xpath("//ul[@id='ListViewInner']/li[@r='"+ itemNumber + "']"));
    }


}

