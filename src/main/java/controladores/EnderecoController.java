/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.EnderecoImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.Endereco;

/**
 *
 * @author Neto
 */
@ManagedBean
@SessionScoped
public class EnderecoController {

    private RepositorioGenerico<Endereco,Integer> repositorioEndereco = null;
    private Endereco enderecoCadastro;
    private Endereco selectedEndereco;
   
    Endereco endereco = new Endereco();
    
    public EnderecoController(){
        this.repositorioEndereco = new EnderecoImplBD();
        this.enderecoCadastro = new Endereco();
    }
    
    public void inserir(){
        
        this.repositorioEndereco.inserir(this.enderecoCadastro);
        this.enderecoCadastro = new Endereco();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O Endereço foi cadastrado com sucesso!"));
    }
    
    public void alterar(Endereco c){
        this.repositorioEndereco.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O Endereço foi alterado com sucesso!"));
    }
    
    public Endereco recuperarEndereco(int id){
        return this.repositorioEndereco.recuperar(id);
    }
    
    public void deletar(Endereco c){
        this.repositorioEndereco.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O Endereço foi deletado com sucesso!"));
    }
    
    public List<Endereco> recuperarTodosEnderecos(){
        return this.repositorioEndereco.recuperarTodos();
    }
}
