package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Login Page
 */
public class LoginPage extends Page {

    @FindBy(name = "username")
    // Тут посложнее - надо доп.класс создавать. Не стал заморачиваться
    private WebElement userName;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final String LOGIN_URL = "http://the-internet.herokuapp.com/login";

    public void goToLoginPage() {
        driver.navigate().to(LOGIN_URL);
//        driver.get(LOGIN_URL); - какой способ лучше?
    }

    public void loginWithNameAndPass(String name, String pass) {
        WebElement userName = driver.findElement(By.name("username"));
        WebElement userPassword = driver.findElement(By.name("password"));
        WebElement loginKey = driver.findElement(By.className("fa"));
        userName.sendKeys(name);
        userPassword.sendKeys(pass);
        loginKey.submit();
    }

    public boolean isMessageLoginPresent(String message) {
        WebElement loginTrue = driver.findElement(By.id("flash"));
        String loginMessage = loginTrue.getText();
        return loginMessage.contains(message);
    }


}
