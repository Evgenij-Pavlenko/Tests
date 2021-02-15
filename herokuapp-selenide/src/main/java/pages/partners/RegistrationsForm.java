package pages.partners;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;

public class RegistrationsForm {
    @FindBy(id = "onetrust-accept-btn-handler")
    private SelenideElement cookies;

    @FindBy(xpath = "//p[contains(.,'Страна')]")
    private SelenideElement dropdownCountry;

    @FindBy(id = "countrySpan")
    private ElementsCollection countryList;

    @FindBy(xpath = "//div[2]/input")
    private SelenideElement firstNameInput;

    @FindBy(xpath = "//div[3]/input")
    private SelenideElement lastNameInput;

    @FindBy(xpath = "//input[@type='email']")
    private SelenideElement emailInput;

    @FindBy(css = ".multiselect__select")
    private SelenideElement dropdownCodeCountryTel;

    @FindBy(css = ".multiselect__option")
    private ElementsCollection listCodeCountry;

    @FindBy(name = "phone")
    private SelenideElement telInput;

    @FindBy(xpath = "//div[6]/div/p")
    private SelenideElement dropdownType;

    @FindBy(css = ".active > li")
    private ElementsCollection listOfTypes;

    @FindBy(name="numberBranches")
    private SelenideElement inputNumberBranches;

    @FindBy(css = ".label-icon")
    private SelenideElement checkBox;

    @FindBy(css = ".btn-primary")
    private SelenideElement nextButton;

    public void selectDropdownCountry(String country) {
        dropdownCountry.click();
        countryList.findBy( text( country ) ).click();
    }


    public void fillName(String name) {
        firstNameInput.setValue( name );
    }

    public void fillLastName(String lastName) {
        lastNameInput.setValue( lastName );
    }

    public void fillEmail(String email) {
        emailInput.setValue( email );
    }

    public void selectDropdownCodeCountryTel(String codeCountry) {
        dropdownCodeCountryTel.click();
        listCodeCountry.findBy( text(codeCountry) ).click();
    }

    public void fillTelInput(String tel) {
        telInput.setValue( tel );
    }

    public void selectDropdownType(String type) {
        dropdownType.click();
        listOfTypes.findBy( text(type) ).click();
    }


    public void fillNumberBranches(String number) {
        inputNumberBranches.setValue( number );
    }

    public void fillCheckBox() {
        checkBox.click();
    }

//    public NextRegistrationPage clickNextButton() {
//        nextButton.click();
//        return page( NextRegistrationPage.class );
//    }

    public void acceptCookies() {
        cookies.click();
    }
}
