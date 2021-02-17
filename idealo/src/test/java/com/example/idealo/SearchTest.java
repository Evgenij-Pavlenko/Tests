package com.example.idealo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {
    Search search;
    private String url ="https://www.idealo.de/";

    @BeforeEach
    public void before(){

    }
    @Test
    public void searchTest(){
        search = open("https://www.idealo.de/", Search.class);
        search.cookiesAccept();
        search.search("E-Bikes");
    }
}
