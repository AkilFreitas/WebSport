/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.model.ProdutoModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.entidades.Produto;

/**
 *
 * @author Val
 */
@ManagedBean
@SessionScoped
public class ProdutoController {

    ProdutoModel pdtm = new ProdutoModel();
    private Produto produtoCadastro;
    private Produto selectedProduto;

    Produto produto = new Produto();

    public ProdutoController() {
        this.produtoCadastro = new Produto();
    }

    public void inserirAction() {

        try {
            this.pdtm.inserir(this.produtoCadastro);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O produto foi cadastrado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O produto não foi cadastrado!"));
        }
        this.produtoCadastro = new Produto();
    }

    public void alterarAction(Produto p) {
        try {
            this.pdtm.alterar(p);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O produto foi alterado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O produto não foi alterado!"));
        }
    }

    public Produto recuperarProduto(int id) {
        return this.pdtm.recuperarProduto(id);
    }

    public void deletarAction(Produto p) {
        try {
            this.pdtm.deletar(p);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O produto foi deletado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O produto não foi deletado!"));
        }

    }

    public List<Produto> recuperarTodosProdutos() {
        return this.pdtm.recuperarTodos();
    }

    public ProdutoModel getPm() {
        return pdtm;
    }

    public void setPm(ProdutoModel pdtm) {
        this.pdtm = pdtm;
    }

    public Produto getProdutoCadastro() {
        return produtoCadastro;
    }

    public void setProdutoCadastro(Produto produtoCadastro) {
        this.produtoCadastro = produtoCadastro;
    }

    public Produto getSelectedProduto() {
        return selectedProduto;
    }

    public void setSelectedProduto(Produto selectedProduto) {
        this.selectedProduto = selectedProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
