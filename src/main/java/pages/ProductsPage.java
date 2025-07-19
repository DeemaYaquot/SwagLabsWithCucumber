package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;
    By pageHeader= By.className("product_label");

    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean isPageHeaderDisplayed(){
        return driver.findElement (pageHeader).isDisplayed();
    }
}
