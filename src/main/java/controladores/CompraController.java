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
import infraestrutura.repositorio.implementacoes.repositorioImplBD.CompraImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.model.entidades.Compra;


@ManagedBean
@SessionScoped
public class CompraController {
    
    private RepositorioGenerico<Compra,Integer> repositorioCompra = null;
    private Compra compraCadastro;
    private Compra selectedCompra;
   
    Compra compra = new Compra();
    
    public CompraController(){
        this.repositorioCompra = new CompraImplBD();
        this.compraCadastro = new Compra();
    }
    
    public void inserir(){
        
        this.repositorioCompra.inserir(this.compraCadastro);
        this.compraCadastro = new Compra();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A compra foi cadastrado com sucesso!"));
    }
    
    public void alterar(Compra c){
        this.repositorioCompra.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A compra foi alterado com sucesso!"));
    }
    
    public Compra recuperarCompra(int codigo){
        return this.repositorioCompra.recuperar(codigo);
    }
    
    public void deletar(Compra c){
        this.repositorioCompra.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A compra foi deletado com sucesso!"));
    }
    
    public List<Compra> recuperarTodosCompras(){
        return this.repositorioCompra.recuperarTodos();
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

    public RepositorioGenerico<Compra,Integer> getRepositorioCompra() {
        return repositorioCompra;
    }

    public void setRepositorioCompra(RepositorioGenerico<Compra, Integer> repositorioCompra) {
        this.repositorioCompra= repositorioCompra;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    
    
}