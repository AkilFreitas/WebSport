/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.model.EnderecoModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.model.entidades.Endereco;

/**
 *
 * @author mayco
 */
@ManagedBean
@SessionScoped
public class EnderecoController {

    EnderecoModel em = new EnderecoModel();
    private Endereco enderecoCadastro;
    private Endereco selectedEndereco;

    Endereco endereco = new Endereco();

    public EnderecoController() {

        this.enderecoCadastro = new Endereco();
    }

    public String inserirAction() {

        try {
            this.em.inserir(this.enderecoCadastro);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O endereço foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            ex.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O endereço não foi cadastrada!"));
              Endereco endereco = new Endereco();
        }
        return "/menuTest.xhtml?faces-redirect=true";
    }

    public void alterarAction(Endereco e) {
        try {
            this.em.alterar(e);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O endereço foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O endereço não foi alterado!"));
        }

    }

    public Endereco recuperarEndereco(int id) {
        return this.em.recuperarEndereco(id);
    }

    public void deletarAction(Endereco c) {
        try {
            this.em.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O endereço foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O endereço não foi deletado!"));
        }
    }

    public List<Endereco> recuperarTodosEnderecos() {
        return this.em.recuperarTodos();
    }

    public EnderecoModel getEm() {
        return em;
    }

    public void setEm(EnderecoModel em) {
        this.em = em;
    }

    public Endereco getEnderecoCadastro() {
        return enderecoCadastro;
    }

    public void setEnderecoCadastro(Endereco enderecoCadastro) {
        this.enderecoCadastro = enderecoCadastro;
    }

    public Endereco getSelectedEndereco() {
        return selectedEndereco;
    }

    public void setSelectedEndereco(Endereco selectedEndereco) {
        this.selectedEndereco = selectedEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
