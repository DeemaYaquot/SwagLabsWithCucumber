package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage {
    WebDriver driver;
    WebDriverWait wait;

    By firstName = By.id("first-name");
    By checkOutPageTitle = By.xpath("//div[text()='Checkout: Your Information']");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForCheckOutPageToLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkOutPageTitle));
    }

    public CheckOutOverviewPage enterCheckoutData(String firstNameValue, String lastNameValue, String postalCodeValue) {
        driver.findElement(firstName).sendKeys(firstNameValue, Keys.TAB,
                lastNameValue, Keys.TAB, postalCodeValue, Keys.ENTER);
        return new CheckOutOverviewPage(driver);
    }

}
