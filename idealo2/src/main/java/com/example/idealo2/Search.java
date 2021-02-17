package com.example.idealo2;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class Search {


//    Element not found {btn-accept-all}
//    Expected: visible or transparent: visible or have css value opacity=0
//    никак не находит. И задержка не работает

//    @FindBy(css = "btn-accept-all")
//    @FindBy(xpath = "/html/body/div/div[3]/div[4]/div[2]/button")
//    private SelenideElement cookiesBtn;

    @FindBy(id = "i-search-input")
    private SelenideElement searchInput;

    @FindBy(className = "offerList-title")
    private SelenideElement searchedText;

    WebDriverRunner wr = new WebDriverRunner();

    By okBtnCookies = By.cssSelector(".btn-accept-all");
    By iframe = By.cssSelector("body > div > iframe");
    WebElement frame = switchTo().frame($(iframe)).findElement(By.cssSelector("body"));

    public void acceptCookies() {
        $(frame).$(okBtnCookies).click();
        WebDriverRunner.getWebDriver().switchTo().parentFrame();
    }

    public void search(String name) {
        searchInput.setValue(name);
        searchInput.sendKeys(Keys.ENTER);

    }

    public SelenideElement searchText(){
        return searchedText;
    }
}
