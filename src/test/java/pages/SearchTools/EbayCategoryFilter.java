package pages.SearchTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.EbayBasePage;

import java.util.List;

public class EbayCategoryFilter extends EbayBasePage {
    public EbayCategoryFilter(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.NAME, using="_sacat")
    private static WebElement categoryFilter;


    public void SelectCategory(String category){
        Select categories = new Select(categoryFilter);
         categories.selectByVisibleText(category);
    }
}
