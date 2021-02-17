package com.example.idealo2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {
    Search search;
    private String url ="https://www.idealo.de/";

    @BeforeTest
    public void before(){

    }
    @Test
    public void searchTest(){
        search = open("https://www.idealo.de/", Search.class);
        search.cookiesAccept();
        search.search("E-Bikes");
    }
}
