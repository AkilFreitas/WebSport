/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.EnderecoEntregaImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.model.EnderecoEntrega;

/**
 *
 * @author Neto
 */
@ManagedBean
@SessionScoped
public class EnderecoEntregaController {

    private RepositorioGenerico<EnderecoEntrega, Integer> repositorioEnderecoEntrega = null;
    private EnderecoEntrega enderecoEntregaCadastro;
    private EnderecoEntrega selectedEnderecoEntrega;

    EnderecoEntrega enderecoEntrega = new EnderecoEntrega();

    public EnderecoEntregaController() {
        this.repositorioEnderecoEntrega = new EnderecoEntregaImplBD();
        this.enderecoEntregaCadastro = new EnderecoEntrega();
    }

    public void inserir() {

        this.repositorioEnderecoEntrega.inserir(this.enderecoEntregaCadastro);
        this.enderecoEntregaCadastro = new EnderecoEntrega();

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O EnderecoEntrega foi cadastrado com sucesso!"));
    }

    public void alterar(EnderecoEntrega e) {
        this.repositorioEnderecoEntrega.alterar(e);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O EnderecoEntrega foi alterado com sucesso!"));
    }

    public EnderecoEntrega recuperarEnderecoEntrega(int id) {
        return this.repositorioEnderecoEntrega.recuperar(id);
    }

    public void deletar(EnderecoEntrega e) {
        this.repositorioEnderecoEntrega.deletar(e);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O EnderecoEntrega foi deletado com sucesso!"));
    }

    public List<EnderecoEntrega> recuperarTodosEnderecosEntregas() {
        return this.repositorioEnderecoEntrega.recuperarTodos();
    }

    public RepositorioGenerico<EnderecoEntrega, Integer> getRepositorioEnderecoEntrega() {
        return repositorioEnderecoEntrega;
    }

    public void setRepositorioEnderecoEntrega(RepositorioGenerico<EnderecoEntrega, Integer> repositorioEnderecoEntrega) {
        this.repositorioEnderecoEntrega = repositorioEnderecoEntrega;
    }

    public EnderecoEntrega getEnderecoEntregaCadastro() {
        return enderecoEntregaCadastro;
    }

    public void setEnderecoEntregaCadastro(EnderecoEntrega enderecoEntregaCadastro) {
        this.enderecoEntregaCadastro = enderecoEntregaCadastro;
    }

    public EnderecoEntrega getSelectedEnderecoEntrega() {
        return selectedEnderecoEntrega;
    }

    public void setSelectedEnderecoEntrega(EnderecoEntrega selectedEnderecoEntrega) {
        this.selectedEnderecoEntrega = selectedEnderecoEntrega;
    }

    public EnderecoEntrega getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(EnderecoEntrega enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

}
