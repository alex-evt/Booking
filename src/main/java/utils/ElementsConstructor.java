package utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ElementsConstructor {

    public static final SelenideElement SEARCH_FIELD = $(By.xpath("//input[@name='ss']"));
    public static final SelenideElement SEARCH_BUTTON = $(By.xpath("//button[@data-sb-id='main' or @type='submit' and not (@data-et-click)]"));


    private ElementsConstructor() {
    }
}
