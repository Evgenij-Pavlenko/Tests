package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Hovers Commons
 */
public class HorizontalPage {

    private static final By slideElement = By.tagName("input");
//    private static final By slideElement = By.xpath("//input[@type='ranger']");
    private static final By valueElement = By.id("range");

    // slider over profile pics
    public void moveSlider(String sliderValue){
        $(slideElement).setValue(sliderValue);
    }

    public SelenideElement currentSliderValue(){
        return $(valueElement);
    }
}
