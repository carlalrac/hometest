package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.SearchTools.EbaySortBy;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;
public class SortResultsSteps {
    private  WebDriver driver;
    EbaySortBy sortBy;

    public SortResultsSteps() {
        driver = Hooks.driver;
        this.sortBy = new EbaySortBy(driver);
    }

    @When("^the user sort their results by: \"([^\"]*)\"$")
    //public void the_user_sort_their_results_by(String arg1) throws Throwable {
        public void sort_result_by(String choice) throws Throwable {
            sortBy.SelectBy(choice);


    }

    @Then("^the user can see their results sorted by: \"([^\"]*)\"$")
    public void the_user_can_see_their_results_sorted_by(String sorted) throws Throwable {
        sortBy.CheckSortedBy(sorted);
    }


}
