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
import infraestrutura.repositorio.implementacoes.repositorioImplBD.FornecedorImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.Fornecedor;


@ManagedBean
@SessionScoped
public class FornecedorController {
    
    private RepositorioGenerico<Fornecedor,Integer> repositorioFornecedor = null;
    private Fornecedor clienteCadastro;
    private Fornecedor selectedFornecedor;
   
    Fornecedor cliente = new Fornecedor();
    
    public FornecedorController(){
        this.repositorioFornecedor = new FornecedorImplBD();
        this.clienteCadastro = new Fornecedor();
    }
    
    public void inserir(){
        
        this.repositorioFornecedor.inserir(this.clienteCadastro);
        this.clienteCadastro = new Fornecedor();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O cliente foi cadastrado com sucesso!"));
    }
    
    public void alterar(Fornecedor c){
        this.repositorioFornecedor.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O cliente foi alterado com sucesso!"));
    }
    
    public Fornecedor recuperarFornecedor(int codigo){
        return this.repositorioFornecedor.recuperar(codigo);
    }
    
    public void deletar(Fornecedor c){
        this.repositorioFornecedor.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O cliente foi deletado com sucesso!"));
    }
    
    public List<Fornecedor> recuperarTodosFornecedors(){
        return this.repositorioFornecedor.recuperarTodos();
    }

    public Fornecedor getFornecedorCadastro() {
        return clienteCadastro;
    }

    public void setFornecedorCadastro(Fornecedor clienteCadastro) {
        this.clienteCadastro = clienteCadastro;
    }

    public Fornecedor getSelectedFornecedor() {
        return selectedFornecedor;
    }

    public void setSelectedFornecedor(Fornecedor selectedFornecedor) {
        this.selectedFornecedor = selectedFornecedor;
    }

    public RepositorioGenerico<Fornecedor,Integer> getRepositorioFornecedor() {
        return repositorioFornecedor;
    }

    public void setRepositorioFornecedor(RepositorioGenerico<Fornecedor, Integer> repositorioFornecedor) {
        this.repositorioFornecedor= repositorioFornecedor;
    }

    public Fornecedor getFornecedor() {
        return cliente;
    }

    public void setFornecedor(Fornecedor cliente) {
        this.cliente = cliente;
    }
    
    
}