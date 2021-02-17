package com.example.idealo2;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {
    Search search;
    private String url = "https://www.idealo.de/";
    String searchedText = "E-Bikes";

    @BeforeTest
    public void before() {
        search = open("https://www.idealo.de/", Search.class);
        search.acceptCookies();
    }

    @Test
    public void searchTest() {
        search.search(searchedText);
        search.searchText().shouldHave(Condition.text(searchedText));
    }
}
