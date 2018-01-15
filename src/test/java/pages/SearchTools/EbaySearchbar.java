package pages.SearchTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.EbayBasePage;

import java.util.List;

public class EbaySearchbar  extends EbayBasePage {
    public EbaySearchbar(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // @FindBy(how=How.ID, using="gh-shop-a")
    // public static WebElement searchByCategoryMenu;

    @FindBy(how=How.ID, using="gh-ac")
    private static WebElement searchFieldInput;

    @FindBy(how=How.NAME, using="_sacat")
    private static WebElement filterByCategoryDropDown;

    @FindBy(how=How.ID, using="gh-btn")
    private static WebElement searchButton;

    //@FindBy(how=How., using="")
    //public static WebElement;



    // filter by category
    public void FilterByCategory(String category) {
        Select categories = new Select(filterByCategoryDropDown);
        categories.selectByVisibleText(category);
    }

    // Perform search
    public void  SearchItem(String item) {
        searchFieldInput.sendKeys(item);
        searchButton.click();
    }


}