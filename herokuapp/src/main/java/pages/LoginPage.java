package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Login Page
 */
public class LoginPage extends Page {

//    @FindBy(name = "username")
//    // Тут посложнее - надо доп.класс создавать. Не стал заморачиваться
//    private WebElement userName = By.name("username");

    private static final String LOGIN_URL = BASE_URL + "/login";
    private static final By username = By.name("username");
    private static final By password = By.name("password");
    private static final By loginKey = By.className("fa");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        driver.navigate().to(LOGIN_URL);
//        driver.get(LOGIN_URL); - какой способ лучше?
    }

    public void loginWithNameAndPass(String name, String pass) {
        driver.findElement(username).sendKeys(name);
        driver.findElement(password).sendKeys(pass);
    }

    public boolean isMessageLoginPresent(String message) {
        SecureArea sa = validClickLogin();
        String loginMessage = sa.textMessage;
        return loginMessage.contains(message);
    }

    public SecureArea validClickLogin() {
        driver.findElement(loginKey).submit();
        return new SecureArea(driver);
    }
}
