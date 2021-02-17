package com.example.idealo2;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class SearchTest {
    Search search;
    private String url = "https://www.idealo.de/";
    String searchedText = "E-Bikes";

    @BeforeTest
    public void before() {
        search = open(url, Search.class);
        search.acceptCookies();
    }

    @Test
    public void searchTest() {
        search.search(searchedText);
        search.searchText().shouldHave(Condition.text(searchedText));
    }

    @Test
    public void sortBySelect() {
        search.setSortBy("Preis: Höchster zuerst");
        assertTrue(search.checkSortOrder());

    }
}
