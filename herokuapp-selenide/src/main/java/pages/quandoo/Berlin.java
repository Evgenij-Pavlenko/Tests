package pages.quandoo;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class Berlin {

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private SelenideElement cookiesOkBtn;

    @FindBy(xpath = "//button[@data-qa='filter-button-top-rated']")
    private SelenideElement topRatedBtn;

    @FindBy(xpath = "//div[@id='desktop-filters-wrapper']//span[contains(text(), 'Review score')]")
    private SelenideElement topRatedFilter;

    public void acceptCookies() {
        cookiesOkBtn.click();
    }

    public void topRatedClick() {
        topRatedBtn.click();
    }

    public SelenideElement topRatedFilter() {
        return topRatedFilter;

    }

    public SelenideElement isActive() {
        return topRatedBtn;
    }

}
