/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import br.edu.ifpe.websport.model.ProdutoModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.model.entidades.Produto;

/**
 *
 * @author Val
 */
@ManagedBean
@SessionScoped
public class ProdutoController {

    ProdutoModel pm = new ProdutoModel();
    private Produto produtoCadastro;
    private Produto selectedProduto;

    Produto produto = new Produto();

    public ProdutoController() {
        this.produtoCadastro = new Produto();
    }

    public void inserir() {

        try {
            this.pm.inserir(this.produtoCadastro);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O produto foi cadastrado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O produto não foi cadastrado!"));
        }
    }

    public void alterar(Produto p) {
        try {
            this.pm.alterar(p);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O produto foi alterado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O produto não foi alterado!"));
        }
    }

    public Produto recuperarProduto(int id) {
        return this.pm.recuperarProduto(id);
    }

    public void deletar(Produto p) {
        try {
            this.pm.deletar(p);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O produto foi deletado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O produto não foi deletado!"));
        }

    }

    public List<Produto> recuperarTodosProdutos() {
        return this.pm.recuperarTodos();
    }

    public ProdutoModel getPm() {
        return pm;
    }

    public void setPm(ProdutoModel pm) {
        this.pm = pm;
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
