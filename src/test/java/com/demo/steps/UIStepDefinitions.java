package com.demo.steps;

import com.demo.pages.BookPage;
import com.demo.pages.DashboardPage;
import com.demo.pages.LoginPage;
import com.demo.utility.BrowserUtil;
import com.demo.utility.ConfigurationReader;
import com.demo.utility.Driver;
import io.cucumber.java.en.*;

public class UIStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BookPage bookPage = new BookPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_url"));
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("librarian_username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("librarian_password"));
        loginPage.loginButton.click();
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        dashboardPage.dashboardLink.isDisplayed();
    }

    @Given("I logged in Library UI as {string}")
    public void i_logged_in_library_ui_as(String userType) {
        loginPage.login(userType);
        BrowserUtil.waitFor(3);
    }

    @Given("I navigate to {string} page")
    public void i_navigate_to_page(String pageName) {
        bookPage.navigateModule(pageName);
        BrowserUtil.waitFor(3);
    }
}