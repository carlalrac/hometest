package pages.SearchTools;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.EbayBasePage;

import static org.junit.Assert.assertEquals;

public class EbaySortBy extends EbayBasePage {
    public EbaySortBy(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(how= How.ID, using="SortMenu")
    private static WebElement sortMenu;

    //@FindBy(how=How.CLASS_NAME, using="sel")
    //private static WebElement sortMenu;

    @FindBy(how= How.XPATH, using="//a[@class='btn btn-s btn-ter dropdown-toggle'] [@aria-controls='SortMenu']")
    private static WebElement visibleSort;

    public void  SelectBy(String choice) {
        // Using keys
        WebElement target = driver.findElement(By.linkText(choice));
        visibleSort.sendKeys(Keys.TAB);
        target.sendKeys(Keys.ENTER);
        //Using Actions
        WebElement targetaction = driver.findElement(By.linkText(choice));
        Actions action = new Actions(driver);
        action.moveToElement(visibleSort).perform();
        targetaction.click();

    }


    public void CheckSortedBy(String sortedBy) throws InterruptedException  {
        String actualSort = visibleSort.getAttribute("value");
        assertEquals(actualSort,sortedBy);
    }
}
