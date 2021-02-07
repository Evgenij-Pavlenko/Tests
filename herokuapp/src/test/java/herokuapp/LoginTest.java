package herokuapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest {

    LoginPage loginPage;
    private ChromeDriver driver;

    @BeforeEach
    public void initPageObjects() {
//        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", "c:/driver/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void testLoginWithNameAndPass_success() {
        loginPage.goToLoginPage();
        loginPage.loginWithNameAndPass("tomsmith", "SuperSecretPassword!");
        assertTrue(loginPage.isMessageLoginPresent("You logged into a secure area!"));
    }

    @Test
    public void testLoginWithNameAndPass_error() {
        loginPage.goToLoginPage();
        loginPage.loginWithNameAndPass(" ", " ");
        assertTrue(loginPage.isMessageLoginPresent("Your username is invalid!"));
    }
}
