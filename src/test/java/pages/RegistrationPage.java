package pages;

import model.PageObjectUser;
import org.openqa.selenium.By;

public class RegistrationPage {
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


    private BaseFunc baseFunc;

    public RegistrationPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void registerUser(PageObjectUser user, boolean withIncorrectPassword) {
        enterFirstName(user.getFirstName())
                .enterLastName(user.getLastName())
                .enterEmail(user.getEmail())
                .enterPassword(user.getPassword());

        if (withIncorrectPassword) {
            confirmPassword(user.getPassword() + "!");
        } else {
            confirmPassword(user.getPassword());
        }

        checkMarketingCheckbox()
                .checkNewsCheckbox()
                .clickRegisterBtn();
    }

    public RegistrationPage enterFirstName(String firstName) {
        baseFunc.enterText(FIRST_NAME, firstName);
        return this;
    }

    public RegistrationPage enterLastName(String lastName) {
        baseFunc.enterText(LAST_NAME, lastName);
        return this;
    }

    public RegistrationPage enterEmail(String email) {
        baseFunc.enterText(EMAIL, email);
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        baseFunc.enterText(PASSWORD, password);
        return this;
    }

    public RegistrationPage confirmPassword(String password) {
        baseFunc.enterText(PASSWORD_CONFIRMATION, password);
        return this;
    }

//    public RegistrationPage scrollToRegistrationBtn() {
//        baseFunc.scrollToElement(ACCOUNT_REGISTER_BTN);
//        return this;
//} can be used instead of scrolling in each method below

    public RegistrationPage checkMarketingCheckbox() {
        baseFunc.scrollToElement(MARKETING_CHECKBOX);
        baseFunc.click(MARKETING_CHECKBOX);
        return this;
    }

    public RegistrationPage checkNewsCheckbox() {
        baseFunc.scrollToElement(NEWS_CHECKBOX);
        baseFunc.click(NEWS_CHECKBOX);
        return this;
    }

    public RegistrationPage clickRegisterBtn() {
        baseFunc.scrollToElement(ACCOUNT_REGISTER_BTN);
        baseFunc.click(ACCOUNT_REGISTER_BTN);
        return this;
    } // should be void if we don't know to which page navigates, for example in case of error will stay

    public void checkWrongPasswordErrorMessage() {
        baseFunc.scrollToElement(ERROR_MSG);
        baseFunc.checkErrorMessageCount(ERROR_MSG, 2, "Wrong errors amount");
        baseFunc.checkFirstErrorMessage(ERROR_MSG, SHORT_PASSWORD_ERROR);
    }


}
