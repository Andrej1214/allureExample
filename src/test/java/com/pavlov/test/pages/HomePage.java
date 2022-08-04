package com.pavlov.test.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;

public class HomePage extends BasePage{
    private static final String ELEMENT_OF_MAIN_MENU_LINK_PATTERN =
            "//div//ul[@class='b-main-navigation']//span[contains(text(),'%s')]";
    private static final String AVTOBARACHOLKA_SUBMENU_LINK_PATTERN =
            "//div[contains(@class,'__dropdown-column_') and .//a[contains(text(),'Автобарахолка')]]";
    private static final String DOMA_I_KVARTIRY_SUBMENU_LINK_PATTERN =
            "//div[contains(@class,'__dropdown-column') and .//a[contains(text(),'Продажа')]]";

    public void openOnlinerWebsite() {
        open("http://www.onliner.by");
    }

    public void movePointerOnElementOfMainMenu(String value) {
        $x(String.format(ELEMENT_OF_MAIN_MENU_LINK_PATTERN, value)).hover();
    }

    public boolean displayedSubmenuAvtobaracholka() {
        return $x(AVTOBARACHOLKA_SUBMENU_LINK_PATTERN).shouldBe(visible, ofSeconds(20)).isDisplayed();
    }

    public boolean displayedSubmenuDomaIKvartiry() {
        return $x(DOMA_I_KVARTIRY_SUBMENU_LINK_PATTERN).shouldBe(visible, ofSeconds(20)).isDisplayed();
    }
}
