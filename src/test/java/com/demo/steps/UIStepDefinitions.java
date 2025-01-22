package com.demo.steps;

import com.demo.pages.BookPage;
import com.demo.pages.DashboardPage;
import com.demo.pages.LoginPage;
import com.demo.utility.BrowserUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class UIStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BookPage bookPage = new BookPage();
    DashboardPage dashboardPage = new DashboardPage();


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

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        loginPage.emailBox.sendKeys(username);
    }
    @When("I enter password {string}")
    public void i_enter_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.loginButton.click();
    }
    @When("there should be {string} users")
    public void there_should_be_users(String expectedUserCount) {
        String actualUserCount = dashboardPage.userCount.getText();
        Assert.assertEquals(expectedUserCount,actualUserCount);
    }
}