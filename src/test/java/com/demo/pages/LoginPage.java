package com.demo.pages;

import com.demo.utility.ConfigurationReader;
import com.demo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(tagName = "button")
    public WebElement loginButton;



    public void login(String userType){

        Driver.get().get(ConfigurationReader.getProperty("library_url"));

        String username= ConfigurationReader.getProperty(userType+"_username");
        String password=ConfigurationReader.getProperty(userType+"_password");


        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();

    }

    public void login(String email,String password){


        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginButton.click();

    }




}
