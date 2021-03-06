/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.model.CompraModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.entidades.Compra;

/**
 *
 * @author Val e Michael
 */
@ManagedBean
@SessionScoped
public class CompraController {

    CompraModel cpm = new CompraModel();
    private Compra compraCadastro;
    private Compra selectedCompra;

    Compra compra = new Compra();

    public CompraController() {
        this.compraCadastro = new Compra();
    }

    public void inserirAction() {

        try {
            this.cpm.inserir(this.compraCadastro);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A compra foi cadastrado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A compra não foi cadastrado!"));
        }
        this.compraCadastro = new Compra();
    }

    public void alterarAction(Compra c) {
        try {
            this.cpm.alterar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A compra foi alterado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A compra não foi alterado!"));
        }
    }

    public Compra recuperarCompra(int id) {
        return this.cpm.recuperarCompra(id);
    }

    public void deletarAction(Compra c) {
        try {
            this.cpm.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A compra foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A compra não foi deletado!"));
        }
    }

    public List<Compra> recuperarTodasCompras() {
        return this.cpm.recuperarTodos();
    }

    public CompraModel getCm() {
        return cpm;
    }

    public void setCm(CompraModel cpm) {
        this.cpm = cpm;
    }

    public Compra getCompraCadastro() {
        return compraCadastro;
    }

    public void setCompraCadastro(Compra compraCadastro) {
        this.compraCadastro = compraCadastro;
    }

    public Compra getSelectedCompra() {
        return selectedCompra;
    }

    public void setSelectedCompra(Compra selectedCompra) {
        this.selectedCompra = selectedCompra;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

}
