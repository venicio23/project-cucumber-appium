package com.test.steps;

import com.test.screen.ScreenLogin;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();

    @Dado("^que eu informe usuário e senha$")
    public void que_eu_informe_usuário_e_senha(){
        login.writeEmail();
        login.writePass();
    }

    @Quando("^eu clicar no botão logar$")
    public void eu_clicar_no_botão_logar(){
        login.clickBtn();
    }

    @Então("^vou visualizar a home do aplicativo$")
    public void vou_visualizar_a_home_do_aplicativo() {
        System.out.println("APLICATIVO LOGADO");
    }
}
