package com.example.idealo2;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class Search {


//    Element not found {btn-accept-all}
//    Expected: visible or transparent: visible or have css value opacity=0
//    никак не находит. И задержка не работает

//    @FindBy(css = "btn-accept-all")
    @FindBy(xpath = "/html/body/div/div[3]/div[4]/div[2]/button")
    private SelenideElement cookiesBtn;

    @FindBy(id = "i-search-input")
    private SelenideElement searchInput;

    public void cookiesAccept(){
        cookiesBtn.click();
    }

    public void search(String name){
        searchInput.setValue(name);
        searchInput.sendKeys(Keys.ENTER);
    }
}
