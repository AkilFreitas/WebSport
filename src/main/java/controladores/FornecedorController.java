/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import br.edu.ifpe.websport.model.FornecedorModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.model.entidades.Fornecedor;

/**
 *
 * @author Val e Michael
 */
@ManagedBean
@SessionScoped
public class FornecedorController {

    FornecedorModel fm = new FornecedorModel();
    private Fornecedor clienteCadastro;
    private Fornecedor selectedFornecedor;

    Fornecedor cliente = new Fornecedor();

    public FornecedorController() {
        this.clienteCadastro = new Fornecedor();
    }

    public void inserir() {

        try {
            this.fm.inserir(this.clienteCadastro);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O fornecedor foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O fornecedor não foi cadastrado!"));
        }
    }

    public void alterar(Fornecedor f) {
        try {
            this.fm.alterar(f);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O fornecedor foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O fornecedor não foi alterado!"));
        }
    }

    public Fornecedor recuperarFornecedor(int id) {
        return this.fm.recuperarFornecedor(id);
    }

    public void deletar(Fornecedor f) {
        try {
            this.fm.deletar(f);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O fornecedor foi deletado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O fornecedor não foi deletado!"));
        }

    }

    public List<Fornecedor> recuperarTodosFornecedors() {
        return this.fm.recuperarTodos();
    }

    public FornecedorModel getFm() {
        return fm;
    }

    public void setFm(FornecedorModel fm) {
        this.fm = fm;
    }

    public Fornecedor getClienteCadastro() {
        return clienteCadastro;
    }

    public void setClienteCadastro(Fornecedor clienteCadastro) {
        this.clienteCadastro = clienteCadastro;
    }

    public Fornecedor getSelectedFornecedor() {
        return selectedFornecedor;
    }

    public void setSelectedFornecedor(Fornecedor selectedFornecedor) {
        this.selectedFornecedor = selectedFornecedor;
    }

    public Fornecedor getCliente() {
        return cliente;
    }

    public void setCliente(Fornecedor cliente) {
        this.cliente = cliente;
    }

}
