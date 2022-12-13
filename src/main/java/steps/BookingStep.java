package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.SearchResultsPage;

import java.util.ArrayList;

import static utils.ArrayStringConstructor.addTextOfElementsInStringArray;
import static utils.XpathConstructor.*;

public class BookingStep {

    private final MainPage mainPage = new MainPage();
    private final SearchResultsPage searchResultsPage = new SearchResultsPage();
    private String city;
    private String hotel;
    private ArrayList<String> hotels;


    @Given("User is looking for a hotel in {string} city")
    public void userIsLookingForAHotelInLondonCity(String city) {
        this.city = city;
    }

    @When("User does search")
    public void userDoesSearch() {
        mainPage
                .openPage()
                .fillInSearchField(city)
                .clickSearch();
    }

    @Then("Hotel {string} should be on the first page") //22
    public void hotelMontcalmRoyalLondonHouseCityOfLondonShouldBeOnTheFirstPage(String hotel) {
        ArrayList<String> hotelNames = addTextOfElementsInStringArray(HOTEL_NAMES);
        this.hotels = hotelNames;
        Assert.assertTrue(hotelNames.contains(hotel));
    }

    @Given("User is looking for a {string} hotel")
    public void userIsLookingForASamesunTorontoHotel(String hotel) {
        this.hotel = hotel;
    }

    @When("User does hotel search")
    public void userDoesHotelSearch() {
        searchResultsPage
                .openPage()
                .fillInSearchField(hotel)
                .clickSearch();
    }

    @And("Hotel {string} rating is {string}")
    public void hotelRatingIs(String hotel, String rating) {
        ArrayList<String> hotelRatings = addTextOfElementsInStringArray(RATING_OF_HOTELS);
        int hotelIndex = hotels.indexOf(hotel);
        String particularHotelRating = hotelRatings.get(hotelIndex);
        Assert.assertEquals(particularHotelRating, rating);
    }
}
