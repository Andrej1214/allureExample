package com.pavlov.test.pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    public BasePage() {
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = 20000;
        open();
    }
}
