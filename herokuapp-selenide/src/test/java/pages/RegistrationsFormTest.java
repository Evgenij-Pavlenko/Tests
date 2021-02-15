package pages;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.partners.RegistrationsForm;

import javax.annotation.PostConstruct;
import java.util.Locale;
import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationsFormTest {
    Faker faker = new Faker(new Locale("ru-Ru"));
    String name;
    String lastName;
    String email;
    String tel;
    Random rnd = new Random();

    RegistrationsForm partners;

    @BeforeEach
    public void acceptCookies() {
        partners = open("https://cloud.partner.glovoapp.com/Partners", RegistrationsForm.class );
        partners.acceptCookies();
    }

    @Test
    public void PartnersRegistrationPage() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String tel = faker.phoneNumber().phoneNumber();
        String numberBranches = faker.numerify(String.valueOf(rnd.nextInt(4)));

        // dropdown country
        partners.selectDropdownCountry( "Франция" );

        partners.fillName( firstName );
        partners.fillLastName( lastName );
        partners.fillEmail( email );

        // dropdown code tel number
        partners.selectDropdownCodeCountryTel( "+93" );

        partners.fillTelInput( tel );

        // dropdown type of business

        partners.selectDropdownType( "Ресторан" );


        partners.fillNumberBranches( numberBranches );
        partners.fillCheckBox();
//        partners.clickNextButton().getPageTitle().should( exist );
    }
}
