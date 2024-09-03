package com.test.screen;


import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(id="login_username")
    private RemoteWebElement campoemail;

    @AndroidFindBy(id="login_password")
    private RemoteWebElement camposenha;

    @AndroidFindBy(id="login_button")
    private RemoteWebElement botaologar;

    public void writeEmail(){
        campoemail.sendKeys("qazando@gmail.com");
    }

    public void writePass(){
        camposenha.sendKeys("1234567");
    }

    public void clickBtn(){
        botaologar.click();
    }
}
