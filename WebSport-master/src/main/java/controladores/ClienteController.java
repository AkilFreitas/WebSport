/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

/**
 *
 * @author Akil
 */
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.ClienteImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.Cliente;


@ManagedBean
@SessionScoped
public class ClienteController {
    
    private RepositorioGenerico<Cliente,Integer> repositorioCliente = null;
    private Cliente clienteCadastro;
    private Cliente selectedCliente;
   
    Cliente cliente = new Cliente();
    
    public ClienteController(){
        this.repositorioCliente = new ClienteImplBD();
        this.clienteCadastro = new Cliente();
    }
    
    public void inserir(){
        
        this.repositorioCliente.inserir(this.clienteCadastro);
        this.clienteCadastro = new Cliente();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O cliente foi cadastrado com sucesso!"));
    }
    
    public void alterar(Cliente c){
        this.repositorioCliente.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O cliente foi alterado com sucesso!"));
    }
    
    public Cliente recuperarCliente(int codigo){
        return this.repositorioCliente.recuperar(codigo);
    }
    
    public void deletar(Cliente c){
        this.repositorioCliente.deletar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"Sucesso!","O cliente foi deletado com sucesso!"));
    }
    
    public List<Cliente> recuperarTodosClientes(){
        return this.repositorioCliente.recuperarTodos();
    }

    public Cliente getClienteCadastro() {
        return clienteCadastro;
    }

    public void setClienteCadastro(Cliente clienteCadastro) {
        this.clienteCadastro = clienteCadastro;
    }

    public Cliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(Cliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public RepositorioGenerico<Cliente,Integer> getRepositorioCliente() {
        return repositorioCliente;
    }

    public void setRepositorioCliente(RepositorioGenerico<Cliente, Integer> repositorioCliente) {
        this.repositorioCliente= repositorioCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}