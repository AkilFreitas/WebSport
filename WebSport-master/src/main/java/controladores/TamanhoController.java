/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import infraestrutura.repositorio.comportamentos.RepositorioGenerico;
import infraestrutura.repositorio.implementacoes.repositorioImplBD.TamanhoImplBD;
import java.model.Tamanho;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author 20151D12GR0227
 */
@ManagedBean
@SessionScoped
public class TamanhoController {

    private RepositorioGenerico<Tamanho, Integer> repositorioTamanho = null;
    private Tamanho tamanhoCadastro;
    private Tamanho selectedTamanho;

    Tamanho tamnho = new Tamanho();

    public TamanhoController() {
        repositorioTamanho = new TamanhoImplBD();
        this.tamanhoCadastro = new Tamanho();

    }

    public void inserir() {

        this.repositorioTamanho.inserir(this.tamanhoCadastro);
        this.tamanhoCadastro = new Tamanho();

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O tamanho foi cadastrado com sucesso!"));
    }

    public void alterar(Tamanho t) {
        this.repositorioTamanho.alterar(t);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O tamanho foi alterado com sucesso!"));
    }

    public Tamanho recuperarTamanho(int id) {
        return this.repositorioTamanho.recuperar(id);
    }

    public void deletar(Tamanho t) {
        this.repositorioTamanho.deletar(t);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O tamanho foi deletado com sucesso!"));
    }

    public List<Tamanho> recuperarTodosTamanhos() {
        return this.repositorioTamanho.recuperarTodos();
    }

    public RepositorioGenerico<Tamanho, Integer> getRepositorioTamanho() {
        return repositorioTamanho;
    }

    public void setRepositorioTamanho(RepositorioGenerico<Tamanho, Integer> repositorioTamanho) {
        this.repositorioTamanho = repositorioTamanho;
    }

    public Tamanho getTamanhoCadastro() {
        return tamanhoCadastro;
    }

    public void setTamanhoCadastro(Tamanho tamanhoCadastro) {
        this.tamanhoCadastro = tamanhoCadastro;
    }

    public Tamanho getSelectedTamanho() {
        return selectedTamanho;
    }

    public void setSelectedTamanho(Tamanho selectedTamanho) {
        this.selectedTamanho = selectedTamanho;
    }

    public Tamanho getTamnho() {
        return tamnho;
    }

    public void setTamnho(Tamanho tamnho) {
        this.tamnho = tamnho;
    }

}
