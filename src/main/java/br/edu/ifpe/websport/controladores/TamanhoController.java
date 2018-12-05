package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.model.TamanhoModel;
import br.edu.ifpe.websport.model.entidades.Tamanho;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Val e Michael
 */
@ManagedBean
@SessionScoped
public class TamanhoController {

    TamanhoModel tm = new TamanhoModel();
    private Tamanho tamanhoCadastro;
    private Tamanho selectedTamanho;

    Tamanho tamanho = new Tamanho();

    public TamanhoController() {
        this.tamanhoCadastro = new Tamanho();
    }

    public void inserirAction() {

        try {
            this.tm.inserir(this.tamanhoCadastro);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O tamanho foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O tamanho não foi cadastrado!"));
        }

    }

    public void alterarAction(Tamanho c) {
        try {
            this.tm.alterar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O tamanho foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O tamanho não foi alterado!"));
        }

    }

    public Tamanho recuperarTamanho(int id) {
        return this.tm.recuperarTamanho(id);
    }

    public void deletarAction(Tamanho c) {
        try {
            this.tm.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O tamanho foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falfa!", "O tamanho não foi deletado!"));
        }
    }

    public List<Tamanho> recuperarTodosTamanhos() {
        return this.tm.recuperarTodos();
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

    public TamanhoModel getCm() {
        return tm;
    }

    public void setCm(TamanhoModel tm) {
        this.tm = tm;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

}
