package pages;

import org.openqa.selenium.By;

public class SignInPage {
    private final By REGISTRATION_LINK = By.xpath(".//p[@class = 'users-session-form__signup']/a");

    private BaseFunc baseFunc;

    public SignInPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public RegistrationPage openRegistrationPage() {
        baseFunc.scrollToElement(REGISTRATION_LINK);
        baseFunc.click(REGISTRATION_LINK);
        return new RegistrationPage(baseFunc);

    }
}
