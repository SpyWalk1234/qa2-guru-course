import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BaseFunc;
import pages.HomePage;

import java.util.List;

public class CartTest {
    private final By MAIN_MENU = By.xpath(".//ul[@class = 'submenu-lvl1__list']");
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MAIN_MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item')]");
    //private final String HOME_PAGE_URL = "http://1a.lv";

    @Test
    public void itemsInCartCheckOnPageObjectsTest() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openHomePage();

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.openMainMenuItems();

    }

//    @Test
//    public void itemsInCartCheckTest() {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get(HOME_PAGE_URL);
//
//        driver.findElement(ACCEPT_COOKIES_BTN).click();
//
//        List<WebElement> mainMenus = driver.findElements(MAIN_MENU);
//        WebElement mainMenuToUse = mainMenus.get(1); //save to a variable or, for example, put it into loop, in order to make it work
//
//        List<WebElement> mainMenuItems = mainMenuToUse.findElements(MAIN_MENU_ITEM);
//
////        for (int i = 0; i < mainMenuItems.size(); i++) {
////            if (mainMenuItems.get(i).getText().equals("Spēļu konsoles un piederumi")) {
////                mainMenuItems.get(i).click();
////                break;
////            }
////        }
//
//        for (WebElement menuItem : mainMenuItems) { //instead of menuItem can be we - two letters
//            if (menuItem.getText().equals("Spēļu konsoles un piederumi")) {
//                menuItem.click();
//                break;
//            }
//        }
//    }
}
