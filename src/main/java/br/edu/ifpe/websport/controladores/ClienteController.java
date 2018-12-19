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
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Val e Michael
 */
@ManagedBean
@SessionScoped
public class ClienteController {

    ClienteModel cm = new ClienteModel();
    private Cliente clienteCadastro;
    private Cliente selectedCliente;

    Cliente cliente = new Cliente();

    public ClienteController() {
        this.clienteCadastro = new Cliente();
    }

    public String inserirAction() {

        try {
            String senhaCript = LoginCriptografia.criptografar(this.clienteCadastro.getSenha());
            this.clienteCadastro.setSenha(senhaCript);
            this.cm.inserir(this.clienteCadastro);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O cliente foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            ex.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O cliente não foi cadastrada!"));
        } finally {
            this.clienteCadastro = new Cliente();
        }
        return "/home.xhtml?faces-redirect=true";
    }

    public void alterarAction(Cliente c) {
        try {
            this.cm.alterar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O cliente foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O cliente não foi alterado!"));
        }

    }

    public Cliente recuperarCliente(int id) {
        return this.cm.recuperarCliente(id);
    }

    public void deletarAction(Cliente c) {
        try {
            this.cm.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O cliente foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O cliente não foi deletado!"));
        }
    }

    public List<Cliente> recuperarTodosClientes() {
        return this.cm.recuperarTodos();
    }

    public Cliente getClienteCadastro() {
        return clienteCadastro;
    }

    public void setClienteCadastro(Cliente clienteCadastro) {
        this.clienteCadastro = clienteCadastro;
    }

    public Cliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(Cliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public ClienteModel getCm() {
        return cm;
    }

    public void setCm(ClienteModel cm) {
        this.cm = cm;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List setSelectedClientes(){
        List c = new ArrayList();
        c.add(this.selectedCliente);
        
        return c;
    }
}
