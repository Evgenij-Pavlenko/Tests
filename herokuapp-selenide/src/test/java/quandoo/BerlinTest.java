package quandoo;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.Test;
import pages.quandoo.Berlin;

public class BerlinTest {

    Berlin berlin;
    String reviewText = "Review score: 4-6";

    @Test
    public void reviewTest() {
        berlin = open("https://www.quandoo.de/en/berlin", Berlin.class);
        berlin.topRatedClick();
        berlin.isFilterVisible().shouldHave(text(reviewText));
    }
}
