package pages.quandoo;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class Berlin {

    @FindBy(xpath = "//button[@data-qa='filter-button-top-rated']")
    private SelenideElement topRated;

    @FindBy(xpath = "//div[@id='desktop-filters-wrapper']//span[contains(text(), 'Review score')]")
    private SelenideElement reviewScore;

    public void topRatedClick(){
        $(topRated).click();
    }
     public SelenideElement isFilterVisible(){
        return reviewScore;

     }

}
