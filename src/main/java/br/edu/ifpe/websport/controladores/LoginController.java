/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.criptografia.LoginCriptografia;
import br.edu.ifpe.websport.model.ClienteModel;
import br.edu.ifpe.websport.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
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
    private boolean cliLogado;
    
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
        
        if (this.login.equals("admin@g.com") && this.senha.equals("admin")) {
            this.login = "";
            this.senha = "";
            return "telaDoAdmin.xhtml?faces-redirect=true";
        }
        
        this.cripSenha(senha);
        ClienteModel cm = new ClienteModel();
        Cliente c = cm.recuperarClienteLogin(login);
        if (c != null && c.getSenha().equals(senhaCripto)) {
            this.setClienteLogado(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Você foi logado com sucesso!"));
            return "home.xhtml?faces-redirect=true";
            
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Atenção!", "Login ou senha, incorretos!"));
            return null;
        }
    }
    
    public String deslogar() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "home.xhtml?faces-redirect=true";
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
    
    public boolean isCliLogado() {
        return cliLogado;
    }
    
    public void setCliLogado(boolean cliLogado) {
        this.cliLogado = cliLogado;
    }
    
    public List selectedClientes(){
        List c = new ArrayList();
        c.add(this.getClienteLogado());
        
        return c;
    }
}
