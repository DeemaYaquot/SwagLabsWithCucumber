package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginSteps {
    static WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        productsPage = loginPage.clickLoginButton();
    }

    @Then("User should be redirected to the products page")
    public void user_should_be_redirected_to_the_products_page() {
        Assert.assertTrue(productsPage.isPageHeaderDisplayed());
    }
}
