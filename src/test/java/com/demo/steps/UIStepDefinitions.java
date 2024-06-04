package com.demo.steps;

import com.demo.pages.BookPage;
import com.demo.pages.LoginPage;
import com.demo.utility.BrowserUtil;
import io.cucumber.java.en.Given;

public class UIStepDefinitions {
    LoginPage loginPage = new LoginPage();
    BookPage bookPage = new BookPage();

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