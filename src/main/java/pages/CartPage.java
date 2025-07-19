package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    By checkoutButton = By.xpath("//a[text()='CHECKOUT']");
    By cartPageTitle = By.xpath("//div[text()='Your Cart']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForCartPageToLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartPageTitle));
    }

    public CheckOutPage clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
        return new CheckOutPage(driver);
    }
}
