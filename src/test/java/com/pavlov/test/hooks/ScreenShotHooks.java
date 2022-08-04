package com.pavlov.test.hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.selenide.AllureSelenide;

public class ScreenShotHooks {
    @After
    public void takeScreenshot(Scenario scenario) {
        if(scenario.isFailed()){
            SelenideLogger.addListener("AllureSelenide",
                    new AllureSelenide().screenshots(true).savePageSource(false));
        }
    }
}
