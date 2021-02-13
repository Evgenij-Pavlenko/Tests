package quandoo;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.quandoo.Berlin;

public class BerlinTest {

    Berlin berlin;
    String reviewText = "Review score: 4-6";
    String url = "https://www.quandoo.de/en/berlin";

    @BeforeEach
    public void openPage(){
        berlin = open(url, Berlin.class);
        berlin.acceptCookies();
    }

    @Test
    public void reviewTest() {

        berlin.topRatedClick();
        berlin.topRatedFilter().should(exist);
        berlin.topRatedFilter().shouldHave(text(reviewText));
       berlin.isActive().shouldHave(attribute("data-state", "active"));
    }
}
