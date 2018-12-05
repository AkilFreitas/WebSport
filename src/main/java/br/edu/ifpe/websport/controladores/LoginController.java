/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.criptografia.LoginCriptografia;
import br.edu.ifpe.websport.model.entidades.Cliente;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author mayco
 */
@ManagedBean
@RequestScoped
public class LoginController {

    private String login;
    private String senha;
    private String senhaCripto;

    private Cliente clienteLogado;
    private boolean cliLogado = false;

    LoginController() {
    }

    public LoginController(String login, String senha, String senhaCripto, Cliente clienteLogado) {
        this.login = login;
        this.senha = senha;
        this.clienteLogado = clienteLogado;
    }

    public String cripSenha(String senha) {
        senhaCripto = LoginCriptografia.criptografar(senha);
        return logar();
    }

    public String logar() {
        if (login.equals("9bpm") && senhaCripto.equals("5cfc42d4c71557cd294522c6b66d91f1")) {
            cliLogado = true;
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Você foi logado com sucesso!"));
            return "menuTest.xhtml";

        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Atenção!", "Login ou senha, incorretos!"));
            return null;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isCliLogado() {
        return cliLogado;
    }

    public void setCliLogado(boolean cliLogado) {
        this.cliLogado = cliLogado;
    }

    public Cliente getClienteLogado() {
        return clienteLogado;
    }

    public void setClienteLogado(Cliente clienteLogado) {
        this.clienteLogado = clienteLogado;
    }
}