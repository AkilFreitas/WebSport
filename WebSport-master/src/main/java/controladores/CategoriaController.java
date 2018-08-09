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
import infraestrutura.repositorio.implementacoes.repositorioImplBD.CategoriaImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.Categoria;


@ManagedBean
@SessionScoped
public class CategoriaController {
    
    private RepositorioGenerico<Categoria,Integer> repositorioCategoria = null;
    private Categoria categoriaCadastro;
    private Categoria selectedCategoria;
   
    Categoria categoria = new Categoria();
    
    public CategoriaController(){
        this.repositorioCategoria = new CategoriaImplBD();
        this.categoriaCadastro = new Categoria();
    }
    
    public void inserir(){
        
        this.repositorioCategoria.inserir(this.categoriaCadastro);
        this.categoriaCadastro = new Categoria();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A categoria foi cadastrado com sucesso!"));
    }
    
    public void alterar(Categoria c){
        this.repositorioCategoria.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A categoria foi alterado com sucesso!"));
    }
    
    public Categoria recuperarCategoria(int codigo){
        return this.repositorioCategoria.recuperar(codigo);
    }
    
    public void deletar(Categoria c){
        this.repositorioCategoria.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","A categoria foi deletado com sucesso!"));
    }
    
    public List<Categoria> recuperarTodosCategorias(){
        return this.repositorioCategoria.recuperarTodos();
    }

    public Categoria getCategoriaCadastro() {
        return categoriaCadastro;
    }

    public void setCategoriaCadastro(Categoria categoriaCadastro) {
        this.categoriaCadastro = categoriaCadastro;
    }

    public Categoria getSelectedCategoria() {
        return selectedCategoria;
    }

    public void setSelectedCategoria(Categoria selectedCategoria) {
        this.selectedCategoria = selectedCategoria;
    }

    public RepositorioGenerico<Categoria,Integer> getRepositorioCategoria() {
        return repositorioCategoria;
    }

    public void setRepositorioCategoria(RepositorioGenerico<Categoria, Integer> repositorioCategoria) {
        this.repositorioCategoria= repositorioCategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
}