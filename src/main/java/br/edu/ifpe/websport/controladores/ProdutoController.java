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
import java.util.ArrayList;

/**
 *
 * @author Val
 */
@ManagedBean
@SessionScoped
public class ProdutoController {

    ProdutoModel pdtm = new ProdutoModel();
    List <Produto> produtos;
    private Produto produtoCadastro;
    private Produto selectedProduto;
    private ArrayList<Produto> produtoscompra = new ArrayList<>();

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
            ex.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O produto não foi cadastrado!"));
        } finally {
            this.produtoCadastro = new Produto();
        }
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

    public String redCarrinho() {
        produtoscompra.add(selectedProduto);
        selectedProduto = null;
        return "carrinhoTest_1.xhtml?faces-redirect=true";
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

    public List getSelectedProdutos() {
        List p = new ArrayList();
        p.add(this.selectedProduto);

        return p;
    }

    public String buscarCamisa(String texto) {

        List<Produto> ps = this.pdtm.recuperarTodos();
        
        for (Produto p : ps) {
            if (p.getNome() != null) {
                boolean contem = p.getNome().contains(texto);
                if (contem == true) {
                    this.selectedProduto = p;
                }
            }
        }
        return "produtoCamisasIndividuais.xhtml?faces-redirect=true";
    }

    public ArrayList<Produto> getProdutoscompra() {
        return produtoscompra;
    }

    public void setProdutoscompra(ArrayList<Produto> produtoscompra) {
        this.produtoscompra = produtoscompra;
    }
}
