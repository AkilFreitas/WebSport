/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import br.edu.ifpe.websport.model.CategoriaModel;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.edu.ifpe.websport.model.entidades.Categoria;

/**
 *
 * @author Netinho
 */
@ManagedBean
@SessionScoped
public class CategoriaController {

    CategoriaModel ct = new CategoriaModel();
    private Categoria categoriaCadastro;
    private Categoria selectedCategoria;

    Categoria categoria = new Categoria();

    public CategoriaController() {
        this.categoriaCadastro = new Categoria();
    }

    public void inserirAction() {

        try {
            this.ct.inserir(this.categoriaCadastro);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi cadastrado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi cadastrado!"));
        }
    }

    public void alterarAction(Categoria c) {
        try {
            this.ct.alterar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "A categoria foi alterado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "A categoria não foi alterado!"));
        }
    }

    public Categoria recuperarCategoria(int id) {
        return this.ct.recuperarCategoria(id);
    }

    public void deletarAction(Categoria c) {
        try {
            this.ct.deletar(c);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "O categoria foi deletado com sucesso!"));
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Falha!", "O categoria não foi deletado!"));
        }

    }

    public List<Categoria> recuperarTodosCategoriaes() {
        return this.ct.recuperarTodos();
    }

    public CategoriaModel getFm() {
        return ct;
    }

    public void setFm(CategoriaModel ct) {
        this.ct = ct;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

   

}
