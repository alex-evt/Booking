package pages;

import static com.codeborne.selenide.Selenide.*;
import static utils.ElementsConstructor.*;

public class SearchResultsPage {

    private final String searchResultsUrl = "https://www.booking.com/searchresults.en-gb.html";

    public SearchResultsPage openPage() {
        open(searchResultsUrl);
        return this;
    }

    public SearchResultsPage fillInSearchField(String hotel) {
        SEARCH_FIELD.clear();
        SEARCH_FIELD.sendKeys(hotel);
        return this;
    }

    public void clickSearch() {
        SEARCH_BUTTON.click();
    }
}