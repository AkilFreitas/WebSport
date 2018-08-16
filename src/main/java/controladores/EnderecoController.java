/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import br.edu.ifpe.websport.model.EnderecoModel;
import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.EnderecoImplBD;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.model.entidades.Endereco;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void inserirAction() {

        try {
            this.em.inserir(this.enderecoCadastro);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi cadastrada!"));
        }

    }

    public void alterarAction(Endereco e) {
        try {
            this.em.alterar(e);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O Endereço foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O Endereço não foi alterado!"));
        }

    }

    public Endereco recuperarEndereco(int id) {
        return this.em.recuperarEndereco(id);
    }

    public void deletarAction(Endereco c) {
        try {
            this.em.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O Endereço foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O Endereço não foi deletado!"));
        }
    }

    public List<Endereco> recuperarTodosEnderecos() {
        return this.em.recuperarTodos();
    }
}
