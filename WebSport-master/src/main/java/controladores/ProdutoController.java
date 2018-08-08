/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

/**
 *
 * @author Val
 */

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.ProdutoImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.Produto;


@ManagedBean
@SessionScoped
public class ProdutoController {
    
    private RepositorioGenerico<Produto,Integer> repositorioProduto = null;
    private Produto produtoCadastro;
    private Produto selectedProduto;
   
    Produto produto = new Produto();
    
    public ProdutoController(){
        this.repositorioProduto = new ProdutoImplBD();
        this.produtoCadastro = new Produto();
    }
    
    public void inserir(){
        
        this.repositorioProduto.inserir(this.produtoCadastro);
        this.produtoCadastro = new Produto();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O produto foi cadastrado com sucesso!"));
    }
    
    public void alterar(Produto c){
        this.repositorioProduto.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O produto foi alterado com sucesso!"));
    }
    
    public Produto recuperarProduto(int codigo){
        return this.repositorioProduto.recuperar(codigo);
    }
    
    public void deletar(Produto c){
        this.repositorioProduto.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O produto foi deletado com sucesso!"));
    }
    
    public List<Produto> recuperarTodosProdutos(){
        return this.repositorioProduto.recuperarTodos();
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

    public RepositorioGenerico<Produto,Integer> getRepositorioProduto() {
        return repositorioProduto;
    }

    public void setRepositorioProduto(RepositorioGenerico<Produto, Integer> repositorioProduto) {
        this.repositorioProduto= repositorioProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
