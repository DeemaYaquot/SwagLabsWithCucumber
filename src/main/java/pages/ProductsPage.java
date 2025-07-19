package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    WebDriver driver;
    By pageHeader= By.className("product_label");
    By addToCartButton = By.xpath("//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button[text()='ADD TO CART']");
    By cartButton =By.xpath("//a[@href='./cart.html']");

    public ProductsPage (WebDriver driver){
        this.driver = driver;
    }

    public boolean isPageHeaderDisplayed(){
        return driver.findElement (pageHeader).isDisplayed();
    }

    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }
    public CartPage goToCart(){
        driver.findElement(cartButton).click();
        return new CartPage(driver);
    }
}
