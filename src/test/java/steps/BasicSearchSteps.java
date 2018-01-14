package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchTools.EbaySearchbar;
import pages.SearchResultsPage.EbayResultItems;
import helpers.EbayPageNavigation;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class BasicSearchSteps {
    private  WebDriver driver;
    EbayPageNavigation navigation;
    EbaySearchbar  searchBar;
    EbayResultItems results;

    public BasicSearchSteps() {
        driver = Hooks.driver;
        this.navigation = new EbayPageNavigation(driver);
        this.searchBar = new EbaySearchbar(driver);
        this.results = new EbayResultItems(driver);
    }

    @Given("^A user is on eBay homepage$")
    public void a_user_is_on_eBay_homepage() throws Throwable {
        driver.get("https://www.ebay.co.uk");
    }

    @Given("^the user is not registered or login$")
    public void the_user_is_not_registered_or_login() throws Throwable {
        String actualTitle = navigation.getPageHeadertitle();
        assertEquals("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay", actualTitle );
    }

    @When("^the user search for \"([^\"]*)\"$")
    public void the_user_search_for(String item) throws Throwable {
        searchBar.SearchItem(item);
    }

    @Then("^the user can see their search results for \"([^\"]*)\"$")
    public void the_user_can_see_their_search_results_for(String item) throws Throwable {
        assertEquals(item + " | eBay", navigation.getPageHeadertitle());
    }


}
