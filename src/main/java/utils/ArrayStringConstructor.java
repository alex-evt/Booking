package utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$;

public class ArrayStringConstructor {

    public static ArrayList<String> addTextOfElementsInStringArray(String xpath) {
        ArrayList<String> array = new ArrayList<>();
        for (SelenideElement element : $$(By.xpath(xpath))) {
            array.add(element.getText());
        }
        return array;
    }

    private ArrayStringConstructor(){
    }
}
