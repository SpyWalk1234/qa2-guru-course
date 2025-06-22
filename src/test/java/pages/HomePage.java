package pages;

import org.openqa.selenium.By;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By REGISTRATION_BTN = By.xpath(".//strong[@class = 'user-block__title--strong']");
    private final By MAIN_MENU = By.xpath(".//ul[@class = 'submenu-lvl1__list']");
    private final By MAIN_MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item')]");

    private BaseFunc baseFunc;//this. - для этой переменной

    public HomePage(BaseFunc baseFunc) { //без this. - для этой переменной
        this.baseFunc = baseFunc;

    }

    public HomePage acceptCookies() {
        baseFunc.click(ACCEPT_COOKIES_BTN);
        return this;
    }

    public SignInPage openLoginPage() {
        baseFunc.click(REGISTRATION_BTN);
        return new SignInPage(baseFunc);
    }

    public HomePage openMainMenuItems() {
        baseFunc.scrollToElement(MAIN_MENU);
        baseFunc.findListOfItems(MAIN_MENU_ITEM);
        return this;
    }
}
