/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.websport.controladores;

import br.edu.ifpe.websport.model.CategoriaModel;
import br.edu.ifpe.websport.entidades.Categoria;
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
public class CategoriaController {

    CategoriaModel ctm = new CategoriaModel();
    private Categoria categoriaCadastro;
    private Categoria selectedCategoria;

    Categoria categoria = new Categoria();

    public CategoriaController() {
        this.categoriaCadastro = new Categoria();
    }

    public void inserirAction() {

        try {
            this.ctm.inserir(this.categoriaCadastro);

            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi cadastrada!"));
        }
        Categoria categoria1;
        categoria1 = new Categoria();
    }

    public void alterarAction(Categoria c) {
        try {
            this.ctm.alterar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi alterada!"));
        }

    }

    public Categoria recuperarCategoria(int id) {
        return this.ctm.recuperarCategoria(id);
    }

    public void deletarAction(Categoria c) {
        try {
            this.ctm.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi deletado com sucesso!"));

        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi deletada!"));
        }
    }

    public List<Categoria> recuperarTodasCategorias() {
        return this.ctm.recuperarTodos();
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

    public CategoriaModel getCm() {
        return ctm;
    }

    public void setCm(CategoriaModel ctm) {
        this.ctm = ctm;
    }
  
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
