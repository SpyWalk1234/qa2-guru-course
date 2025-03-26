import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RegistrationTests {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By REGISTRATION_BTN = By.xpath(".//strong[@class = 'user-block__title--strong']");
    private final By REGISTRATION_LINK = By.xpath(".//p[@class = 'users-session-form__signup']/a");
    private final By FIRST_NAME = By.id("user_first_name");
    private final By LAST_NAME = By.id("user_last_name");
    private final By EMAIL = By.id("user_email");
    private final By PASSWORD = By.id("user_password");
    private final By PASSWORD_CONFIRMATION = By.id("user_password_confirmation");
    private final By MARKETING_CHECKBOX = By.id("user_marketing_consent_1");
    private final By NEWS_CHECKBOX = By.id("user_marketing_consent_2");
    private final By ACCOUNT_REGISTER_BTN = By.name("commit");
    private final By ERROR_MSG = By.xpath(".//p[@class = 'users-session-form__error-message']");

    private final String SHORT_PASSWORD_ERROR = "parolei jāsatur vismaz viens skaitlis, mazā burti, lielā burti un īpašais simbols";
    private final String PASSWORD_MATCH_ERROR = "nesakrīt ar apstiprinājumu";
    //Can be saved here according to testing practices
    //If message will be changed - easier to find on top

    @Test
    public void incorrectPasswordRegistrationTest() {
        //Open Browser window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open Home Page
        driver.get("http://1a.lv");

        //Accept cookies
        //WebElement acceptCookiesBtn = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
        //acceptCookiesBtn.click();
        driver.findElement(ACCEPT_COOKIES_BTN).click();

        //Click registration btn
        //WebElement loginBtn = driver.findElement(By.xpath(".//strong[@class = 'user-block__title--strong']"));
        //loginBtn.click();
        driver.findElement(REGISTRATION_BTN).click();

        //Click register btn
        //If element is not visible and auto-scroll does not work
        WebElement registrationLink = driver.findElement(REGISTRATION_LINK);
        Actions actions = new Actions(driver);
        actions.scrollToElement(registrationLink);
        actions.perform();

        registrationLink.click();

        //If scroll not needed
        //driver.findElement(REGISTRATION_LINK).click();

        //Enter First Name
        driver.findElement(FIRST_NAME).sendKeys("Test");

        //Enter Last Name
        driver.findElement(LAST_NAME).sendKeys("Case");

        //Enter E-mail
        driver.findElement(EMAIL).sendKeys("test@test.lv");

        //Enter Password
        driver.findElement(PASSWORD).sendKeys("qwerty123.");

        //Enter Password again with mistake
        driver.findElement(PASSWORD_CONFIRMATION).sendKeys("qwerty321.");

        //Scroll to the Registration btn
        WebElement registrationButton = driver.findElement(ACCOUNT_REGISTER_BTN);
        actions.scrollToElement(registrationButton);
        actions.perform();

        //Select marketing check-box
        driver.findElement(MARKETING_CHECKBOX).click();

        //Select news check-box
        driver.findElement(NEWS_CHECKBOX).click();

        //Press Registration button
        driver.findElement(ACCOUNT_REGISTER_BTN).click();

        //Check wrong password error msg
        List<WebElement> errorMessages = driver.findElements(ERROR_MSG);
        Assertions.assertEquals(2, errorMessages.size(), "Wrong errors amount");
        Assertions.assertEquals(SHORT_PASSWORD_ERROR, errorMessages.getFirst().getText(), "Incorrect short password error message");
        //Assertions.assertEquals(SHORT_PASSWORD_ERROR, errorMessages.get(0).getText());
        Assertions.assertEquals(PASSWORD_MATCH_ERROR, errorMessages.getLast().getText(), "Incorrect match password error message");
        //Assertions.assertEquals(PASSWORD_MATCH_ERROR, errorMessages.get(1).getText());

        //Close browser window
        //driver.close();
    }
}
