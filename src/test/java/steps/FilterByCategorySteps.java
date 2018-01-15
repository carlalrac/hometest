package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EbayPageNavigation;
import pages.SearchResultsPage.EbayResultItems;
import pages.SearchTools.EbayCategoryFilter;
import pages.SearchTools.EbaySearchbar;
import static org.junit.Assert.assertEquals;


public class FilterByCategorySteps {
    public WebDriver driver;
    EbayPageNavigation navigation;
    EbaySearchbar searchBar;
    EbayResultItems results;
    EbayCategoryFilter byCategory;


    public FilterByCategorySteps() {
        driver = Hooks.driver;
        this.navigation = new EbayPageNavigation(driver);
        this.byCategory = new EbayCategoryFilter(driver);
    }


    @When("^the user selects \"([^\"]*)\" category filter$")
    public void the_user_selects_category_filter(String cat)  {
        byCategory.SelectCategory(cat);
    }

    @Then("^the user can see their search results for \"([^\"]*)\" in the \"([^\"]*)\" category$")
    public void the_user_can_see_their_search_results_for_in_the_category(String item, String category) {
        //Pending - Add a fluent wait for javascript to reload page result title as category get updated dynamically
        // Failing scenario: EbayFilterResultsByCategory.feature:18
        assertEquals(item + " in " + category + " | eBay", navigation.getPageHeadertitle());
    }
}
