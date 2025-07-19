package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {
    WebDriver driver;

    By finishButton = By.xpath("//a[text()='FINISH']");

    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void finishOrder() {
        driver.findElement(finishButton).click();
    }
}
