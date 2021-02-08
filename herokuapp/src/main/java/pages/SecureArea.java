package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea extends Page {

    private By message = By.id("flash");
    protected String textMessage;

    public SecureArea(WebDriver driver) {
        super(driver);
        textMessage = driver.findElement(message).getText();
    }


}
