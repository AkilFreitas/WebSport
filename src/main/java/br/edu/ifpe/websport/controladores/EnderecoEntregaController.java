/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.model.EnderecoEntregaModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.model.entidades.EnderecoEntrega;

/**
 *
 * @author mayco
 */
@ManagedBean
@SessionScoped
public class EnderecoEntregaController {

    EnderecoEntregaModel eem = new EnderecoEntregaModel();
    private EnderecoEntrega enderecoEntregaCadastro;
    private EnderecoEntrega selectedEnderecoEntrega;

    EnderecoEntrega enderecoEntrega = new EnderecoEntrega();

    public EnderecoEntregaController() {
        this.enderecoEntregaCadastro = new EnderecoEntrega();
    }

    public void inserirAction() {

        try {
            this.eem.inserir(this.enderecoEntregaCadastro);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O Endereço de entrega foi cadastrado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O Endereço de entrega não foi cadastrado!"));
        }
        this.enderecoEntregaCadastro = new EnderecoEntrega();
    }

    public void alterarAction(EnderecoEntrega ee) {
        try {
            this.eem.alterar(ee);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O Endereço de entrega foi alterado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O Endereço de entregan não foi alterado!"));
        }
    }

    public EnderecoEntrega recuperarEnderecoEntrega(int id) {
        return this.eem.recuperarEnderecoEntrega(id);
    }

    public void deletarAction(EnderecoEntrega ee) {
        try {
            this.eem.deletar(ee);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O Endereço de entrega foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O Endereço de entrega não foi deletado!"));
        }
    }

    public List<EnderecoEntrega> recuperarTodosEnderecosEntregas() {
        return this.eem.recuperarTodos();
    }

    public EnderecoEntregaModel getEem() {
        return eem;
    }

    public void setEem(EnderecoEntregaModel eem) {
        this.eem = eem;
    }

    public EnderecoEntrega getEnderecoEntregaCadastro() {
        return enderecoEntregaCadastro;
    }

    public void setEnderecoEntregaCadastro(EnderecoEntrega enderecoEntregaCadastro) {
        this.enderecoEntregaCadastro = enderecoEntregaCadastro;
    }

    public EnderecoEntrega getSelectedEnderecoEntrega() {
        return selectedEnderecoEntrega;
    }

    public void setSelectedEnderecoEntrega(EnderecoEntrega selectedEnderecoEntrega) {
        this.selectedEnderecoEntrega = selectedEnderecoEntrega;
    }

    public EnderecoEntrega getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

}
