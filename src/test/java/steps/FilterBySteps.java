package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Hooks;
import org.openqa.selenium.WebDriver;
import pages.SearchResultsPage.EbayResultItems;
import pages.SearchTools.EbayFilterBy;

public class FilterBySteps {
    private WebDriver driver;
    EbayFilterBy filterBy;
    EbayResultItems results;

    public FilterBySteps() {
        driver = Hooks.driver;
        this.filterBy = new EbayFilterBy(driver);
        this.results = new EbayResultItems(driver);
    }


    @Then("^the result is filter by \"([^\"]*)\"$")
    public void the_result_is_filter_by(String  expectedFilter) throws Throwable {
        filterBy.ValidateFilterSet(expectedFilter);
    }

    @When("^the user filter their results by \"([^\"]*)\"$")
    public void the_user_filter_their_results_by(String filterChoice) throws Throwable {
        filterBy.Filter(filterChoice);
    }

    @Then("^the user can see the number of bids on the \"([^\"]*)\" item$")
    public void the_user_can_see_the_number_of_bids_on_the_item(String itemTarget) throws Throwable {
        filterBy.ValidateBidSetForItem(itemTarget);
    }

    @Then("^the given price of item \"([^\"]*)\"$")
    public void the_given_price_of_item(String itemTarget) throws Throwable {
        filterBy.ValidatePriceSetForItem(itemTarget);
    }

    @Then("^the postage fee or the free postage tag of item \"([^\"]*)\"$")
    public void the_postage_fee_or_the_free_postage_tag(String itemTarget) throws Throwable {
        filterBy.ValidateFeeSetForItem(itemTarget);
    }

    @Then("^the user can see Buy now, or Buy now and see offers tags on the \"([^\"]*)\" item$")
    public void the_user_can_see_Buy_now_or_Buy_now_and_see_offers_tags_on_the_item(String itemTarget) throws Throwable {
        filterBy.ValidateBuyNowSetForItem(itemTarget);
    }
}
