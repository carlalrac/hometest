package pages.SearchTools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import pages.EbayBasePage;

import java.util.concurrent.ExecutionException;

public class EbayFilterBy extends EbayBasePage {
    public EbayFilterBy(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.LINK_TEXT, using="All listings")
    private static WebElement filterListings;

    @FindBy(how= How.LINK_TEXT, using="Auction")
    private static WebElement filterAuction;

    @FindBy(how= How.LINK_TEXT, using="Buy it now")
    private static WebElement filterBuyNow;

   public void Filter(String filterIs) {

       if ("All listings".equals(filterIs)) {
           filterListings.click();

       } else if ("Auction".equals(filterIs)) {
           filterAuction.click();

       } else if ("Buy it now".equals(filterIs)) {
           filterBuyNow.click();

       }
   }

   public void ValidateFilterSet(String activeFilter) {
       driver.findElement(By.xpath("//span[@title='" + activeFilter + "']/descendant::span[contains(.,' - Current page')]"));
   }

   public void ValidateBidSetForItem(String itemNumber) {
       WebElement bid = driver.findElement(By.xpath("//ul[@id='ListViewInner']/li[@r='"+ itemNumber + "']/descendant::span[contains(text(), 'bids')]"));
       System.out.println(String.format("Bid is set to %s", bid.getText()));
   }

   public void ValidatePriceSetForItem(String itemNumber) {
       WebElement price = driver.findElement(By.xpath("//ul[@id='ListViewInner']/li[@r='"+ itemNumber + "']/descendant::li[@class='lvprice prc']"));
       System.out.println(String.format("Price is set to %s", price.getText()));
   }

   public void ValidateFeeSetForItem(String itemNumber) {
      WebElement fee = driver.findElement(By.xpath("//ul[@id='ListViewInner']/li[@r='"+ itemNumber + "']/descendant::span[@class='fee'] | //ul[@id='ListViewInner']/li[@r='" + itemNumber + "']/descendant::span[@class='bfsp']"));
      System.out.println(String.format("Postage is: %s", fee.getText()));
   }

   public void ValidateBuyNowSetForItem(String itemNumber) {
       WebElement buy = driver.findElement(By.xpath("//ul[@id='ListViewInner']/li[@r='"+ itemNumber + "']/descendant::span[@class='logoBin'] | //ul[@id='ListViewInner']/li[@r='"+ itemNumber + "']/descendant::span[@title='Buy it now or Best Offer']"));
       System.out.println(String.format("%s", buy.getAttribute("title")));
   }
}
