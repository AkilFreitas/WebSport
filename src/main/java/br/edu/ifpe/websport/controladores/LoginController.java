/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.criptografia.LoginCriptografia;
import br.edu.ifpe.websport.model.ClienteModel;
import br.edu.ifpe.websport.model.entidades.Cliente;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author mayco
 */
@ManagedBean
@SessionScoped
public class LoginController {

    private String login;
    
    private String senha;
    private String senhaCripto;
    private Cliente cliente;
    private Cliente clienteLogado;
    private boolean cliLogado = false;

    public LoginController() {
    }

    public LoginController(String login, String senha, String senhaCripto, Cliente clienteLogado) {
        this.login = login;
        this.senha = senha;
        this.senhaCripto = senhaCripto;
        this.clienteLogado = clienteLogado;
    }

   

    public String cripSenha(String senha) {
        senhaCripto = LoginCriptografia.criptografar(senha);
        return senhaCripto;
    }

    public String logar() {
                
        if (this.login.equals("admin") && this.senha.equals("admin")) {
            return "menuTest.xhtml?faces-redirect=true";
        }
        
        this.cripSenha(senha);
        ClienteModel cm = new ClienteModel();
        Cliente c = cm.recuperarClienteLogin(login);
        if (c != null && c.getSenha().equals(senhaCripto)) {
            this.setClienteLogado(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Você foi logado com sucesso!"));
            return "/menuLateralTest01.xhtml?faces-redirect=true";

        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Atenção!", "Login ou senha, incorretos!"));
            return null;
        }
    }
    
    public void setClienteLogado(Cliente c) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("clienteLogado", c);            
    }
    
    public Cliente getClienteLogado() {
         return (Cliente) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("clienteLogado");
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

}
