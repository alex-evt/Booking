package pages;

import static com.codeborne.selenide.Selenide.open;
import static utils.ElementsConstructor.*;

public class MainPage {

    private final String bookingUrl = "https://www.booking.com/";

    public MainPage openPage() {
        open(bookingUrl);
        return this;
    }

    public MainPage fillInSearchField(String city) {
        SEARCH_FIELD.sendKeys(city);
        return this;
    }

    public SearchResultsPage clickSearch() {
        SEARCH_BUTTON.click();
        return new SearchResultsPage();
    }

}
