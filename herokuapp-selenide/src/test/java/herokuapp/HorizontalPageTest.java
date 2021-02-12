package herokuapp;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.EmailSentPage;
import pages.HorizontalPage;
import pages.ResetPasswordPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static pages.Commons.BASE_URL;

public class HorizontalPageTest {

    @Test
    public void testSliderPositive() {
        String value = "2.5";
        HorizontalPage horizontalPage = open(BASE_URL + "/horizontal_slider", HorizontalPage.class);
        horizontalPage.moveSlider(value);
horizontalPage.currentSliderValue().shouldHave(text(value));
    }
}
