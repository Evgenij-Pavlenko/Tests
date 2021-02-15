package pages.partners;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;
import java.util.Random;

public class Partners {

    //    @FindBy(xpath = "//ul[@class=\"dropdown-box\"][1]")
    @FindBy(xpath = "//*[@id='form-home']/div/div[1]/div")
    private SelenideElement landDropdown;

    @FindBy(xpath = "//*[@id=\"inline\"]/input")
    private SelenideElement name;

    @FindBy(xpath = "//input[@placeholder='Фамилия']")
    private SelenideElement lastName;

    @FindBy(xpath = "//input[@type='email']")
    private SelenideElement email;

    @FindBy(xpath = "//*[@id='prefix_cmp']/div/div[2]/input")
    private SelenideElement telPrefix;

    @FindBy(xpath = "//input[@type='tel']")
    private SelenideElement telNumber;

    @FindBy(xpath = "//*[@id='form-home']/div/div[6]/div")
    private SelenideElement typeOf;

    @FindBy(xpath = "//*[@id='form-home']/div/div[7]/input")
    private SelenideElement quantity;

    @FindBy(xpath = "//input[@id='politicaPrivacidad']")
    private SelenideElement politicaPrivacidad;

    @FindBy(tagName = "button")
    private SelenideElement btn;

    @FindBy(id = "onetrust-accept-btn-handler")
    private SelenideElement acceptBtn;

    Faker faker = new Faker(new Locale("ru-Ru"));

    String land = String.valueOf(faker.random());

    Random rnd = new Random();

    public void acceptCookies() {
        acceptBtn.click();
    }
    //*[@id='form-home']/div/div[1]/div/ul/li[]/input
    public void formFilling() {
//        landDropdown.selectOption(rnd.nextInt(17)); // Land

        //Никак не получается выбрать страну из списка.
        //RND - отрабатывает нормально: li[14]
        landDropdown.click();

        // element not interactable
        landDropdown
                .find(By.xpath("./ul/li["+rnd.nextInt(18)+"]/*/input"))
                .click();
        name.setValue(faker.name().firstName());
        lastName.setValue(faker.name().lastName());
        email.setValue(faker.internet().emailAddress());
//        telPrefix.selectOption(faker.phoneNumber().extension());
//        telNumber.selectOption(faker.phoneNumber().subscriberNumber(7));
//        typeOf.selectOption(rnd.nextInt(4));
//        quantity.setValue(String.valueOf(rnd.nextInt(4)));
//        politicaPrivacidad.click();
    }

    public void clickBtn() {
        btn.click();
    }
}
