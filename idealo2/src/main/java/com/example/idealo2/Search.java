package com.example.idealo2;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.WebElementsCollectionWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;

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

    @FindBy(className = "sortBox-formSelect")
    private SelenideElement sortBy;

    //    By prices = By.className("price");
    By prices = By.xpath("//*[@class='price']");

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

    public SelenideElement searchText() {
        return searchedText;
    }

    // сортирует (визуально)
    public void setSortBy(String options) {
        sortBy.selectOption(options);
    }

    // Element not found {By.xpath: //*[@class='price'][1]}
    public boolean checkSortOrder() {
        int charAt1 = $$(prices).get(1).getText().indexOf(',');
        String firstPrice = $$(prices).get(1).getText().substring(charAt1);
        System.out.println("firstPrice: " + firstPrice);
        int charAt2 = $$(prices).get(1).getText().indexOf(',');
        String secondPrice = $$(prices).get(1).getText().substring(charAt1);
        System.out.println("secondPrice: " + secondPrice);
        return Integer.parseInt(firstPrice) > Integer.parseInt(secondPrice);
    }
}
