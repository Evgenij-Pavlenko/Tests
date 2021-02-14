package pages;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.partners.Partners;

import java.util.Locale;
import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class PartnersTest {
    Partners partners;
    private final static String URL ="https://cloud.partner.glovoapp.com/Partners";

    @BeforeEach
    public void before(){
        partners = open(URL, Partners.class);
        partners.acceptCookies();
    }
    @Test
    public void formFillingTest() {
        partners.formFilling();
        partners.clickBtn();

    }


}
