package com.test.screen;


import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(id="login_username")
    private RemoteWebElement fieldEmail;

    @AndroidFindBy(id="login_password")
    private RemoteWebElement fieldPassword;

    public void writeEmail(){
        fieldEmail.sendKeys ("qazando@gmail.com");
    }

    public void writePassword(String txt){
        fieldPassword.sendKeys(txt);
    }

}
