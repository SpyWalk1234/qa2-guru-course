package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunc {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public BaseFunc() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        actions = new Actions(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void goToUrl(String url) {
        if(!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }

        driver.get(url);
    }

    public HomePage openHomePage() {
        goToUrl("http://1a.lv");
        return new HomePage(this);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        //driver.findElement(locator).click();
    }

    public void scrollToElement(By locator) {
        WebElement we = driver.findElement(locator);

        actions.scrollToElement(we).perform();
        //actions.perform();
    }

    public void findListOfItems(By locator) {
        List<WebElement> mainMenus = driver.findElements(locator);
        WebElement mainMenuToUse = mainMenus.get(1);

        List<WebElement> mainMenuItems = mainMenuToUse.findElements(locator);

        for (WebElement we : mainMenuItems) {
            if (we.getText().equals("Spēļu konsoles un piederumi")) {
                we.click();
                break;
            }
        }
        //actions.click().perform();
    }

    public void enterText(By locator, String text) {
        //driver.findElement(locator).sendKeys(text);
        // better to use WebElement in order to clear field before entering text
        WebElement inputField = driver.findElement(locator);
        inputField.clear();
        inputField.sendKeys(text);
    }

    public void checkErrorMessageCount(By locator, Integer messageCount, String text) {
        List<WebElement> we = driver.findElements(locator);
        Assertions.assertEquals(messageCount, we.size(), text);
    }

    public void checkFirstErrorMessage(By locator, String errorMessage) {
        List<WebElement> errorMessages = driver.findElements(locator);
        Assertions.assertEquals(errorMessage, errorMessages.getFirst().getText());
    }
}
